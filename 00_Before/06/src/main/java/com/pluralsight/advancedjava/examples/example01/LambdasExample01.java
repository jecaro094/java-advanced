package com.pluralsight.advancedjava.examples.example01;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class LambdasExample01 {

    public static void main(String[] args) {
        var names = new ArrayList<>(List.of("Joe", "Susan", "John", "Louise"));

        // Sorting the list of names by length using an anonymous class.
        // We need six lines of code, but most of it is "plumbing" code.
        names.sort(new Comparator<String>() {
            @Override
            public int compare(String first, String second) {
                return Integer.compare(first.length(), second.length());
            }
        });

        // TODO: Use a lambda expression instead of an anonymous class.

        System.out.println(names);
    }
}
