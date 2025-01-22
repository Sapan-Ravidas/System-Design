package services;

import java.util.stream.Stream;

import factory.DaoFactory.DaoType;
import models.Genre;
import models.User;
import repository.Respository;

public class UserService {
    private Respository<User> respository;
    public UserService() {
        respository = new Respository<>(DaoType.USER);
    }

    public boolean addUser(User user) {
        return respository.addItem(user, User.class);
    }

    public Stream<User> getAllUsers() {
        return respository.getAllItems(User.class);
    }

    public boolean addUser(String[] command) {
        try {
            int id = Integer.parseInt(command[1]);
            String userName = "";
            String genre = "";
            int left = 2, right = 2;
            for (int i = left; i < command.length; ++ i, ++ right) {
                userName += (command[i] + " ");
                if (command[i].endsWith("\"")) {
                    break;
                }
            }

            userName = userName.trim();
            userName = userName.substring(1, userName.length() - 1);

            left = right + 1;
            right = left;

            for (int i = left; i < command.length; ++ i, ++ right) {
                genre += (command[i] + " ");
                if (command[i].endsWith("\"")) {
                    break;
                }
            }

            genre = genre.trim();
            genre = genre.substring(1, genre.length() - 1);

            User user = new User(id, userName, fetchGenre(genre));
            if (addUser(user)) {
                System.out.println("User " + "'" + userName + "' added successfully");
                return true;
            } else {
                return false;
            }
        } catch (Exception e) {
            return false;
        }
    }

    private Genre fetchGenre(String type) {
        for (Genre genre : Genre.values()) {
            if (genre.getValue().equals(type))
                return genre;
        }
        return null;
    }
}
