package services;

import java.util.Collection;
import java.util.List;

import config.Config;
import dao.GymDao;
import dao.GymDaoImpl;
import dao.UserDao;
import dao.UserDaoImpl;
import models.Center;
import models.DateRange;
import models.Slot;
import models.User;
import models.UserSession;
import models.Workout;
import models.WorkoutEntry;

public class GymServiceImpl implements GymService{

    private GymDao gymDao;
    private UserDao userDao;

    public GymServiceImpl() {
        gymDao = new GymDaoImpl();
        userDao = new UserDaoImpl();
    }

    @Override
    public boolean addWorkout(String location, String type, int startTime, int endTime, int capacity, String startDate,
            String endDate) {

        Workout workout = new Workout(type);
        WorkoutEntry workoutEntry = new WorkoutEntry(workout, capacity);
        Slot slot = new Slot(startTime, endTime);
        boolean addWorkout = slot.addWorkout(workoutEntry);
        if (!addWorkout) {
            System.out.println("cannot add more workout to this slot, MAX_LIMIT reached: " + Config.getNumOfWorkoutPerSlot());
            return false;
        }
        DateRange dateRange = new DateRange(startDate, endDate);
        dateRange.addSlot(slot);
        
        Center center = gymDao.getCenter(location);
        center.addDateRange(dateRange);

        return true; 
    }

    @Override
    public void bookSession(String email, String workoutLocation, String workoutType, int startTime, int endTime,
            String date) {
        UserSession userSession = new UserSession(email, workoutLocation, date, workoutType, startTime, endTime);
        userDao.bookUserSession(userSession);
    }

    @Override
    public void viewShedule(String email, String date) {
        List<UserSession> userSessions = userDao.getUserBookingDetail(email);
        userSessions.stream()
            .filter(it-> it.getDate().equals(date))
            .forEach(it-> {
                System.out.println(userSessions);
            });
    }

    
    @Override
    public void viewShedule(String center, String workoutType, String email, String date) {
        List<UserSession> userSessions = userDao.getUserBookingDetail(email);
        userSessions.stream()
            .filter(it-> it.getDate().equals(date))
            .filter(it-> workoutType.equalsIgnoreCase(it.getWorkoutType()))
            .filter(it-> center.equalsIgnoreCase(it.getBookingLocation()))
            .forEach(it-> {
                System.out.println(userSessions);
            });
    }

    @Override
    public void viewWorkoutAvailability(String workoutType, String date) {
        Collection<Center> allCenter = gymDao.getAllCenters();
        for (Center center : allCenter) {
            for (DateRange dateRange : center.getDateRangeMap().values()) {
                if (isWithinDate(dateRange, date)) {
                    for (Slot slot: dateRange.getSlots().values()) {
                        if (slot.isAvailable()) {
                            for (WorkoutEntry workoutEntry: slot.getWorkoutEntres().values()) {
                                if (workoutEntry.getWorkout().getWorkoutType().equalsIgnoreCase(workoutType) &&
                                    workoutEntry.getAvailabilityCount() > 0){
                                        String msg = workoutAvailabilityMessageFromAllCenter(center, slot, workoutEntry);
                                        System.out.println(msg);
                                    } 

                                
                            }
                        }
                    }
                }
            }
        }
    }

    private String workoutAvailabilityMessageFromAllCenter(Center center, Slot slot, WorkoutEntry workoutEntry) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(workoutEntry.getWorkout().getWorkoutType());
        stringBuilder.append(" available at");
        stringBuilder.append(center.getLocation());
        stringBuilder.append(" form " + slot.getStartTime() + " to " + slot.getEndTime());
        stringBuilder.append("available seats: " + (workoutEntry.getAvailabilityCount()));
        return stringBuilder.toString();
    }

    private boolean isWithinDate(DateRange dateRange, String date) {
        return date.compareTo(dateRange.getStartDate()) >= 0 && date.compareTo(dateRange.getEndDate()) <= 0;
    }

    @Override
    public boolean registerUser(User user) {
        return (userDao.addUser(user));
    }
}
