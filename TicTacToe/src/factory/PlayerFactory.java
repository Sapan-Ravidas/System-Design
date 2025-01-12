package factory;

import model.HumanPlayer;
import model.Player;

public class PlayerFactory {
    public static Player createPlayer(Character symbol) {
        return new HumanPlayer(symbol);
    }
}
