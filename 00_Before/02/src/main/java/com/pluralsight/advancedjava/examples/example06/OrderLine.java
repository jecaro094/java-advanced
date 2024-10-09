package com.pluralsight.advancedjava.examples.example06;

import java.math.BigDecimal;

import static com.pluralsight.advancedjava.examples.Validation.checkThat;

public record OrderLine(Product product, int quantity, BigDecimal price) {

    // TODO: Implement a compact constructor.

}
