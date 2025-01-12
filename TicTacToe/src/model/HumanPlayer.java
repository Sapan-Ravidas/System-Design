package model;

public class HumanPlayer extends Player {

    public HumanPlayer(Character symbol) {
        super(symbol);
    }
    
    @Override
    public void makeMove(GameBoard board, Position position) {
        board.getBoard()[position.getX()][position.getY()] = getSymbol();
        board.setLastUpdated(position);
    }
}
