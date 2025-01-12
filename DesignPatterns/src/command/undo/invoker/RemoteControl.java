package command.undo.invoker;

import command.undo.command.Command;
import command.undo.command.NoCommand;

public class RemoteControl {
    private Command[] onCommands;
    private Command[] offCommands;
    private Command undoCommand;

    private int MAX_SLOT = 7;

    public RemoteControl() {
        onCommands = new Command[MAX_SLOT];
        offCommands = new Command[MAX_SLOT];

        Command noCommand = new NoCommand();
        for (int i = 0; i < MAX_SLOT; ++ i) {
            onCommands[i] = noCommand;
            offCommands[i] = noCommand;
        }

        undoCommand = noCommand;
    }

    public void setCommand(int slot, Command onCommand, Command offCommand) {
        onCommands[slot] = onCommand;
        offCommands[slot] = offCommand;
    }

    public void onButtonPressed(int slot) {
        onCommands[slot].execute();
        undoCommand = onCommands[slot];
    }

    public void offButtonPressed(int slot) {
        offCommands[slot].execute();
        undoCommand = offCommands[slot];
    }

    public void undoButtonPressed() {
        undoCommand.undo();
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
