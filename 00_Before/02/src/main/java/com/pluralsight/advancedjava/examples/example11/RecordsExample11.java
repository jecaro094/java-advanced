package com.pluralsight.advancedjava.examples.example11;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class RecordsExample11 {

    public static void main(String[] args) {
        var product1 = new Product(100123L, "Apples", "Tasty red apples");
        var product2 = new Product(100346L, "Bread", "Whole-wheat loaf");

        var customer = new Customer(500567L, "Joe Smith", "joe.smith@example.com");

        // TODO: Crate an Order using the inefficient "withLine" method. Beware what happens when you do this!

    }
}
