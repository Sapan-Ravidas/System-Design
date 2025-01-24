package dao;

import java.util.Collection;

import models.Center;

public interface GymDao {

    public boolean addCenter(Center center);
    public Center getCenter(String location);
    public Collection<Center> getAllCenters();
    
}
