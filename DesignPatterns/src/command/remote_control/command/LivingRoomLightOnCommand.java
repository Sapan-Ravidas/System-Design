package command.remote_control.command;

import command.remote_control.receiver.Light;

public class LivingRoomLightOnCommand implements Command {

    private Light light;

    public LivingRoomLightOnCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.on();
    }
    
}
