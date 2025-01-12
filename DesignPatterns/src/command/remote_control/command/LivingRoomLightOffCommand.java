package command.remote_control.command;

import command.remote_control.receiver.Light;

public class LivingRoomLightOffCommand implements Command {
    
    private Light light;

    public LivingRoomLightOffCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.off();
    }
}
