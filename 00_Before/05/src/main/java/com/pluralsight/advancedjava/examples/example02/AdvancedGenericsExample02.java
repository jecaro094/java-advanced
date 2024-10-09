package com.pluralsight.advancedjava.examples.example02;

public class AdvancedGenericsExample02 {

    public static void main(String[] args) {
        var tree = new IntegerSummingInnerNode(new LeafNode<>(2), new IntegerSummingInnerNode(new LeafNode<>(3), new LeafNode<>(5)));
        System.out.println(tree);
    }
}
