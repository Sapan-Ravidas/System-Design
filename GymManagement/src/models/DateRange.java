package models;

import java.util.HashMap;
import java.util.Map;

public class DateRange implements Comparable<DateRange>{
    private String startDate;
    private String endDate;
    private Map<String, Slot> slots; 

    public DateRange(String startDate, String endDate) {
        this.startDate = startDate;
        this.endDate = endDate;
        slots = new HashMap<>();
    }

    @Override
    public int compareTo(DateRange o) {
        return startDate.compareTo(endDate);
    }
    public String getStartDate() {
        return startDate;
    }
    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }
    public String getEndDate() {
        return endDate;
    }
    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }
    public Map<String, Slot> getSlots() {
        return slots;
    }
    @Override
    public String toString() {
        return "DateRange [startDate=" + startDate + ", endDate=" + endDate + "]";
    }
    
    public void addSlot(Slot slot) {
        String key = new StringBuilder()
                        .append(slot.getStartTime())
                        .append("-")
                        .append(slot.getEndTime())
                        .toString();    
        slots.put(key, slot);
    }
}
