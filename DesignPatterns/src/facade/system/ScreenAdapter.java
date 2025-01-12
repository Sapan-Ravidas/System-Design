package facade.system;

import facade.system2.Screen;

/**
 * A screen is adapting as Instrument
 */
public class ScreenAdapter extends Instrument {
    private Screen screen;
    public ScreenAdapter(String description) {
        screen = new Screen(description);
    }

    @Override
    public void on() {
        screen.up();
    }

    @Override
    public void off() {
        screen.down();
    }

    @Override
    public String toString() {
        return screen.toString();
    }
}
