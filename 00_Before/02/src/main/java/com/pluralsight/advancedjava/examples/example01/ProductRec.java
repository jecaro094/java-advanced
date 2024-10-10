package com.pluralsight.advancedjava.examples.example01;

public record ProductRec(long id, String name, String description) {

    @Override
    public String name(){
        return "Some different name";
    }

}
