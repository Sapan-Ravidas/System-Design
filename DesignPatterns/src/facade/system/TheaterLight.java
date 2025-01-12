package facade.system;

public class TheaterLight extends Instrument {
    public TheaterLight(String description) {
        setDescription(description);
    }

    public void dim(int level) {
        System.out.println(getDescription() + " dimming to " + level);
    }

    @Override
    public String toString() {
        return getDescription();
    }
}
