package com.pluralsight.advancedjava.examples.example02;

// A non-generic class (it does not have type parameters itself) which extends a generic class.
// Note that in the 'extends' clause, we specify the concrete type Integer as the type argument.
public class IntegerSummingInnerNode extends InnerNode<Integer> {

    // TODO: Define the constructor of class IntegerSummingInnerNode.

    @Override
    public String toString() {
        return String.format("{[%s]: {%s, %s}}", getValue(), getLeft(), getRight());
    }
}
