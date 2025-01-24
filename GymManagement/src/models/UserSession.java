package models;

public class UserSession {
    private String email;
    private String bookingLocation;
    private String date;
    private String workoutType;
    private int startTime;
    private int endTime;

    public UserSession(String email, String bookingLocation, String date, String workoutType, int startTime, int endTime) {
        this.email = email;
        this.bookingLocation = bookingLocation;
        this.date = date;
        this.workoutType = workoutType;
        this.startTime = startTime;
        this.endTime = endTime;
    }
    @Override
    public String toString() {
        return "UserSession [email=" + email + ", bookingLocation=" + bookingLocation + ", date=" + date
                + ", workoutType=" + workoutType + "]";
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getBookingLocation() {
        return bookingLocation;
    }
    public void setBookingLocation(String bookingLocation) {
        this.bookingLocation = bookingLocation;
    }
    public String getDate() {
        return date;
    }
    public void setDate(String date) {
        this.date = date;
    }
    public String getWorkoutType() {
        return workoutType;
    }
    public void setWorkoutType(String workoutType) {
        this.workoutType = workoutType;
    }
    
    public int getStartTime() {
        return startTime;
    }

    public int getEndTime() {
        return endTime;
    }

}
