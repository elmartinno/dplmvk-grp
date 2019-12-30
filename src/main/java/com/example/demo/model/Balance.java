package com.example.demo.model;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Balance {
    private String value;
    private String precision;

    public String getValue() {
        return value;
    }

    public String getPrecision() {
        return precision;
    }

    public String getCurrency() {
        return currency;
    }

    private String currency;
}
