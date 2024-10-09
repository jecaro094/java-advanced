package com.pluralsight.advancedjava.examples.example10;

import java.util.ArrayList;
import java.util.List;

public class AdvancedGenericsExample10 {

    public static void main(String[] args) {
        // A List of Dogs, but the variable "dogs" is of the raw type List.
        List dogs = new ArrayList<Dog>();
        dogs.add(new Dog("Daisy"));
        dogs.add(new Dog("Lucky"));

        // TODO: Raw types allow you to do things which are normally not possible, which can lead to heap pollution.
        //  Heap pollution is when a variable of a parameterized type really refers to an object of a different type.
        //  For example, a List<Cat> that really refers to a List<Dog>.

    }
}

interface Animal {}
record Dog(String name) implements Animal {}
record Cat(String name) implements Animal {}
