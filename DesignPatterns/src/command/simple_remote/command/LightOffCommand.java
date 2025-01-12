package command.simple_remote.command;

import command.simple_remote.receiver.Light;

/**
 * action and the receiver are bound together in the command object
 */
public class LightOffCommand implements Command {
    private Light light;
    
    public LightOffCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.off();
    }

    
}
