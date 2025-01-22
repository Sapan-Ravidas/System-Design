package db;

import java.util.ArrayList;
import java.util.List;

import models.User;

public class UserDatabase {
    private List<User> users;
    private static volatile UserDatabase instance = null;

    private UserDatabase() {
        users = new ArrayList<>();
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

    public List<User> getUsers() {
        return users;
    }

    public void addUser(User user) {
        users.add(user);
    }
}
