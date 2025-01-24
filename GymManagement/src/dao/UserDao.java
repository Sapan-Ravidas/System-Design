package dao;

import java.util.List;

import models.User;
import models.UserSession;

public interface UserDao {
    boolean addUser(User user);
    List<UserSession> getUserBookingDetail(String email);
    void bookUserSession(UserSession session);
}
