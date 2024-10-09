package com.pluralsight.advancedjava.examples.example06;

import java.math.BigDecimal;
import java.util.List;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class LambdasExample06 {

    public static void main(String[] args) {
        var products = List.of(
                new Product(100123L, "Apples", new BigDecimal("2.25")),
                new Product(100578L, "Oranges", new BigDecimal("4.09")),
                new Product(100393L, "Cheese", new BigDecimal("6.99")),
                new Product(100346L, "Bread", new BigDecimal("3.49")));

        // TODO: Work with the four different types of lambda expressions.

    }

    static boolean isExpensive(Product product) {
        return product.price().compareTo(new BigDecimal("4.00")) >= 0;
    }
}

record Product(long id, String name, BigDecimal price) {}
