package dao;

import java.util.Collection;

import db.GymDatabase;
import models.Center;

public class GymDaoImpl implements GymDao{

    private GymDatabase gymDatabase;
    
    public GymDaoImpl() {
        gymDatabase = GymDatabase.getInstance();
    }

    @Override
    public boolean addCenter(Center center) {
        return gymDatabase.addCenter(center);
    }

    @Override
    public Center getCenter(String location) {
        return gymDatabase.getCenter(location);
    }

    @Override
    public Collection<Center> getAllCenters() {
        return gymDatabase.getAllCenters();
    }
    
}
