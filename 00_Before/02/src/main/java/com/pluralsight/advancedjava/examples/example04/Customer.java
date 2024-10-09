package com.pluralsight.advancedjava.examples.example04;

public record Customer(long id, String name, String email) {

    // Overridden accessor method.
    @Override
    public String name() {
        return name != null && !name.isBlank() ? name : "anonymous";
    }

    // TODO: Override equals(), hashCode() and toString()

}
