package com.pluralsight.advancedjava.examples.example07;

import java.math.BigDecimal;

import static com.pluralsight.advancedjava.examples.Validation.checkThat;

public record OrderLine(Product product, int quantity, BigDecimal price) {

    // Compact constructor.
    public OrderLine {
        checkThat(product != null, "product must not be null");
        checkThat(price != null, "price must not be null");
    }
}
