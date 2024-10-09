package com.pluralsight.advancedjava.examples.example05;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;

public class RecordsExample05 {

    public static void main(String[] args) {
        var product1 = new Product(100123L, "Apples", "Tasty red apples");
        var product2 = new Product(100346L, "Bread", "Whole-wheat loaf");

        var customer = new Customer(500567L, "Joe Smith", "joe.smith@example.com");

        var lines = new ArrayList<OrderLine>();
        lines.add(new OrderLine(product1, 6, new BigDecimal("5.94")));
        lines.add(new OrderLine(product2, 2, new BigDecimal("2.50")));

        // TODO: Create a new order, passing it a mutable ArrayList of order lines.

        // TODO: Adding an order line to the list after creating the order will not modify the order, because its constructor has made a copy of the list.

        // TODO: Getting the list of order lines from the order and adding an element to it will cause an UnsupportedOperationException because the copy
        // of the list that the Order object holds is unmodifiable.

    }
}
