package db;

import java.util.Optional;
import java.util.stream.Stream;

import exception.EntityAlreadyExistsException;
import models.Entity;

public interface Dao<T extends Entity> {
    boolean addItem(Entity item, Class<T> entity) throws EntityAlreadyExistsException;
    Optional<Entity> getItem(long id, Class<T> entity);
    Stream<Entity> getAllItems(Class<T> entity);
}
