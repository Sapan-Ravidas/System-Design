package command.undo.command;

import command.undo.receiver.Light;

public class DimmerLightOnCommand implements Command {
    private Light light;
    private int prevLevel;

    public DimmerLightOnCommand(Light light) {
        this.light = light;
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
