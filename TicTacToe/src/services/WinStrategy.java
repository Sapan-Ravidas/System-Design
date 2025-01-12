package services;

import model.GameBoard;

public class WinStrategy implements IWinStrategy{

    @Override
    public boolean checkWin(GameBoard board) {
        int x = board.getLastUpdated().getX();
        int y = board.getLastUpdated().getY();
        return isWinThroughRow(board, x, y) || isWinThroughColumn(board, x, y) ||
            isWinThroughDiagonal(board, x, y) || isWinThroughAntiDiagonal(board, x, y);
    }

    private boolean isWinThroughRow(GameBoard board, int x, int y) {
        for (int i = 0; i < board.getSize(); ++ i) {
            if (board.getBoard()[x][i] != board.getBoard()[x][y])
                return false;
        }
        return true;
    }

    private boolean isWinThroughColumn(GameBoard board, int x, int y) {
        for (int i = 0; i < board.getSize(); ++ i) {
            if (board.getBoard()[i][y] != board.getBoard()[x][y])
                return false;
        }
        return true;
    }

    private boolean isWinThroughDiagonal(GameBoard board, int x, int y) {
        if (x != y) return false;
        for (int i = 0; i < board.getSize(); ++ i) {
            if (board.getBoard()[i][i] != board.getBoard()[x][y]) 
                return false;
        }
        return true;
    }

    private boolean isWinThroughAntiDiagonal(GameBoard board, int x, int y) {
        if (x != (board.getSize() - y - 1)) {
            return false;
        }

        for (int i = 0; i < board.getSize(); ++ i) {
            if (board.getBoard()[i][board.getSize() - i - 1] != board.getBoard()[x][y]) 
                return false;
        }
        return true;
    }
    
}
