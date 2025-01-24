package config;

public class Config {
    private static int numOfSessionAllowedToUser = 5;
    private static int numOfWorkoutPerSlot = 10;
    public static int getNumOfSessionAllowedToUser() {
        return numOfSessionAllowedToUser;
    }
    public static void setNumOfSessionAllowedToUser(int numOfSessionAllowedToUser) {
        Config.numOfSessionAllowedToUser = numOfSessionAllowedToUser;
    }
    public static int getNumOfWorkoutPerSlot() {
        return numOfWorkoutPerSlot;
    }
    public static void setNumOfWorkoutPerSlot(int numOfWorkoutPerSlot) {
        Config.numOfWorkoutPerSlot = numOfWorkoutPerSlot;
    }
}
