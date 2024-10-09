package com.pluralsight.advancedjava.examples.example07;

import static com.pluralsight.advancedjava.examples.Validation.checkThat;

public record Product(long id, String name, String description) {

    // Compact constructor.
    public Product {
        checkThat(name != null && !name.isBlank(), "name must not be null or blank");
    }

    // TODO: You can provide additional constructors. Additional constructors in records are required to have a call to another constructor (using "this(...);")
    // as their first statement. This ensures that the canonical constructor is always called.

}
