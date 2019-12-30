package com.grpc.getAccountsClasses;

import com.example.demo.repository.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.15.0)",
    comments = "Source: test.proto")
public final class GRPCaccountGrpc {

  private GRPCaccountGrpc() {}

  public static final String SERVICE_NAME = "com.grpc.getAccountsClasses.GRPCaccount";


  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.grpc.getAccountsClasses.getAccountRequest,
      com.grpc.getAccountsClasses.AccountGRpc> getGetAccountsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getAccounts",
      requestType = com.grpc.getAccountsClasses.getAccountRequest.class,
      responseType = com.grpc.getAccountsClasses.AccountGRpc.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.grpc.getAccountsClasses.getAccountRequest,
      com.grpc.getAccountsClasses.AccountGRpc> getGetAccountsMethod() {
    io.grpc.MethodDescriptor<com.grpc.getAccountsClasses.getAccountRequest, com.grpc.getAccountsClasses.AccountGRpc> getGetAccountsMethod;
    if ((getGetAccountsMethod = GRPCaccountGrpc.getGetAccountsMethod) == null) {
      synchronized (GRPCaccountGrpc.class) {
        if ((getGetAccountsMethod = GRPCaccountGrpc.getGetAccountsMethod) == null) {
          GRPCaccountGrpc.getGetAccountsMethod = getGetAccountsMethod = 
              io.grpc.MethodDescriptor.<com.grpc.getAccountsClasses.getAccountRequest, com.grpc.getAccountsClasses.AccountGRpc>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "com.grpc.getAccountsClasses.GRPCaccount", "getAccounts"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.grpc.getAccountsClasses.getAccountRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.grpc.getAccountsClasses.AccountGRpc.getDefaultInstance()))
                  .setSchemaDescriptor(new GRPCaccountMethodDescriptorSupplier("getAccounts"))
                  .build();
          }
        }
     }
     return getGetAccountsMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static GRPCaccountStub newStub(io.grpc.Channel channel) {
    return new GRPCaccountStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static GRPCaccountBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new GRPCaccountBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static GRPCaccountFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new GRPCaccountFutureStub(channel);
  }

  /**
   */
  public static abstract class GRPCaccountImplBase implements io.grpc.BindableService {

    /**
     */

    public void getAccounts(com.grpc.getAccountsClasses.getAccountRequest request,
        io.grpc.stub.StreamObserver<com.grpc.getAccountsClasses.AccountGRpc> responseObserver) {
      asyncUnimplementedUnaryCall(getGetAccountsMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetAccountsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.grpc.getAccountsClasses.getAccountRequest,
                com.grpc.getAccountsClasses.AccountGRpc>(
                  this, METHODID_GET_ACCOUNTS)))
          .build();
    }
  }

  /**
   */
  public static final class GRPCaccountStub extends io.grpc.stub.AbstractStub<GRPCaccountStub> {
    private GRPCaccountStub(io.grpc.Channel channel) {
      super(channel);
    }

    private GRPCaccountStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected GRPCaccountStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new GRPCaccountStub(channel, callOptions);
    }

    /**
     */
    public void getAccounts(com.grpc.getAccountsClasses.getAccountRequest request,
        io.grpc.stub.StreamObserver<com.grpc.getAccountsClasses.AccountGRpc> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetAccountsMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class GRPCaccountBlockingStub extends io.grpc.stub.AbstractStub<GRPCaccountBlockingStub> {
    private GRPCaccountBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private GRPCaccountBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected GRPCaccountBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new GRPCaccountBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.grpc.getAccountsClasses.AccountGRpc getAccounts(com.grpc.getAccountsClasses.getAccountRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetAccountsMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class GRPCaccountFutureStub extends io.grpc.stub.AbstractStub<GRPCaccountFutureStub> {
    private GRPCaccountFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private GRPCaccountFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected GRPCaccountFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new GRPCaccountFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.grpc.getAccountsClasses.AccountGRpc> getAccounts(
        com.grpc.getAccountsClasses.getAccountRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetAccountsMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_ACCOUNTS = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final GRPCaccountImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(GRPCaccountImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_ACCOUNTS:
          serviceImpl.getAccounts((com.grpc.getAccountsClasses.getAccountRequest) request,
              (io.grpc.stub.StreamObserver<com.grpc.getAccountsClasses.AccountGRpc>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class GRPCaccountBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    GRPCaccountBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.grpc.getAccountsClasses.Test.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("GRPCaccount");
    }
  }

  private static final class GRPCaccountFileDescriptorSupplier
      extends GRPCaccountBaseDescriptorSupplier {
    GRPCaccountFileDescriptorSupplier() {}
  }

  private static final class GRPCaccountMethodDescriptorSupplier
      extends GRPCaccountBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    GRPCaccountMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (GRPCaccountGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new GRPCaccountFileDescriptorSupplier())
              .addMethod(getGetAccountsMethod())
              .build();
        }
      }
    }
    return result;
  }
}
