package com.pluralsight.advancedjava.examples.example08;

public class RecordsExample08 {

    public static void main(String[] args) {
        // Because fullName, nickName and email are all strings, it's easy to make a mistake when creating a new instance of this record by passing
        // the arguments in the wrong order. The compiler cannot help you catch this mistake.
        var customer1 = new Customer1(500567L, "joes", "Joe", "Smith", "joe.smith@example.com");
        System.out.println(customer1);

        // By using specific types for the name, nickname and email address, it makes it really clear which is which, and it's hard to make a mistake
        // by passing arguments in the wrong order.

        // TODO: Create an instance of Customer2.

    }
}
