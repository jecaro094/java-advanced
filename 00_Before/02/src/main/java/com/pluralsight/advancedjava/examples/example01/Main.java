package com.pluralsight.advancedjava.examples.example01;

public class Main {
    public static void main(String[] args){
        ProductRec rec = new ProductRec(0, "name", "Some description");
        System.out.println(rec.name());
    }
}
