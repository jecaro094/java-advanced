package com.pluralsight.advancedjava.examples.example05;

import java.time.LocalDateTime;
import java.util.List;

import static com.pluralsight.advancedjava.examples.Validation.checkThat;

public record Order(long id, Customer customer, LocalDateTime dateTime, List<OrderLine> lines) {

    // TODO: You can implement the canonical constructor yourself, for example to validate arguments or make defensive copies of mutable arguments.

}
