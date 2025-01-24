package services;


public class AdminService {

    private GymService gymService;

    public AdminService(GymService gymService) {
        this.gymService = gymService;
    }
    
    public boolean addWorkout(String location, String type, int startTime, int endTime, 
            int capacity, String startDate, String endDate) {

        gymService.addWorkout(location, type, startTime, endTime, capacity, startDate, endDate);
        
        return true;
    }
}