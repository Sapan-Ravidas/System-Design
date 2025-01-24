package db;

import java.util.*;

import models.User;
import models.UserSession;

public class UserDatabase {
    private Map<String, User> users; 
    private Map<String, List<UserSession>> userBookingDetails;

    private static volatile UserDatabase instance;

    private UserDatabase() {
        users = new HashMap<>();
        userBookingDetails = new HashMap<>();
    }

    public static UserDatabase getInstance() {
        if (instance == null) {
            synchronized(UserDatabase.class) {
                if (instance == null) {
                    instance = new UserDatabase();
                }
            }
        }
        return instance;
    }

    public Collection<User> getAllUsers() {
        return users.values();
    }

    public User getUser(String email) {
        if (users.containsKey(email)) {
            return users.get(email);
        } else {
            return null;
        }
    }

    public boolean addUser(User user) {
        if (!users.containsKey(user.getEmail())) {
            users.put(user.getEmail(), user);
            return true;
        } else {
            return false;
        }
    }

    public List<UserSession> getUserBookingDetails(String email) {
        return userBookingDetails.get(email);
    }

    public void bookUserSession(UserSession userSession) {
        List<UserSession> sessions = userBookingDetails.computeIfAbsent(userSession.getEmail(), it-> new ArrayList<>());
        sessions.add(userSession);
    }
}
