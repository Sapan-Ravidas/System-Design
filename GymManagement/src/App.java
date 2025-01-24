import java.util.Arrays;
import java.util.Scanner;
import services.InputController;

public class App {
    private static String REGISTER_USER = "REGISTER_USER";
    private static String EMPTY_SLOTS = "EMPTY_SLOTS";
    private static String BOOOK = "BOOK";
    private static String SHEDULE = "SHEDULE";
    private static String ADD_WORKOUT = "ADD_WORKOUT";

    public static void main(String[] args) throws Exception {
        InputController inputController = new InputController();

        try(Scanner scanner = new Scanner(System.in)) {
            String line = scanner.nextLine();
            String[] command = line.split(" ");
            String cmd = command[0];
            if (cmd.equals(REGISTER_USER)) {
                inputController.registerUser(Arrays.copyOfRange(command, 1, command.length));
            } else if (cmd.equals(EMPTY_SLOTS)) {
                inputController.viewAvailableSlots(Arrays.copyOfRange(command, 1, command.length));
            } else if (cmd.equals(BOOOK)) {
                inputController.bookSession(Arrays.copyOfRange(command, 1, command.length));
            } else if (cmd.equals(SHEDULE)) {
                inputController.viewScheule(args);
            } else if (cmd.equals(ADD_WORKOUT)) {
                inputController.addWorkout(args);
            } else {
                System.out.println("invalid command");
            }
        }
    }
}
