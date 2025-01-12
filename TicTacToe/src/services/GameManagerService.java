package services;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.Scanner;

import model.GameBoard;
import model.HumanPlayer;
import model.Player;
import model.Position;

public class GameManagerService {
    private Map<Character, Player> players;
    private Queue<Player> nextTurn;
    private GameBoard gameBoard;
    private MoveStrategy moveStrategy;
    private WinStrategy winStrategy;
    private int count;

    public void addPlayer(Player player) {
        players.put(player.getSymbol(), player);
        nextTurn.add(player);
    }

    public GameManagerService(GameBoard gameBoard) {
        this.gameBoard = gameBoard;
        this.players = new HashMap<>();
        this.nextTurn = new LinkedList<>();
        moveStrategy = new MoveStrategy();
        winStrategy = new WinStrategy();
    }

    public void startGame() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter number of player: ");
        int n = scanner.nextInt();
        for (int i = 0; i < n; ++ i) {
            System.out.println("provide symbol for player" + (i + 1) + " : ");
            this.addPlayer(new HumanPlayer(scanner.next().trim().charAt(0)));
        }
        System.out.println("Enter row col after ->");
        while (true) {
            Player currentPlayer = nextTurn.poll();
            System.out.println("Player " + currentPlayer.getSymbol() + "'s turn ->");
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            Position position = new Position(x, y);
            while (!moveStrategy.isValidMove(gameBoard, position)) {
                System.out.println("Retry: Player " + currentPlayer.getSymbol() + "'s turn ->");
                int x1 = scanner.nextInt();
                int y1 = scanner.nextInt();
                position = new Position(x1, y1);
            }

            currentPlayer.makeMove(gameBoard, position);
            gameBoard.printBoard();
            count += 1;
            if (winStrategy.checkWin(gameBoard)) {
                System.out.println("Player " + currentPlayer.getSymbol() + " win the game");
                break;
            }

            if (isDraw()) {
                System.out.println("It's Draw");
                break;
            }

            nextTurn.add(currentPlayer);
        }
        scanner.close();
    }

    public boolean isDraw() {
        return count == (gameBoard.getSize() * gameBoard.getSize());
    }
}
