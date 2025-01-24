package services;

import models.User;

public interface GymService {
    boolean registerUser(User user);
    boolean addWorkout(String location, String type, int startTime, int endTime, 
            int capacity, String startDate, String endDate);
    void viewShedule(String email, String date);
    void viewShedule(String center, String workoutType, String email, String date);
    void viewWorkoutAvailability(String workoutType, String date);
    void bookSession(String email, String workoutLocation, String workoutType,
                int startTime, int endTime, String date);
}
