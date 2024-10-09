package com.pluralsight.advancedjava.examples.example01;

import com.pluralsight.advancedjava.examples.Product;

import java.math.BigDecimal;
import java.util.Optional;
import java.util.Random;

public class OptionalExample01 {

    private static final Random RANDOM = new Random();

    public static void main(String[] args) {
        // TODO: Work with the methods of class Optional.

    }

    // Method which returns null if the product was not found.
    private static Product getProductById(long productId) {
        for (Product product : Product.PRODUCTS) {
            if (product.id() == productId) {
                return product;
            }
        }

        return null; // No product with the specified product id
    }

    // Method which uses Optional.
    private static Optional<Product> findProductById(long productId) {
        // TODO: Implement this method

    }
}
