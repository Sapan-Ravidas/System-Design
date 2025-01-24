package services;

public class InputController {
    private GymService gymService;
    private UserService userService;
    private AdminService adminService;

    public InputController() {
        gymService = new GymServiceImpl();
        adminService = new AdminService(gymService);
        userService = new UserService(gymService);
    }
    public void registerUser(String... command) {
        String name = command[0];
        String email = command[1];
        String location = command[2];
        userService.registerUser(name, email, location);
    }

    public void viewAvailableSlots(String... command) {
        String workoutType = command[0].toLowerCase();
        String date = command[1];
        gymService.viewWorkoutAvailability(workoutType, date);
    }

    // bookSession(email, workoutLocation, workoutType, startTime, end Time, “20-09-24"）
    public void bookSession(String... args) {
        String email = args[0].toLowerCase();   
        String workoutLocation = args[1].toLowerCase();
        int startTime = Integer.parseInt(args[2]);
        int endTime = Integer.parseInt(args[3]);
        String date = args[4];
        userService.bookSession(email, workoutLocation, workoutLocation, startTime, endTime, date);
    }

    // center, workoutType, email, date
    public void viewScheule(String... args) {
        if (args.length == 2) {
            userService.viewShedule(args[0].toLowerCase(), args[1]);
        }
        String location = args[0].toLowerCase();
        String workout = args[1].toLowerCase();
        String email = args[2].toLowerCase();
        String date = args[3];
        userService.viewShedule(location, workout, email, date);
    }
    // addWorkout("Koramangala", "Weights", startTime:int, endTime:int, capacity:int, "01-09-24", "30-09-24")
    public void addWorkout(String... args) {
        String location = args[0].toLowerCase();
        String workout = args[1].toLowerCase();
        int startTime = Integer.parseInt(args[2]);
        int endTime = Integer.parseInt(args[3]);
        int capacity = Integer.parseInt(args[4]);
        String startDate = args[5];
        String endDate = args[6];
        adminService.addWorkout(location, workout, startTime, endTime, capacity, startDate, endDate);
    }
}
