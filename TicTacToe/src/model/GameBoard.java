package model;

public class GameBoard {
    private Character[][] board;
    private int size;
    private Position lastUpdated;
    
    public GameBoard(int size) {
        this.size = size;
        this.board = new Character[size][size];
    }

    public Character[][] getBoard() {
        return board;
    }

    public int getSize() {
        return size;
    }

    public Position getLastUpdated() {
        return lastUpdated;
    }

    public void setLastUpdated(Position lastUpdated) {
        this.lastUpdated = lastUpdated;
    }

    public void printBoard() {
        for (int i = 0; i < size; ++ i) {
            for (int j = 0; j < size; ++ j) {
                if (board[i][j] != null) {
                    System.out.print(board[i][j]);
                } else {
                    System.out.print(" ");
                }
                if (j != size - 1) {
                    System.out.print("|");
                }   
            }
            System.out.println();
            for (int j = 0; j < (2 * size - 1); ++ j)
                System.out.print("-");
            System.out.println();
        }
    }
}
