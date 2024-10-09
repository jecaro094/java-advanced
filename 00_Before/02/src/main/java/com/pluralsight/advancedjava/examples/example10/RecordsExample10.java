package com.pluralsight.advancedjava.examples.example10;

import java.math.BigDecimal;

public class RecordsExample10 {

    public static void main(String[] args) {
        var product = new Product(100123L, "Apples", "Tasty red apples");

        var line = new OrderLine(product, 6, new BigDecimal("5.94"));

        // You can of course not modify the fields of an immutable object. When you need a modified version of an immutable object, you need to make a copy
        // of the object with a different value for the field that you want to change. That can be a bit cumbersome.
        var newLine1 = new OrderLine(line.product(), line.quantity(), new BigDecimal("5.34"));

        // TODO: Call the "wither" methods on an OrderLine.

    }
}
