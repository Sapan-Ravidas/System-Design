package models;

public enum Genre {
    ACTION("Action"),
    TRILLER("Triller"),
    COMEDY("Comedy"),
    SCI_FI("Sci-Fi"),
    ROMANCE("Romance"),
    HORROR("Horror");

    private final String value;

    Genre(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
