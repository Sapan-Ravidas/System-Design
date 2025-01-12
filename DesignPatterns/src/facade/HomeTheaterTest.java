package facade;

import facade.system.Amplifier;
import facade.system.Instrument;
import facade.system.PopCornPopper;
import facade.system.Projector;
import facade.system.ScreenAdapter;
import facade.system.StreamPlayer;
import facade.system.TheaterLight;
import facade.system.Tuner;
import facade.system2.Screen;

public class HomeTheaterTest {
    public static void main(String[] args) {
        Amplifier amp = new Amplifier("amplifier-123");
        Tuner tuner = new Tuner("AM/FM tuner", (Amplifier)amp);
        StreamPlayer player = new StreamPlayer("Streaming Player", (Amplifier) amp);
        Projector projector = new Projector("projector", (StreamPlayer)player);
        TheaterLight lights = new TheaterLight("TheaterLights");
        Instrument screen = new ScreenAdapter("Screen");
        PopCornPopper popcornPopper = new PopCornPopper("PopcornPopper");
        
        HomeTheatorFacade homeTheator = new HomeTheatorFacade(amp, tuner, player, projector, screen, lights, popcornPopper);

        homeTheator.watchMovie("The Godfather");
    }
}
