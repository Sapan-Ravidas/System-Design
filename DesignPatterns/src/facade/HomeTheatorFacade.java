package facade;

import facade.system.Amplifier;
import facade.system.Instrument;
import facade.system.PopCornPopper;
import facade.system.Projector;
import facade.system.StreamPlayer;
import facade.system.TheaterLight;
import facade.system.Tuner;
import facade.system2.Screen;

public class HomeTheatorFacade {
    private Amplifier amplifier;
    private Tuner tuner;
    private StreamPlayer player;
    private Projector projector;
    private TheaterLight theaterLight;
    private Instrument screen;
    private PopCornPopper popCornPopper;

    public HomeTheatorFacade(Amplifier amp, 
        Tuner tuner,
        StreamPlayer player,
        Projector projector,
        Instrument screen, 
        TheaterLight lights,
        PopCornPopper popCornPopper) {
            this.amplifier = amp;
            this.tuner = tuner;
            this.player = player;
            this.projector = projector;
            this.screen = screen;
            this.theaterLight = lights;
            this.popCornPopper = popCornPopper;
        }

        public void watchMovie(String movie) {
            System.out.println("get readt to watch a movie...");
            popCornPopper.on();
            popCornPopper.pop();

            theaterLight.dim(10);
            screen.on();
            projector.on();
            projector.wideScreenMode();
            amplifier.on();
            amplifier.setPlayer(player);
            amplifier.setVolume(50);
            player.on();
            player.play(movie);
        }

        public void listenToRadio() {
            System.out.println("tunning in the airwaves...");
            tuner.on();
            tuner.setFrequency(92.8);
            amplifier.on();
            amplifier.setVolume(100);
            amplifier.setTuner(tuner);
        }

}
