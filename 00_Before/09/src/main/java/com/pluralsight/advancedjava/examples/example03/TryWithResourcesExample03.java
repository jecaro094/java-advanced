package com.pluralsight.advancedjava.examples.example03;

import com.pluralsight.advancedjava.examples.ExampleResource;

public class TryWithResourcesExample03 {

    public static void main(String[] args) {
        // TODO: Run this and see exactly in which order things happen.

        // Resources are initialized in the order they are declared and closed in the opposite order.
        try (var r1 = new ExampleResource("1"); var r2 = new ExampleResource("2")) {
            System.out.println("Inside the try-block");
        }
    }
}
