package com.pluralsight.advancedjava.examples.example05;

import com.pluralsight.advancedjava.examples.ExampleCloseThrowsResource;
import com.pluralsight.advancedjava.examples.ExampleResource;

public class TryWithResourcesExample05 {

    public static void main(String[] args) {
        // TODO: Run this, notice the suppressed exceptions.

        // When an exception occurs while closing a resource after a previous exception has been thrown,
        // the exception that happens while closing the resource will be suppressed.
        try (var r1 = new ExampleResource("1"); var r2 = new ExampleCloseThrowsResource("2")) {
            System.out.println("Inside the try-block");
            throw new Exception("Exception thrown in try-block");
        } catch (Exception e) {
            System.out.println("Inside the catch-block");
            e.printStackTrace(System.out); // Prints suppressed exceptions as well

            // You can get the suppressed exceptions if you need more information about them.
            Throwable[] suppressed = e.getSuppressed();
        }
    }
}
