package com.pluralsight.advancedjava.examples.example02;

import java.util.List;

public class LambdasExample02 {

    public static void main(String[] args) {
        var names = List.of("Joe Smith", "Susan Miller", "Will Johnson");

        // A regular for-loop.
        var count = 0;
        for (String name : names) {
            System.out.println(++count + ": " + name);
        }

        // TODO: In a lambda expression, you cannot modify the variable 'count', because captured variables must be effectively final.

    }
}
