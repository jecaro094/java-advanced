package com.pluralsight.advancedjava.examples.example06;

import java.util.Random;

public class AdvancedClassesExample06 {

    private final byte[] randomBytes;

    // TODO: Add an instance initializer block.

    public static void main(String[] args) {
        var obj = new AdvancedClassesExample06();
        for (byte b : obj.randomBytes) {
            System.out.printf("%02X ", b);
        }
        System.out.println();
    }
}
