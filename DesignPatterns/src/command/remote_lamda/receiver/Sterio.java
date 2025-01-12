package command.remote_lamda.receiver;

public class Sterio {
    String location;

    public Sterio(String location) {
        this.location = location;
    }

    public void on() {
        System.out.println(location + " sterio is on");
    }

    public void off() {
        System.out.println(location + " sterio is off");
    }

    public void setCD() {
        System.out.println(location + " sterio is set for CD input");
    }

    public void setDVD() {
        System.out.println(location + " sterio is set for DVD input");
    }

    public void setRadio() {
        System.out.println(location = " sterio is set for radio");
    }

    public void setVolume(int volume) {
        System.out.println(location + " sterio is set to " + volume);
    }
}
