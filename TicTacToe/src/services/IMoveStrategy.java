package services;

import model.GameBoard;
import model.Position;

public interface IMoveStrategy {
    boolean isValidMove(GameBoard gameBoard, Position postion);
}
