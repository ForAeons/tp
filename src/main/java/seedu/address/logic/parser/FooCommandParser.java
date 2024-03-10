package seedu.address.logic.parser;

import seedu.address.logic.commands.FooCommand;

/**
 * Parses input arguments and creates a new FooCommand object
 */
public class FooCommandParser implements Parser<FooCommand> {
    public FooCommand parse(String args) {
        return new FooCommand();
    }
}
