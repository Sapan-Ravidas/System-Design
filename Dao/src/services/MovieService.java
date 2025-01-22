package services;

import java.util.stream.Stream;

import factory.DaoFactory.DaoType;
import models.Genre;
import models.Movie;
import repository.Respository;

public class MovieService {
    private Respository<Movie> respository;
    public MovieService() {
        respository = new Respository<>(DaoType.MOVIE);
    }

    public boolean addMovie(Movie movie) {
        return respository.addItem(movie, Movie.class);
    }

    public boolean addMovie(String[] command) {
        try {
            int id = Integer.parseInt(command[1]);
            String movieName = "";
            String genre = "";
            int left = 2, right = 2;
            for (int i = left; i < command.length; ++ i, ++ right) {
                movieName += (command[i] + " ");
                if (command[i].endsWith("\"")) {
                    break;
                }
            }

            movieName = movieName.trim();
            movieName = movieName.substring(1, movieName.length() - 1);

            left = right + 1;
            right = left;

            for (int i = left; i < command.length; ++ i, ++ right) {
                genre += (command[i] + " ");
                if (command[i].endsWith("\"")) {
                    break;
                }
            }

            genre = genre.trim();
            genre = genre.substring(1, genre.length() - 1);

            String year = command[right + 1];
            double rating = Double.parseDouble(command[right + 2]);
            Movie movie = new Movie(id, movieName, year, fetchGenre(genre), rating);
            if (addMovie(movie)) {
                System.out.println("Movie " + "'" + movieName + "' added successfullu");
                return true;
            } else {
                return false;
            }
        } catch (Exception e) {
            return false;
        }
        
    }

    public void showAllMovies() {
        Stream<Movie> movies = getAllMovies();
        movies.forEach(item -> System.out.println(item));
    }

    public Stream<Movie> getAllMovies() {
        return respository.getAllItems(Movie.class);
    }

    private Genre fetchGenre(String type) {
        for (Genre genre : Genre.values()) {
            if (genre.getValue().equals(type))
                return genre;
        }
        return null;
    }
}
