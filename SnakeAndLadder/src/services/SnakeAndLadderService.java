package services;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;

import model.Board;
import model.Ladder;
import model.Player;
import model.Snake;

public class SnakeAndLadderService {
    private Board board;
    // number of players playing at current time
    private int numOfPlayers;
    private Queue<Player> players;
    private boolean isGameCompleted;

    private int noOfDices; 
    private boolean shouldGameContinueTillLastPlayer;
    private boolean shouldAllowMultipleDiceRollOnSix;

    private static final int DEFAULT_BOARD_SIZE = 100;
    private static final int DEFAULT_NO_OF_DICES = 1;

    public SnakeAndLadderService(int boardSize) {
        this.board = new Board(boardSize);
        this.players = new LinkedList<>();
        this.noOfDices = DEFAULT_NO_OF_DICES;
    }

    public SnakeAndLadderService() {
        this(SnakeAndLadderService.DEFAULT_BOARD_SIZE);
    }

    /**
     * extensions
     */
    public void setNoOfDices(int noOfDices) {
        this.noOfDices = noOfDices;
    }

    public void setShouldGameContinueTillLastPlayer(boolean shouldGameContinueTillLastPlayer) {
        this.shouldGameContinueTillLastPlayer = shouldGameContinueTillLastPlayer;
    }

    public void setShouldAllowMultipleDiceRollOnSix(boolean shouldAllowMultipleDiceRollOnSix) {
        this.shouldAllowMultipleDiceRollOnSix = shouldAllowMultipleDiceRollOnSix;
    }

    /**
     * initial board
     */
    public void setPlayers(List<Player> players) {
        this.players = new LinkedList<>();
        this.numOfPlayers = players.size();
        Map<String, Integer> playerPieces = new HashMap<>();
        for (Player player : players) {
            this.players.add(player);
            playerPieces.put(player.getName(), 0);
        }
        board.setPlayerPieces(playerPieces);
    }

    public void setSnakes(List<Snake> snakes) {
        board.setSnakes(snakes);
    }

    public void setLadders(List<Ladder> ladders) {
        board.setLadders(ladders);
    }

    /**
     * Core Business Logic
     */

    private int getNewPositionAfterGoingThrough(int newPosition) {
        int previousPostion;
        do {
            previousPostion = newPosition;
            /**
             * possible that at the end of snake/ladder could be another snake/ladder
             */
            for (Snake snake : board.getSnakes()) {
                if (snake.getStart() == newPosition)
                    newPosition = snake.getEnd();
            }
            for (Ladder ladder : board.getLadders()) {
                if (ladder.getStart() == newPosition)
                    newPosition = ladder.getEnd();
            }
        } while (previousPostion != newPosition);
        return newPosition;
    }

    private void movePlayer(Player player, int position) {
        int oldPosition = board.getPlayerPieces().get(player.getName());
        int newPosition = oldPosition + position;
        
        if (newPosition > board.getSize()) {
            newPosition = oldPosition;
        } else {
            newPosition = getNewPositionAfterGoingThrough(newPosition);
        }

        board.getPlayerPieces().put(player.getName(), newPosition);
        System.out.println(player.getName() + " get " + position + " from dice and moveTo: " + newPosition);
    }

    private int getValueFromDice() {
        return DiceService.roll();
    }

    private boolean hasPlayerWon(Player player) {
        int playerPosition = board.getPlayerPieces().get(player.getName());
        int winningPosition = board.getSize();
        return playerPosition == winningPosition;
    }

    private boolean isGameCompleted() {
        int currentNumberOfPlayers = players.size();
        return currentNumberOfPlayers < numOfPlayers;
    }

    public void startGame() {
        while (!isGameCompleted()) {
            int totalDiceValue = getValueFromDice();
            Player currentPlayer = players.poll();
            movePlayer(currentPlayer, totalDiceValue);
            if (hasPlayerWon(currentPlayer)) {
                System.out.println(currentPlayer.getName() + " wins the game");
                board.getPlayerPieces().remove(currentPlayer.getName());
            } else {
                players.add(currentPlayer);
            }
        }
    }
}
