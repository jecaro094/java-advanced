package com.pluralsight.advancedjava.examples.example01;

import static com.pluralsight.advancedjava.examples.Validation.checkThat;

public record Customer(long id, String name, String email) {

    public Customer {
        checkThat(name != null && !name.isBlank(), "name must not be null or blank");
        checkThat(email != null && !email.isBlank(), "email must not be null or blank");
    }
}
