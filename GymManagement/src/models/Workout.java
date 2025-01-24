package models;

public class Workout {
    private String workoutType;

    public Workout(String workoutType) {
        this.workoutType = workoutType;
    }

    public String getWorkoutType() {
        return workoutType;
    }

    public void setWorkoutType(String workoutType) {
        this.workoutType = workoutType;
    }
    
}
