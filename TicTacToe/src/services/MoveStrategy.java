package services;

import model.GameBoard;
import model.Position;

public class MoveStrategy implements IMoveStrategy {

    @Override
    public boolean isValidMove(GameBoard gameBoard, Position position) {
        int x = position.getX();
        int y = position.getY();
        return !(x < 0 || y < 0 || x >= gameBoard.getSize() || y >= gameBoard.getSize()) &&
            gameBoard.getBoard()[x][y] == null;
    }
    
}
