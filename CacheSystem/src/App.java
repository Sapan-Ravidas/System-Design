import java.io.File;
import java.io.FileInputStream;
import java.util.Arrays;
import java.util.Scanner;

import cache.CacheManager;
import observer.Statistics;
import services.MovieService;
import services.SearchService;
import services.UserService;

public class App {

    private static final String ADD_MOVIE = "ADD_MOVIE";
    private static final String ADD_USER = "ADD_USER";
    private static final String ALL_MOVIES = "ALL_MOVIES";
    private static final String SEARCH = "SEARCH";
    private static final String SEARCH_MULTI = "SEARCH_MULTI";
    private static final String VIEW_CACHE_STATS = "VIEW_CACHE_STATS";
    private static final String CLEAR_CACHE = "CLEAR_CACHE";

    public static void main(String[] args) {
        MovieService movieService = new MovieService();
        UserService userService = new UserService();
        SearchService searchService = new SearchService();
        Statistics stats = new Statistics();
        CacheManager cacheManager = CacheManager.getInstance();
        cacheManager.addObserver(stats);
        
        String path = System.getProperty("user.dir");
        path = path + File.separator + "res" + File.separator + "input.txt";
        try(Scanner scanner = new Scanner(new FileInputStream(new File(path)))) {
            String line = null;
            while (scanner.hasNextLine()) {
                line = scanner.nextLine();
                String[] command = line.split("\\s+");
                if (command[0].equals(ADD_MOVIE)) {
                    movieService.addMovie(Arrays.copyOfRange(command, 1, command.length));
                } else if (command[0].equals(ADD_USER)) {   
                    userService.addUser(Arrays.copyOfRange(command, 1, command.length));
                } else if (command[0].equals(ALL_MOVIES)) {
                    movieService.showAllMovies();
                } else if (command[0].equals(SEARCH)) {
                    searchService.search(Arrays.copyOfRange(command, 1, command.length));
                } else if (command[0].equals(SEARCH_MULTI)) {
                    searchService.searchMulti(Arrays.copyOfRange(command, 1, command.length));
                } else if (command[0].equals(VIEW_CACHE_STATS)) {
                    stats.displayStats();
                } else if (command[0].equals(CLEAR_CACHE)) {
                    try {
                        searchService.clearCache(command[1]); 
                    } catch (Exception e) {
                        System.out.println("invalid command");
                    }
                } else {
                    System.out.println("invalid command");
                }

            }
        } catch (Exception e) {
            
        }
    }
}
