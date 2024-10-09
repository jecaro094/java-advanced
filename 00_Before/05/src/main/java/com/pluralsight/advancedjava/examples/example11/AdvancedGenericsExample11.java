package com.pluralsight.advancedjava.examples.example11;

import java.util.ArrayList;
import java.util.List;

public class AdvancedGenericsExample11 {

    public static void main(String[] args) {
        // A List of Dogs.
        List<Dog> dogs = new ArrayList<>();
        dogs.add(new Dog("Daisy"));
        dogs.add(new Dog("Lucky"));

        // Assigning this to a variable of the wildcard parameterized type List<? extends Animal> is OK.
        // We now have a List that contains objects of some unknown type that extends Animal.
        List<? extends Animal> animals = dogs;

        // TODO: Because of type erasure, the JVM cannot check at runtime that a cast to a parameterized type is safe.
        //  Therefore you get an "unchecked cast" warning. Such a cast can lead to heap pollution.

    }
}

interface Animal {}
record Dog(String name) implements Animal {}
record Cat(String name) implements Animal {}
