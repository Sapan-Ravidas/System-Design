package command.remote_control.receiver;

public class CeilingFan {
    private String location = "";

    private int level;

    private static final int HIGH = 2;
    private static final int MEDIUM = 1;
    private static final int LOW = 0;

    public CeilingFan(String location) {
        this.location = location;
    }

    public void high() {
        level = HIGH;
        System.out.println(location + " ceiling fan is on high");
    }

    public void medium() {
        level = HIGH;
        System.out.println(location + " ceiling fan is on medium");
    }

    public void low() {
        level = HIGH;
        System.out.println(location + " ceiling fan is on low");
    }

    public void off() {
        level = 0;
        System.out.println(location + " ceiling fan is off");
    }

    public int getSpeed() {
        return level;
    }
}
