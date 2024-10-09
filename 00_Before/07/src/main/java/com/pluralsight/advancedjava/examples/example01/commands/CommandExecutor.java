package com.pluralsight.advancedjava.examples.example01.commands;

import com.pluralsight.advancedjava.examples.example01.SessionState;
import com.pluralsight.advancedjava.examples.example01.UserInput;

public interface CommandExecutor {

    void execute(SessionState sessionState, UserInput userInput);
}
