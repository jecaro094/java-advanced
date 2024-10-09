package com.pluralsight.advancedjava.examples.example04;

import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.List;

public class LambdasExample04 {

    public static void main(String[] args) {
        var names = List.of("Joe Smith", "Susan Miller", "Will Johnson");

        try (FileWriter out = new FileWriter("names.txt", StandardCharsets.UTF_8)) {
            for (String name : names) {
                out.write(name + "\n");
            }

            // TODO: When you do this with 'forEach' and a lambda expression, you'll have to deal with the exception inside the lambda expression.

        } catch (IOException | RuntimeException e) {
            System.err.println("An error occurred: " + e.getMessage());
        }
    }
}
