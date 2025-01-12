package command.remote_control.invoker;

import command.remote_control.command.Command;
import command.remote_control.command.NoCommand;

/**
 * invoker
 */
public class RemoteControl {
    Command[] onCommands;
    Command[] offCommands;

    public RemoteControl() {
        onCommands = new Command[3];
        offCommands = new Command[3];
        
        Command noCommand = new NoCommand();
        for (int i = 0; i < 3; ++ i) {
            onCommands[i] = noCommand;
            offCommands[i] = noCommand;
        }
    }

    public void setCommand(int slot, Command onCommand, Command offCommand) {
        onCommands[slot] = onCommand;
        offCommands[slot] = offCommand;
    }

    public void onButtonPressed(int slot) {
        onCommands[slot].execute();
    }

    public void offButtonPressed(int slot) {
        offCommands[slot].execute();
    }

    @Override
    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("--remote control--\n");
        for (int i = 0; i < onCommands.length; ++ i) {
            stringBuffer.append("[slot " + i + "]" + onCommands[i].getClass().getSimpleName() + 
                "    " + offCommands[i].getClass().getSimpleName() + "\n");
        }
        return stringBuffer.toString();
    }
}
