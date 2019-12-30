package com.example.demo.model;

import lombok.*;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "accounts")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Account {
    @Id
    private ObjectId _id;
    private String created;

    public String getCreated() {
        return created;
    }

    public String getUpdate() {
        return update;
    }

    public String getIban() {
        return iban;
    }

    public Balance getBalance() {
        return balance;
    }

    public String getPublished() {
        return published;
    }

    public String getHidden() {
        return hidden;
    }

    public ObjectId get_id() {
        return _id;
    }

    private String update;
    private String iban;
    private Balance balance;
    private String published;
    private String hidden;
}
