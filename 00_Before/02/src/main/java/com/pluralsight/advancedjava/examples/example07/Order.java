package com.pluralsight.advancedjava.examples.example07;

import java.time.LocalDateTime;
import java.util.List;

import static com.pluralsight.advancedjava.examples.Validation.checkThat;

public record Order(long id, Customer customer, LocalDateTime dateTime, List<OrderLine> lines) {

    // Compact constructor.
    public Order {
        checkThat(customer != null, "customer must not be null");
        checkThat(dateTime != null, "dateTime must not be null");
        checkThat(lines != null && !lines.isEmpty(), "lines must not be null or empty");

        lines = List.copyOf(lines); // Making an unmodifiable defensive copy of the argument (which might be a mutable List).
    }

    // TODO: An alternative to providing additional constructors is providing static factory methods. An advantage is that you can give these meaningful names.

}
