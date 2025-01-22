package db;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

import exception.EntityAlreadyExistsException;
import models.Entity;

public class DaoImpl<T extends Entity> implements Dao<T>{
    private Database database;
    public DaoImpl() {
        database = Database.getInstance();
    }

    @Override
    public boolean addItem(Entity item, Class<T> entity) throws EntityAlreadyExistsException {
        if (database.getCollectionMap().containsKey(entity.getName())) {
            List<Entity> collection = database.getCollectionMap().get(entity.getName());
            if (isAlreadyExists(item.getId(), entity)) {
                throw new EntityAlreadyExistsException();
            }
            collection.add(item);
        } else {
            List<Entity> collection = new ArrayList<>();
            collection.add(item);
            database.getCollectionMap().put(entity.getName(), collection);
        }
        return true;
    }

    @Override
    public Optional<Entity> getItem(long id, Class<T> entity) {
        return database.getCollection(entity.getName())
            .stream()
            .filter(it -> it.getId() == id)
            .findFirst();
    }

    @Override
    public Stream<Entity> getAllItems(Class<T> entity) {
        List<Entity> collection = database.getCollection(entity.getName());
        return (collection != null && !collection.isEmpty()) ? 
            collection.stream() :
            Stream.empty();
    }

    private boolean isAlreadyExists(long id, Class<T> entity) {
        return database.getCollection(entity.getName())
            .stream()
            .anyMatch(it -> it.getId() == id);
    }
}
