package db;

import java.util.*;

import models.Center;

public class GymDatabase {
    private Map<String, Center> centers;

    private static volatile GymDatabase instance = null;

    private GymDatabase() {
        centers = new HashMap<>();
    }

    public static GymDatabase getInstance() {
        if (instance == null) {
            synchronized(GymDatabase.class) {
                if (instance == null) {
                    instance = new GymDatabase();
                }
            }
        }
        return instance;
    }

    public boolean addCenter(Center center) {
        if (centers.containsKey(center.getLocation())) {
            return false;
        } else {
            centers.put(center.getLocation(), center);
            return true;
        }
    }

    public Center getCenter(String center) {
        return centers.get(center);
    }

    public Collection<Center> getAllCenters() {
        return centers.values();
    }
}
