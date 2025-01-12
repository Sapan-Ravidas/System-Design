package command.remote_control;

import command.remote_control.command.CeilingFanOffCommand;
import command.remote_control.command.CeilingFanOnCommand;
import command.remote_control.command.LightOffCommand;
import command.remote_control.command.LightOnCommand;
import command.remote_control.command.LivingRoomLightOffCommand;
import command.remote_control.command.LivingRoomLightOnCommand;
import command.remote_control.invoker.RemoteControl;
import command.remote_control.receiver.CeilingFan;
import command.remote_control.receiver.Light;

public class RemoteLoader {
    public static void main(String[] args) {
        RemoteControl remote = new RemoteControl();

        Light livingRommLight = new Light("Living Room");
        Light kitchenLight = new Light("Kitchen");
        CeilingFan ceilingFan = new CeilingFan("LivingRoom");

        LightOnCommand kitchenLightOnCommand = new LightOnCommand(kitchenLight);
        LightOffCommand kitcheLightOffCommand = new LightOffCommand(kitchenLight);
        LivingRoomLightOffCommand livingRoomLightOffCommand = new LivingRoomLightOffCommand(livingRommLight);
        LivingRoomLightOnCommand livingRoomLightOnCommand = new LivingRoomLightOnCommand(livingRommLight);
        CeilingFanOffCommand ceilingFanOffCommand = new CeilingFanOffCommand(ceilingFan);
        CeilingFanOnCommand ceilingFanOnCommand = new CeilingFanOnCommand(ceilingFan);

        remote.setCommand(0, livingRoomLightOnCommand, livingRoomLightOffCommand);
        remote.setCommand(1, ceilingFanOnCommand, ceilingFanOffCommand);
        remote.setCommand(2, kitchenLightOnCommand, kitcheLightOffCommand);

        System.out.println(remote);

        System.out.println();

        remote.onButtonPressed(0);
        remote.offButtonPressed(0);
        remote.onButtonPressed(1);
        remote.offButtonPressed(1);
        remote.onButtonPressed(2);
        remote.offButtonPressed(2);
    }
}
