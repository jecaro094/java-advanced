package com.pluralsight.advancedjava.examples.example09;

public class AdvancedGenericsExample09 {

    public static void main(String[] args) {
        var tree = new MaxValueInnerNode(new LeafNode(2), new MaxValueInnerNode(new LeafNode(3), new LeafNode(5)));
        System.out.println(tree.getValue());
    }
}
