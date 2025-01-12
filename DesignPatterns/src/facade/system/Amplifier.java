package facade.system;

public class Amplifier extends Instrument{
    private Instrument player;
    private Instrument tuner;
    public Instrument getPlayer() {
        return player;
    }
    public Instrument getTuner() {
        return tuner;
    }
    public void setPlayer(Instrument player) {
        System.out.println(getDescription() + " set stream player to " + player);
        this.player = player;
    }
    public void setTuner(Instrument tuner) {
        this.tuner = tuner;
        System.out.println(getDescription() + " setting tuner to " + tuner);
    }

    public Amplifier(String description) {
        setDescription(description);
    }

    public void setStreoSound() {
        System.out.println(getDescription() + " stereo mode on");
    }

    public void setVolume(int level) {
        System.out.println(getDescription() + " volume set to " + level);
    }

    @Override
    public String toString() {
        return getDescription();
    }
}
