package com.pluralsight.advancedjava.examples.example13;

import java.util.HashMap;
import java.util.Map;

public class AdvancedGenericsExample13 {

    public static void main(String[] args) {
        // TODO: Work with generics and variable arguments.
        //  Because variable arguments are really just arrays, you'll have the same issues with the combination of generics and varargs
        //  as you'll have with generics and arrays.

    }
}

record Pair<T, U>(T first, U second) {}
