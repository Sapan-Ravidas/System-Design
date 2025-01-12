package command.simple_remote.receiver;

public class GarageDoor {
    public GarageDoor() {

    }
    public void up () {
        System.out.println("Garage door is open");
    }

    public void down() {
        System.out.println("Garage door is down");
    }

    public void stop() {
        System.out.println("Garage door is stopped");
    }

    public void lightOn() {
        System.out.println("garage light is on");
    }

    public void lightOff() {
        System.out.println("garage light is off");
    }
    
}
