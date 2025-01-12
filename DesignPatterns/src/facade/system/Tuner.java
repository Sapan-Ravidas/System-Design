package facade.system;

public class Tuner extends Instrument {
    private double frequency;
    private Amplifier amplifier;

    public Tuner(String description, Amplifier amplifier) {
        setDescription(description);
    }

    public double getFrequency() {
        return frequency;
    }

    public void setFrequency(double frequency) {
        System.out.println(getDescription() + " frequency set to " + frequency);
        this.frequency = frequency;
    }

    public void setAMMode() {
        System.out.println(getDescription() + " setting AM mode");
    }

    public void setFMMode() {
        System.out.println(getDescription() + " setting FM mode");
    }

    @Override
    public String toString() {
        return getDescription();
    }
}
