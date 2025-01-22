package models;

public class User {
    private long id;
    private String name;
    private String favGenre;
    public User(long id, String name, String favGenre) {
        this.id = id;
        this.name = name;
        this.favGenre = favGenre;
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
    public String getFavGenre() {
        return favGenre;
    }
    public void setFavGenre(String favGenre) {
        this.favGenre = favGenre;
    }
    @Override
    public String toString() {
        return "User [id=" + id + ", name=" + name + ", favGenre=" + favGenre + "]";
    }
    
}
