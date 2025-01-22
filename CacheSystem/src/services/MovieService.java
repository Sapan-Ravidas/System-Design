package services;

import db.DatabaseManagement;
import models.Movie;

public class MovieService {

    public void addMovie(Movie movie) {
        if (DatabaseManagement.getInstance().addMovie(movie)) {
            System.out.println("Movie '" + movie.getName() + "' added successfullys");
        } else {
            System.out.println("Duplicate movie found");
        }
    }

    public void showAllMovies() {
        for (Movie movie : DatabaseManagement.getInstance().getAllMovies()) {
            System.out.println(movie);
        }
    }

    public void addMovie(String[] args) {
        try {
            long id = Long.parseLong(args[0]);
            int right = 1;
            String movieName = getName(right, args);
            right += movieName.split(" ").length;
            String genre = getName(right, args);
            String year = args[args.length - 2];
            double rating = Double.parseDouble(args[args.length - 1]);
            Movie movie = new Movie(id, movieName, genre, year, rating);
            addMovie(movie);
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("invalid command");
        }
    }

    private String getName(int index, String[] args) {
        String string = "";
        for (; index < args.length; ++ index) {
            string += (args[index] + " ");
            if (args[index].endsWith("\"")) {
                break;
            }
        }
        string = string.trim();
        string = string.substring(1, string.length() - 1);
        return string;
    }
}
