/*
 * This code is part of the course "Java SE 17 Advanced Language Features" for Pluralsight.
 *
 * Copyright (C) 2022 by Jesper de Jong (jesper@jdj-it.com).
 */
package com.pluralsight.advancedjava.examples.example01;

import java.io.*;
import java.nio.charset.StandardCharsets;

/**
 * Example 1: Working with resources and handling exceptions without try-with-resources.
 */
public class TryWithResourcesExample01 {

    public static void removeEmptyLines(String inputFileName, String outputFileName) throws IOException {
        BufferedReader in = null;
        BufferedWriter out = null;

        try {
            in = new BufferedReader(new FileReader(inputFileName, StandardCharsets.UTF_8));
            out = new BufferedWriter(new FileWriter(outputFileName, StandardCharsets.UTF_8));

            // Copy all non-empty lines from input to output
            String line;
            while ((line = in.readLine()) != null) {
                if (!line.trim().isEmpty()) {
                    out.write(line);
                    out.write(System.lineSeparator());
                }
            }
        } finally {
            if (out != null) {
                try {
                    out.close();
                } catch (IOException e) {
                    System.err.println("Error while closing output file: " + e.getMessage());
                }
            }

            if (in != null) {
                try {
                    in.close();
                } catch (IOException e) {
                    System.err.println("Error while closing input file: " + e.getMessage());
                }
            }
        }
    }
}
