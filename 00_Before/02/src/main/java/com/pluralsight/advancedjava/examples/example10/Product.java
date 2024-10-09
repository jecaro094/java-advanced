package com.pluralsight.advancedjava.examples.example10;

import static com.pluralsight.advancedjava.examples.Validation.checkThat;

public record Product(long id, String name, String description) {

    public Product {
        checkThat(name != null && !name.isBlank(), "name must not be null or blank");
    }
}
