package com.pluralsight.advancedjava.examples.example09;

public class MaxValueInnerNode implements TreeNode {

    private final TreeNode left, right;

    public MaxValueInnerNode(TreeNode left, TreeNode right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public Comparable getValue() {
        var leftValue = left.getValue();
        var rightValue = right.getValue();

        var result = leftValue.compareTo(rightValue);

        // Return whichever value was largest.
        return result >= 0 ? leftValue : rightValue;
    }

    @Override
    public TreeNode getLeft() {
        return left;
    }

    @Override
    public TreeNode getRight() {
        return right;
    }

    @Override
    public String toString() {
        return String.format("{%s, %s}", left, right);
    }
}
