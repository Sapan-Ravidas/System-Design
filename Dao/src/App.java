import java.io.File;
import java.io.FileInputStream;
import java.util.Scanner;

import services.MovieService;
import services.UserService;

public class App {

    private static final String ADD_MOVIE = "ADD_MOVIE";
    private static final String ADD_USER = "ADD_USER";
    private static final String SEARCH = "SEARCH";
    private static final String VIEW_CACHE_STATS = "VIEW_CACHE_STATS";
    private static final String CLEAR_CACHE = "CLEAR_CACHE";
    private static final String ALL_MOVIES = "ALL_MOVIES";
    private static final String ALL_USERS = "ALL_USERS";
    private static final String FIND_MOVIE = "MOVIE";
    private static final String FIND_USER = "USER";
    private static final String L1 = "L1";
    private static final String L2 = "L2";

    public static void main(String[] args) throws Exception {

        MovieService movieService = new MovieService();
        UserService userService = new UserService();

        String path = System.getProperty("user.dir");
        path = path + File.separator + "res" + File.separator + "sample.txt";
        
        
        try(Scanner scanner = new Scanner(new FileInputStream(new File(path)))){
        
        String line;
        while ((line = scanner.nextLine()) != null) {
            String[] inputCommand = line.trim().split("\\s+");
            String commnad = inputCommand[0];
            if (ADD_MOVIE.equals(commnad)) {
                movieService.addMovie(inputCommand);
            } else if (ADD_USER.equals(commnad)) {

            } else if (SEARCH.equals(commnad)) {

            } else if (CLEAR_CACHE.equals(commnad)) {

            } else if (VIEW_CACHE_STATS.equals(commnad)) {

            } else if (ALL_MOVIES.equals(commnad)) {
                movieService.showAllMovies();
            } else if (ALL_USERS.equals(commnad)) {

            } else if (FIND_MOVIE.equals(commnad)) {

            } else if (FIND_USER.equals(commnad)) {

            } else {
                System.out.println("Invalid Command");
            }
            
        }
        } catch (Exception e) {

        } 
        
    }
}
