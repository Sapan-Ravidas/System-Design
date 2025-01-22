package services;

import db.DatabaseManagement;
import models.User;

public class UserService {

    public void addUser(String[] args) {
        try {
            long id = Long.parseLong(args[0]);
            int right = 1;
            String userName = getName(right, args);
            right += userName.split(" ").length;
            String genre = getName(right, args);
            User user = new User(id, userName, genre);
            addUser(user);
        } catch (Exception e) {
            System.out.println("invalid command");
        }
    }

    public void addUser(User user) {
        if (DatabaseManagement.getInstance().addUser(user)) {
            System.out.println("User '" + user.getName() + "' added successfullys");
        } else {
            System.out.println("Duplicate movie found");
        }
    }

    public void displayAllUsers() {
        for (User user : DatabaseManagement.getInstance().getAllUsers()) {
            System.out.println(user);
        }
    }
    
    private String getName(int index, String[] args) {
        String string = "";
        for (; index < args.length; ++ index) {
            string += (args[index] + " ");
            if (args[index].endsWith("\"")) {
                break;
            }
        }
        string = string.trim();
        string = string.substring(1, string.length() - 1);
        return string;
    }
}
