package com.pluralsight.advancedjava.examples.example04;

import com.pluralsight.advancedjava.examples.ExampleResource;

public class TryWithResourcesExample04 {

    public static void main(String[] args) {
        // TODO: Run this and notice that resources are closed before the catch block is executed.

        // When an exception occurs (whether it's in the try-block or when initializing resources),
        // the resources that have been successfully initialized are closed before the catch-block is executed.
        try (var r1 = new ExampleResource("1"); var r2 = new ExampleResource("2")) {
            System.out.println("Inside the try-block");
            throw new Exception("Exception thrown in try-block");
        } catch (Exception e) {
            System.out.println("Inside the catch-block");
            e.printStackTrace(System.out);
        }
    }
}
