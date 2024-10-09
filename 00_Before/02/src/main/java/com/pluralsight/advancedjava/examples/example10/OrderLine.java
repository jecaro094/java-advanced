package com.pluralsight.advancedjava.examples.example10;

import java.math.BigDecimal;

import static com.pluralsight.advancedjava.examples.Validation.checkThat;

public record OrderLine(Product product, int quantity, BigDecimal price) {

    public OrderLine {
        checkThat(product != null, "product must not be null");
        checkThat(price != null, "price must not be null");
    }

    // TODO: Add "wither" methods.

}
