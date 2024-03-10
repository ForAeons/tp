package seedu.address.logic.parser;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import seedu.address.logic.commands.FooCommand;

class FooCommandParserTest {

    @Test
    void parse() {
        assertEquals(new FooCommandParser().parse("   ").getClass(), FooCommand.class);
    }
}
