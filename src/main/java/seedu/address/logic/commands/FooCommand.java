package seedu.address.logic.commands;

import seedu.address.model.Model;

/**
 * Tutorial command
 */
public class FooCommand extends Command {
    public static final String COMMAND_WORD = "foo";
    public static final String MESSAGE_USAGE = COMMAND_WORD + ": Does something.\n"
        + "Example: " + COMMAND_WORD;

    public static final String MESSAGE_SUCCESS = "Done something.";

    @Override
    public CommandResult execute(Model model) {
        return new CommandResult(MESSAGE_SUCCESS);
    }

    @Override
    public boolean equals(Object other) {
        return (other instanceof FooCommand); // instanceof handles null
    }

    @Override
    public String toString() {
        return "FooCommand";
    }
}
