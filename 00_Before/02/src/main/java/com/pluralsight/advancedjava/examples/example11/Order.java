package com.pluralsight.advancedjava.examples.example11;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static com.pluralsight.advancedjava.examples.Validation.checkThat;

public record Order(long id, Customer customer, LocalDateTime dateTime, List<OrderLine> lines) {

    public Order {
        checkThat(customer != null, "customer must not be null");
        checkThat(dateTime != null, "dateTime must not be null");
        checkThat(lines != null, "lines must not be null");

        lines = List.copyOf(lines);
    }

    public Order(long id, Customer customer, LocalDateTime dateTime) {
        this(id, customer, dateTime, Collections.emptyList());
    }

    // TODO: Example of an inefficient "wither" method.

}
