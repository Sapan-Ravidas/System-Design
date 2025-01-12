package command.undo.command;

import command.undo.receiver.Light;

public class LightOnCommand implements Command{
    private Light light;
    private int level;

    public LightOnCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        level = light.getLevel();
        light.on();
    }

    @Override
    public void undo() {
        light.dim(level);
    }

}
