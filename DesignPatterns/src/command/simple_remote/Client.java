package command.simple_remote;

import command.simple_remote.command.Command;
import command.simple_remote.command.GarageDoorOpenCommand;
import command.simple_remote.command.LightOnCommand;
import command.simple_remote.invoker.SimpleRemoteControl;
import command.simple_remote.receiver.GarageDoor;
import command.simple_remote.receiver.Light;

public class Client {
    public static void main(String[] args) {
        SimpleRemoteControl remote = new SimpleRemoteControl(); /* invoker */
        Light light = new Light(); /* receiver */
        GarageDoor garageDoor = new GarageDoor(); /* receiver */

        Command lightCommand = new LightOnCommand(light); /* command */
        Command garageOpeCommand = new GarageDoorOpenCommand(garageDoor);

        remote.setCommand(lightCommand);
        remote.buttonWasPressed(); /* client asks invoker to execute the command */

        remote.setCommand(garageOpeCommand);
        remote.buttonWasPressed();
    }
}
