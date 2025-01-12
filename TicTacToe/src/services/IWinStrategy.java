package services;

import model.GameBoard;

public interface IWinStrategy {
    boolean checkWin(GameBoard board);
}
