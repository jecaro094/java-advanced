package com.pluralsight.advancedjava.examples.example06;

import java.time.LocalDateTime;
import java.util.List;

import static com.pluralsight.advancedjava.examples.Validation.checkThat;

public record Order(long id, Customer customer, LocalDateTime dateTime, List<OrderLine> lines) {

    // TODO: Implement a compact constructor; make a defensive copy of the list of order lines.

}
