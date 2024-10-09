package com.pluralsight.advancedjava.examples.example09;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import static com.pluralsight.advancedjava.examples.Validation.checkThat;

public record Order(long id, Customer customer, LocalDateTime dateTime, List<OrderLine> lines) {

    public Order {
        checkThat(customer != null, "customer must not be null");
        checkThat(dateTime != null, "dateTime must not be null");
        checkThat(lines != null && !lines.isEmpty(), "lines must not be null or empty");

        lines = List.copyOf(lines);
    }

    // TODO: Add a static factory method to create a new Builder.

    // TODO: Add a static class Builder.

}
