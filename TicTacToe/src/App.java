import model.GameBoard;
import services.GameManagerService;

public class App {
    public static void main(String[] args) {
        // Scanner scanner = new Scanner(System.in);
        int size = 3; // scanner.nextInt();
        GameBoard gameBoard = new GameBoard(size);
        GameManagerService service = new GameManagerService(gameBoard);
        //System.out.println("enter number of player: ");
        // int n = scanner.nextInt();
        // for (int i = 0; i < n; ++ i) {
        //     System.out.println("provide symbol for player" + (i + 1) + " : ");
        //     service.addPlayer(new HumanPlayer(scanner.next().trim().charAt(0)));
        // }
        // scanner.close();
        service.startGame();
    }
}
