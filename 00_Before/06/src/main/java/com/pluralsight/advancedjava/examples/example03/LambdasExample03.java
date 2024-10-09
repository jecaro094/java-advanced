package com.pluralsight.advancedjava.examples.example03;

import java.util.ArrayList;
import java.util.List;

public class LambdasExample03 {

    public static void main(String[] args) {
        var names = List.of("Joe Smith", "Susan Miller", "Will Johnson");

        var result1 = new ArrayList<String>();
        for (String name : names) {
            result1.add(name.toUpperCase());
        }
        System.out.println(result1);

        // TODO: Modifying the state of an object that comes from outside the lambda expression can be regarded as an antipattern.
        //  When you work with lambda expressions, keep functional programming principles in mind: avoid side effects.

    }
}
