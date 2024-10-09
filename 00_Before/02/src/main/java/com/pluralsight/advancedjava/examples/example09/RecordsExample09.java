package com.pluralsight.advancedjava.examples.example09;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

public class RecordsExample09 {

    public static void main(String[] args) {
        var product1 = new Product(100123L, "Apples", "Tasty red apples");
        var product2 = new Product(100346L, "Bread", "Whole-wheat loaf");

        var customer = new Customer(500567L, "Joe Smith", "joe.smith@example.com");

        // When you create a new Order object, you have to remember which argument is which and when you read a statement like this, it's not always
        // immediately clear what the arguments mean.
        var order1 = new Order(200201L, customer, LocalDateTime.now(), List.of(
                new OrderLine(product1, 6, new BigDecimal("5.94")),
                new OrderLine(product2, 2, new BigDecimal("2.50"))));

        // TODO: By using a builder and supplying the arguments through the fluent interface of the builder, it is immediately clear
        //  what the argument values mean.

    }
}
