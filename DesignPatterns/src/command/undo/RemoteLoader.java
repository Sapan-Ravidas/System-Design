package command.undo;

import command.undo.receiver.CeilingFan;
import command.undo.command.CeilingFanHighCommand;
import command.undo.command.CeilingFanMediumCommand;
import command.undo.command.CeilingFanOffCommand;
import command.undo.command.LightOffCommand;
import command.undo.command.LightOnCommand;
import command.undo.invoker.RemoteControl;
import command.undo.receiver.Light;

public class RemoteLoader {
    public static void main(String[] args) {
        RemoteControl remoteControl = new RemoteControl();

        Light livingRoomLight = new Light("living room");
    
        LightOnCommand livingRoomLightOn = new LightOnCommand(livingRoomLight);
        LightOffCommand livingRoomLightOff = new LightOffCommand(livingRoomLight);

        remoteControl.setCommand(0, livingRoomLightOn, livingRoomLightOff);

        CeilingFan ceilingFan = new CeilingFan("living room");

        CeilingFanMediumCommand ceilingFanMedium = new CeilingFanMediumCommand(ceilingFan);
        CeilingFanHighCommand ceilingFanHigh = new CeilingFanHighCommand(ceilingFan);
        CeilingFanOffCommand ceilingOffCommand = new CeilingFanOffCommand(ceilingFan);

        remoteControl.setCommand(1, ceilingFanHigh, ceilingOffCommand);
        remoteControl.setCommand(2, ceilingFanMedium, ceilingOffCommand);

        remoteControl.onButtonPressed(0);
        remoteControl.offButtonPressed(0);
        remoteControl.undoButtonPressed();
        remoteControl.onButtonPressed(1);
        remoteControl.offButtonPressed(2);
        remoteControl.undoButtonPressed();

    }
}
