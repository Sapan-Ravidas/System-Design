package facade.system;

public class Projector extends Instrument {
    private Instrument player;

    public Projector(String description, Instrument player) {
        setDescription(description);
        this.player = player;
    }

    public void wideScreenMode() {
        System.out.println(getDescription() + " in wide screen mode");
    }

    public void tvMode() {
        System.out.println(getDescription() + " in tv mode");
    }

    @Override
    public String toString() {
        return getDescription();
    }
}
