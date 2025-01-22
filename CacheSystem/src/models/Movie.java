package models;

public class Movie {
    private long id;
    private String name;
    private String genre;
    private String year;
    private double rating;
    public Movie(long id, String name, String genre, String year, double rating) {
        this.id = id;
        this.name = name;
        this.genre = genre;
        this.year = year;
        this.rating = rating;
    }
    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getGenre() {
        return genre;
    }
    public void setGenre(String genre) {
        this.genre = genre;
    }
    public String getYear() {
        return year;
    }
    public void setYear(String year) {
        this.year = year;
    }
    public double getRating() {
        return rating;
    }
    public void setRating(double rating) {
        this.rating = rating;
    }
    @Override
    public String toString() {
        return "Movie [id=" + id + ", name=" + name + ", genre=" + genre + ", year=" + year + ", rating=" + rating
                + "]";
    }
    
}
