package command.simple_remote.command;

import command.simple_remote.receiver.GarageDoor;

/**
 * action and the receiver are bound together in the command object
 */
public class GarageDoorOpenCommand implements Command {
    private GarageDoor garageDoor;

    public GarageDoorOpenCommand(GarageDoor garageDoor) {
        this.garageDoor = garageDoor;
    }
    public void execute() {
        garageDoor.up();
    }
}
