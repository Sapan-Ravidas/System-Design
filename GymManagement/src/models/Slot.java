package models;

import java.util.HashMap;
import java.util.Map;

import config.Config;

public class Slot implements Comparable<Slot> {
    private int startTime;
    private int endTime;
    private Map<String, WorkoutEntry> workoutEntries;

    public Slot(int startTime, int endTime) {
        this.startTime = startTime;
        this.endTime = endTime;
        workoutEntries = new HashMap<>();
    }

    @Override
    public int compareTo(Slot o) {
        return startTime - o.getStartTime();
    }

    public int getStartTime() {
        return startTime;
    }
    
    public void setStartTime(int startTime) {
        this.startTime = startTime;
    }
    
    public int getEndTime() {
        return endTime;
    }
    
    public Map<String, WorkoutEntry> getWorkoutEntres() {
        return workoutEntries;
    }
    
    public void setEndTime(int endTime) {
        this.endTime = endTime;
    }
    
    @Override
    public String toString() {
        return "Slot [startTime=" + startTime + ", endTime=" + endTime + ", workoutEntry=" + workoutEntries + "]";
    }

    public boolean addWorkout(WorkoutEntry workoutEntry) {
        if (Config.getNumOfWorkoutPerSlot() < workoutEntries.size()) {
            workoutEntries.put(workoutEntry.getWorkout().getWorkoutType(), workoutEntry);
            return true;
        } else {
            return false;
        }
    }

    public boolean isAvailable() {
        WorkoutEntry entry = workoutEntries.values().stream()
                                .filter( it->
                                    it.getCapacity() > it.getUsers().size()
                                ).findAny()
                                .orElse(null);
        return entry != null;
    }
    
}
