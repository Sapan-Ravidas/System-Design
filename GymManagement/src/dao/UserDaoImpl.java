package dao;

import java.util.List;

import db.UserDatabase;
import models.User;
import models.UserSession;

public class UserDaoImpl implements UserDao {

    private UserDatabase userDatabase;

    public UserDaoImpl() {
        userDatabase = UserDatabase.getInstance();
    }

    @Override
    public boolean addUser(User user) {
        return userDatabase.addUser(user);
    }

    @Override
    public List<UserSession> getUserBookingDetail(String email) {
        return userDatabase.getUserBookingDetails(email);
    }

    @Override
    public void bookUserSession(UserSession session) {
        userDatabase.bookUserSession(session);
    }

    
    
}
