package com.pluralsight.advancedjava.examples.example08;

import static com.pluralsight.advancedjava.examples.Validation.checkThat;

// TODO: By creating domain-specific types for the name, nickname and email address, they can be easily distinguished by their types.
public record Customer2(long id /* TODO: Add components */) {

    // TODO: The constructor can now leave logic such as validating the email address to the EmailAddress record.

}
