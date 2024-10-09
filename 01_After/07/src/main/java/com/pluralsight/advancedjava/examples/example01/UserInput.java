/*
 * This code is part of the course "Java SE 17 Advanced Language Features" for Pluralsight.
 *
 * Copyright (C) 2022 by Jesper de Jong (jesper@jdj-it.com).
 */
package com.pluralsight.advancedjava.examples.example01;

import java.util.Arrays;
import java.util.Scanner;

public record UserInput(String command, String[] arguments) {

    private static final String PROMPT = "> ";

    public static UserInput readUserInput(Scanner scanner) {
        String line = "";
        while (line.isEmpty()) {
            System.out.print(PROMPT);
            line = scanner.nextLine().trim();
        }

        String[] parts = line.split("\\s");
        return new UserInput(parts[0], Arrays.copyOfRange(parts, 1, parts.length));
    }
}
