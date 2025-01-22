package models;

public class Movie extends Entity {
    private String name;
    private String year;
    private Genre genre;
    private double rating;
    public Movie(long id, String name, String year, Genre genre, double rating) {
        setId(id);
        this.name = name;
        this.year = year;
        this.genre = genre;
        this.rating = rating;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getYear() {
        return year;
    }
    public void setYear(String year) {
        this.year = year;
    }
    public Genre getGenre() {
        return genre;
    }
    public void setGenre(Genre genre) {
        this.genre = genre;
    }
    
    @Override
    public String toString() {
        return "Movie [id=" + getId() +", name=" + name + ", year=" + year + ", genre=" + genre + ", rating=" + rating + "]";
    }
    public double getRating() {
        return rating;
    }
    public void setRating(double rating) {
        this.rating = rating;
    }
    
}
