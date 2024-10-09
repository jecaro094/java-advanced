package com.pluralsight.advancedjava.examples.example12;

public class AdvancedGenericsExample12 {

    public static void main(String[] args) {
        // Creating an array of a non-reifiable type is not allowed.
        // The compiler gives you an error that's not very informative: "generic array creation".
        // Pair<Integer, String>[] pairs = new Pair<Integer, String>[10];

        // An array of dogs.
        Dog[] dogs = new Dog[2];
        dogs[0] = new Dog("Daisy");
        dogs[1] = new Dog("Lucky");

        // TODO: Arrays are covariant (different from generic types, which are invariant).
        //  This lets you do strange things which might lead to an ArrayStoreException.
        //  The combination of covariance and type erasure makes arrays and generics not work well together.

    }
}

record Pair<T, U>(T first, U second) {}

interface Animal {}
record Dog(String name) implements Animal {}
record Cat(String name) implements Animal {}
