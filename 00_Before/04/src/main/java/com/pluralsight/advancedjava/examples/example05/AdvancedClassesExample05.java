package com.pluralsight.advancedjava.examples.example05;

import java.io.IOException;
import java.util.Properties;

public class AdvancedClassesExample05 {

    private static final Properties CONFIGURATION = new Properties();

    // TODO: Add a static initializer block to load configuration properties.

    public static void main(String[] args) {
        System.out.println(CONFIGURATION.getProperty("message"));
    }
}
