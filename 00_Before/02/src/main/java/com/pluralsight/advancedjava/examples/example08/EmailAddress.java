package com.pluralsight.advancedjava.examples.example08;

import java.util.regex.Pattern;

import static com.pluralsight.advancedjava.examples.Validation.checkThat;

// Domain-specific types such as EmailAddress can be reused wherever you need to work with an email address.
public record EmailAddress(String value) {

    // TODO: Implement this domain-specific type.

}
