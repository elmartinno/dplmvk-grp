package com.example.demo.Controllers;

import com.example.demo.Services.AccountService;
import com.example.demo.model.Account;
import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import net.devh.boot.grpc.server.service.GrpcService;
import org.bson.Document;
import com.grpc.getAccountsClasses.BalanceGRpc;
import com.grpc.getAccountsClasses.GRPCaccountGrpc;
import com.grpc.getAccountsClasses.getAccountRequest;
import com.grpc.getAccountsClasses.AccountGRpc;
import io.grpc.stub.StreamObserver;
import org.springframework.beans.factory.annotation.Autowired;


@GrpcService
public class AccountGRPCController extends GRPCaccountGrpc.GRPCaccountImplBase {

    ////pre Prod app: treba zmenit import mongoclienta a odkomentovat:
    MongoClientURI uriDB = new MongoClientURI("mongodb://user3UQ:3JllWgKjDl8MJXQx@mongodb/sampledb");
    private MongoClient mongoClient = new MongoClient(uriDB);
    private MongoDatabase mongoDatabase = mongoClient.getDatabase("sampledb");
    private MongoCollection<Document> mongoCollection = mongoDatabase.getCollection("accounts");

    ////pre Dev app:
    //private MongoClient mongoClient = MongoClients.create("mongodb://localhost:27017");
    //private MongoDatabase mongoDatabase = mongoClient.getDatabase("transparent_accounts");
    //private MongoCollection<Document> mongoCollection = mongoDatabase.getCollection("accounts");

    @Autowired
    private AccountService accountService;

    @Override
    public void getAccounts(getAccountRequest request, StreamObserver<AccountGRpc> responseObserver) {

       // List<Account> a =accountService.getTests();
        responseObserver.onNext(DocumentToAccountGRPC(mongoCollection.find().first()));

        responseObserver.onCompleted();
    }

    public AccountGRpc AccountToAccountGRPC(Account myData){
        AccountGRpc response = AccountGRpc.newBuilder()
                .setId(myData.get_id().toString())
                .setBalance(BalanceGRpc.newBuilder()
                        .setValue(myData.getBalance().getValue())
                        .setPrecision(myData.getBalance().getPrecision())
                        .setCurrency(myData.getBalance().getCurrency())
                        .build())
                .setCreated(myData.getCreated())
                .setUpdate(myData.getUpdate())
                .setIban(myData.getIban())
                .setPublished(myData.getPublished())
                .setHidden(myData.getHidden())
                .build();
        return response;
    }
    public AccountGRpc DocumentToAccountGRPC(Document myData){
        Document d =(Document) myData.get("balance");
        AccountGRpc response = AccountGRpc.newBuilder()
                .setId(myData.get("_id").toString())
                .setBalance(BalanceGRpc.newBuilder()
                        .setValue( d.get("value").toString())
                        .setPrecision(d.get("precision").toString())//(String) myData.get("balance"))
                        .setCurrency( d.get("currency").toString())//(String) myData.get("balance"))
                        .build())
                .setCreated((String) myData.get("created"))
                .setUpdate((String) myData.get("updated"))
                .setIban((String) myData.get("iban"))
                .setPublished((String) myData.get("published"))
                .setHidden(myData.get("hidden").toString())
                .build();
        return response;
    }
}
