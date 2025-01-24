package models;

import java.util.*;

public class Center {
    private String location;
    private Map<String, DateRange> dateRangeMap;

    public Center(String location) {
        this.location = location;
        dateRangeMap = new HashMap<>();
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Map<String, DateRange> getDateRangeMap() {
        return dateRangeMap;
    }

    @Override
    public String toString() {
        return "Center [location=" + location + "]";
    }

    public void addDateRange(DateRange dateRange) {
        String key = new StringBuilder()
                        .append(dateRange.getStartDate())
                        .append("-")
                        .append(dateRange.getEndDate())
                        .toString();
        dateRangeMap.put(key, dateRange);
    }
    
}
