import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import model.Ladder;
import model.Player;
import model.Snake;
import services.SnakeAndLadderService;

public class App {
    public static void main(String[] args) throws Exception {
        String inputFilePath = System.getProperty("user.dir") + 
        File.separator +
        "input" +
        File.separator + 
        "input.txt";

        List<Snake> snakes = new ArrayList<>();
        List<Ladder> ladders = new ArrayList<>();
        List<Player> players = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(inputFilePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                int snakesCount = Integer.valueOf(line.trim());
                for (int i = 0; i < snakesCount; ++ i) {
                    String[] position = br.readLine().split("\\s");
                    snakes.add(new Snake(Integer.valueOf(position[0]), Integer.valueOf(position[1])));
                }
                int ladderCount = Integer.valueOf(br.readLine().trim());
                for (int i = 0; i < ladderCount; ++ i) {
                    String[] position = br.readLine().trim().split("\\s");
                    ladders.add(new Ladder(Integer.valueOf(position[0]), Integer.valueOf(position[1])));
                }

                int playerCount = Integer.valueOf(br.readLine().trim());
                for (int i = 0; i < playerCount; ++ i) {
                    String name = br.readLine().trim();
                    players.add(new Player(name));
                }
            }

            // for (Snake snake: snakes) {
            //     System.out.println(snake);
            // }

            // for (Ladder ladder : ladders) {
            //     System.out.println(ladder);
            // }

            // for (Player player : players) {
            //     System.out.println(player);
            // }
            SnakeAndLadderService snakeAndLadderService = new SnakeAndLadderService();
            snakeAndLadderService.setPlayers(players);
            snakeAndLadderService.setSnakes(snakes);
            snakeAndLadderService.setLadders(ladders);

            snakeAndLadderService.startGame();
        } catch (Exception e) {

        }

        
        /*Scanner scanner = new Scanner(System.in);
        int numOfSnakes = scanner.nextInt();
        List<Snake> snakes = new ArrayList<>();
        for (int i = 0; i < numOfSnakes; ++ i) {
            snakes.add(new Snake(scanner.nextInt(), scanner.nextInt()));
        }

        int numOfLadders = scanner.nextInt();
        List<Ladder> ladders = new ArrayList<>();
        for (int i = 0; i < numOfLadders; ++ i) {
            ladders.add(new Ladder(scanner.nextInt(), scanner.nextInt()));
        }

        int numberOfPlayers = scanner.nextInt();
        List<Player> players = new ArrayList<>();
        for (int i = 0; i < numberOfPlayers; ++ i) {
            players.add(new Player(scanner.next()));
        }

        SnakeAndLadderService snakeAndLadderService = new SnakeAndLadderService();
        snakeAndLadderService.setPlayers(players);
        snakeAndLadderService.setSnakes(snakes);
        snakeAndLadderService.setLadders(ladders);

        snakeAndLadderService.startGame();*/
    }
}
