package command.simple_remote.command;

/**
 * command object provides method, execute(), that encapsulate the action and 
 * can be called to invoke the actions on the receiver.
 */
public interface Command {
    public void execute();
}
