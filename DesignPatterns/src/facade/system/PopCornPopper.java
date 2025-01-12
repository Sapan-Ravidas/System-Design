package facade.system;

public class PopCornPopper extends Instrument{
    public PopCornPopper(String description) {
        setDescription(description);
    }

    public void pop() {
        System.out.println(getDescription() + " popping popcorn");
    }

    @Override
    public String toString() {
        return getDescription();
    }
}
