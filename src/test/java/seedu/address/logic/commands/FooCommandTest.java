package seedu.address.logic.commands;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class FooCommandTest {

    @Test
    void execute() {
        CommandResult expectedCommandResult = new CommandResult(FooCommand.MESSAGE_SUCCESS);
        assertEquals(expectedCommandResult, new FooCommand().execute(null));
    }

    @Test
    void testEquals() {
        FooCommand fooCommand = new FooCommand();
        FooCommand fooCommand2 = new FooCommand();
        assertEquals(fooCommand, fooCommand2);
    }

    @Test
    void testToString() {
        assertEquals("FooCommand", new FooCommand().toString());
    }
}
