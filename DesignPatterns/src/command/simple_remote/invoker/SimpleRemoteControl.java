package command.simple_remote.invoker;

import command.simple_remote.command.Command;

/**
 * This is invoker. The Client calls setCommand() on invoker object and passes it
 * the Command Object, where it gets stored until is need.
 */
public class SimpleRemoteControl {
    private Command slot;

    public SimpleRemoteControl() {

    }
    public void setCommand(Command command) {
        slot = command;
    }

    public void buttonWasPressed() {
        slot.execute();
    }
}
