package command.undo.command;

import command.undo.receiver.Light;

public class LightOffCommand implements Command {
    private Light light;
    private int level;

    public LightOffCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        level = light.getLevel();
        light.off();
    }

    @Override
    public void undo() {
        light.dim(level);
    }
}
