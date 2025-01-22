package db;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import models.Entity;

public class Database {
    private static volatile Database intsance;

    private Map<String, List<Entity>> collectionMap;

    private Database() {
        collectionMap = new HashMap<>();
    }   
    public static Database getInstance() {
        if (intsance == null) {
            synchronized(Database.class) {
                if (intsance == null) {
                    intsance = new Database();
                }
            }
        }
        return intsance;
    }
    public Map<String, List<Entity>> getCollectionMap() {
        return collectionMap;
    }

    public List<Entity> getCollection(String entity) {
        return collectionMap.get(entity);
    }
}
