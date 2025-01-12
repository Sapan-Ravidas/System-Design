package model;

public abstract class Player {
    private Character symbol;
    public Character getSymbol() {
        return symbol;
    }
    public void setSymbol(char symbol) {
        this.symbol = symbol;
    }
    public Player(Character symbol) {
        this.symbol = symbol;
    }

    public abstract void makeMove(GameBoard board, Position position);
}
