package com.pluralsight.advancedjava.examples.example01;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

public class SealedExample01 {

    public static void main(String[] args) {
        var customer = new Customer(500567L, "Joe Smith", "joe.smith@example.com");
        var product = new Product(100123L, "Apples", "Tasty red apples");

        // TODO: Create an order with a SaleOrderLine and a DiscountOrderLine.

        // TODO: Call the OrderService to calculate the total amount of the order.

    }
}
