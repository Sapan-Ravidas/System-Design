package factory;

import db.Dao;
import db.DaoImpl;
import models.Entity;
import models.Movie;
import models.User;

public class DaoFactory {
    public enum DaoType {
        MOVIE,
        USER;
    }

    public static Dao<? extends Entity> createDao(DaoType type) {
        switch (type) {
            case MOVIE:
                return new DaoImpl<Movie>();
            case USER:
                return new DaoImpl<User>();
            default:
                return new DaoImpl<Entity>();
        }
    }
}
