package exception;

public class EntityAlreadyExistsException extends Exception {
    public EntityAlreadyExistsException() {
        super("Entity Already Exists");   
    }
}
