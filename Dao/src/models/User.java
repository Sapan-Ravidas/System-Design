package models;

public class User extends Entity {
    private String name;
    private Genre favGenre;
    public User(long id, String name, Genre favGenre) {
        setId(id);
        this.name = name;
        this.favGenre = favGenre;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Genre getFavGenre() {
        return favGenre;
    }
    public void setFavGenre(Genre favGenre) {
        this.favGenre = favGenre;
    }
    @Override
    public String toString() {
        return "User [id=" + getId() + ", name=" + name + ", favGenre=" + favGenre + "]";
    }
}
