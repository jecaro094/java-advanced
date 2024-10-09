package com.pluralsight.advancedjava.examples.example06;

import java.util.ArrayList;
import java.util.List;

public class AdvancedGenericsExample06 {

    public static void main(String[] args) {
        // A List of Dogs.
        List<Dog> dogs = new ArrayList<>();
        dogs.add(new Dog("Daisy"));
        dogs.add(new Dog("Lucky"));

        // TODO: You cannot assign a List<Dog> to a variable of type List<Animal> because generic types such as List are invariant.

    }
}

interface Animal {}
record Dog(String name) implements Animal {}
record Cat(String name) implements Animal {}
