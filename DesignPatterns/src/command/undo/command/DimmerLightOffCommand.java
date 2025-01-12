package command.undo.command;

import command.undo.receiver.Light;

public class DimmerLightOffCommand implements Command {
    private Light light;
    private int prevLevel;

    public DimmerLightOffCommand(Light light) {
        this.light = light;
        prevLevel = 100;
    }

    @Override
    public void execute() {
        prevLevel = light.getLevel();
        light.on();
    }

    @Override
    public void undo() {
        light.dim(prevLevel);
    }
}
