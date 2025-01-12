package command.remote_lamda.invoker;

import command.remote_lamda.command.Command;

public class RemoteControl {
    Command[] onCommands;
    Command[] offCommands;

    public RemoteControl() {
        onCommands = new Command[4];
        offCommands = new Command[4];
        for (int i = 0; i < 4; ++ i) {
            onCommands[i] = () -> {}; // no-command
            offCommands[i] = () -> {}; // no-command
        }
    }

    public void setCommand(int slot, Command onCommand, Command offCommand) {
        onCommands[slot] = onCommand;
        offCommands[slot] = offCommand;
    }

    public void onButtonPressed(int slot) {
        onCommands[slot].execute();
    }

    public void offButtonPresed(int slot) {
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
