package com.pluralsight.advancedjava.examples.example05;

import java.util.Comparator;
import java.util.List;

public class AdvancedGenericsExample05 {

    public static void main(String[] args) {
        var products = List.of(
                new Product(100346L, "Bread", "Whole-wheat loaf"),
                new Product(100252L, "Cheese", "Gouda cheese"),
                new Product(100123L, "Apples", "Tasty red apples"));

        var names = sortByIdAndExtractNames(products);
        System.out.println(names);
    }

    // TODO: Replace this by a generic method with a type parameter with multiple bounds.
    static List<String> sortByIdAndExtractNames(List<Product> list) {
        return list.stream().sorted(Comparator.comparing(Product::id)).map(Product::name).toList();
    }
}
