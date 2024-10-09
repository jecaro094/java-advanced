package com.pluralsight.advancedjava.examples.example01;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class TryWithResourcesExample01 {

    public static void removeEmptyLines(String inputFileName, String outputFileName) throws IOException {
        // TODO: This code does not always close the input and output files in case an exception occurs.
        //  Add appropriate error handling code.

        BufferedReader in = new BufferedReader(new FileReader(inputFileName, StandardCharsets.UTF_8));
        BufferedWriter out = new BufferedWriter(new FileWriter(outputFileName, StandardCharsets.UTF_8));

        // Copy all non-empty lines from input to output
        String line;
        while ((line = in.readLine()) != null) {
            if (!line.trim().isEmpty()) {
                out.write(line);
                out.write(System.lineSeparator());
            }
        }

        out.close();
        in.close();
    }
}
}
