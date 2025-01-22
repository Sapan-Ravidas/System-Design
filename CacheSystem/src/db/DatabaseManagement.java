package db;

import models.Movie;
import models.User;

import java.util.*;

import cache.CacheManager;

public class DatabaseManagement {

    private static volatile DatabaseManagement instance = null;

    private MovieDatabase movieDatabase;
    private UserDatabase userDatabase;

    public static DatabaseManagement getInstance() {
        if (instance == null) {
            synchronized(DatabaseManagement.class) {
                if (instance == null) {
                    instance = new DatabaseManagement();
                }
            }
        }
        return instance;
    }

    private DatabaseManagement() {
        movieDatabase = MovieDatabase.getInstance();
        userDatabase = UserDatabase.getInstance();
    }

    public boolean addMovie(Movie movie) {
        Movie oldMovie = movieDatabase.getMovies().stream()
            .filter(it -> movie.getId() == it.getId())
            .findAny()
            .orElse(null);
        if (oldMovie == null) {
            movieDatabase.addMovie(movie);
            CacheManager.getInstance().registerMovie(movie);
            return true;
        } else {
            return false;
        }
    }

    public boolean addUser(User user) {
        User oldUser = userDatabase.getUsers().stream()
            .filter(it -> user.getId() == it.getId())
            .findAny()
            .orElse(null);
        if (oldUser == null) {
            userDatabase.addUser(oldUser);
            return true;
        } else {
            return false;
        }
    }

    public List<Movie> getAllMovies() {
        return movieDatabase.getMovies();
    }

    public List<User> getAllUsers() {
        return userDatabase.getUsers();
    }
    
}
