package db;

import java.util.*;

import models.Movie;

public class MovieDatabase {
    private List<Movie> movies;
    private static volatile MovieDatabase instance = null;

    private MovieDatabase() {
        movies = new ArrayList<>();
    }

    public static MovieDatabase getInstance() {
        if (instance == null) {
            synchronized(MovieDatabase.class) {
                if (instance == null) {
                    instance = new MovieDatabase();
                }
            }
        }
        return instance;
    }

    public List<Movie> getMovies() {
        return movies;
    }

    public void addMovie(Movie movie) {
        movies.add(movie);
    }
}
