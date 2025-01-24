package models;

import java.util.HashSet;
import java.util.Set;

public class WorkoutEntry {
    private Workout workout;
    private int capacity;
    private Set<String> users;
    
    public WorkoutEntry(Workout workout, int capacity) {
        this.workout = workout;
        this.capacity = capacity;
        users = new HashSet<>();
    }
    public Workout getWorkout() {
        return workout;
    }
    public void setWorkout(Workout workout) {
        this.workout = workout;
    }
    public int getCapacity() {
        return capacity;
    }
    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }
    public Set<String> getUsers() {
        return users;
    }
    @Override
    public String toString() {
        return "WorkoutEntry [workout=" + workout + ", capacity=" + capacity + "]";
    }
    public int getAvailabilityCount() {
        return capacity - users.size();
    }
}
