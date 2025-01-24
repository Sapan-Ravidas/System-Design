package services;

import models.User;

public class UserService {
    private GymService gymService;

    public UserService(GymService gymService) {
        this.gymService = new GymServiceImpl();
    }

    public void registerUser(String name, String email, String location) {
        User user = new User(name, email, location);
        if (gymService.registerUser(user)) {
            System.out.println("User '" + email + "' added successfully");
        } else {
            System.out.println("User already exists");
        }
    }

    public void viewWorkoutAvailability(String workoutType, String date) {
        gymService.viewWorkoutAvailability(workoutType, date);
    }

    public void bookSession(String email, String location, String type, int startTime, int endTime, String date) {
        gymService.bookSession(email, location, type, startTime, endTime, date);
    }

    public void viewShedule(String email, String date) {
        gymService.viewShedule(email, date);
    }

    public void viewShedule(String center, String workoutType, String email, String date) {
        gymService.viewShedule(center, workoutType, email, date);
    }

}
