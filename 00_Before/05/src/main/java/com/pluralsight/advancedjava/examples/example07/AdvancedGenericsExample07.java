package com.pluralsight.advancedjava.examples.example07;

import java.util.ArrayList;
import java.util.List;

public class AdvancedGenericsExample07 {

    public static void main(String[] args) {
        List<Dog> dogs = new ArrayList<>();
        dogs.add(new Dog("Daisy"));
        dogs.add(new Dog("Lucky"));

        // TODO: You can assign a List<Dog> to a List<? extends Animal>.
        //  But you cannot add objects to such a list, because the type that the wildcard stands for, is unknown.

    }
}

interface Animal {}
record Dog(String name) implements Animal {}
record Cat(String name) implements Animal {}
