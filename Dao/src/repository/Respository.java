package repository;

import java.util.stream.Stream;

import db.Dao;
import exception.EntityAlreadyExistsException;
import factory.DaoFactory;
import factory.DaoFactory.DaoType;
import models.Entity;

public class Respository<T extends Entity> {
    private Dao<T> dao;
    public Respository(DaoType type) {
        dao = (Dao<T>) DaoFactory.createDao(type);
    }

    public boolean addItem(T item, Class<T> entity) {
        try {
            dao.addItem(item, entity);
            return true;
        } catch (EntityAlreadyExistsException e) {
            e.printStackTrace();
            return false;
        }
    }

    public Entity getItem(long id, Class<T> entity) {
        return dao.getItem(id, entity).orElse(null);
    }

    public Stream<T> getAllItems(Class<T> entity) {
        return dao.getAllItems(entity).map(entity::cast);
    }
}
