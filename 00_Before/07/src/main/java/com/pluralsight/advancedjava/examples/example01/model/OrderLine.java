package com.pluralsight.advancedjava.examples.example01.model;

import java.math.BigDecimal;

import static com.pluralsight.advancedjava.examples.Validation.checkThat;

public record OrderLine(Product product, int quantity, BigDecimal amount) {

    public OrderLine {
        checkThat(product != null, "product must not be null");
        checkThat(amount != null, "amount must not be null");
    }
}
