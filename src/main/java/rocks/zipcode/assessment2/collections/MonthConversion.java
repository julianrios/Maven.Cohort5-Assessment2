package rocks.zipcode.assessment2.collections;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/**
 * Use a map to solve
 */
public class MonthConversion {
    /**
     * @param monthNumber - ordinal of month in the year; i.e. January = 1, February = 2
     * @param monthName - name of month
     */

    private Map<Integer, String> calendar;

    public MonthConversion() {
        this.calendar = new TreeMap<>();
    }

    public void add(Integer monthNumber, String monthName) {
        this.calendar.put(monthNumber, monthName);
    }

    /**
     * @param monthNumber - ordinal of month in the year
     * @return the name of the respective month
     */
    public String getName(Integer monthNumber) {
        return calendar.get(monthNumber);
    }

    /**
     * @param monthName - name of month
     * @return - the ordinal of the month in the year
     */
    public Integer getNumber(String monthName) {
        Set<Map.Entry<Integer, String>> entries = this.calendar.entrySet();
        Integer month = null;
        for(Map.Entry<Integer, String> entry : entries) {
            if(entry.getValue().equals(monthName)) {
                month = entry.getKey();
            }
        }
        return month;
    }

    /**
     * @param monthNumber
     * @return true if the monthNumber is in the keySet
     */
    public Boolean isValidNumber(Integer monthNumber) {
        Set<Map.Entry<Integer, String>> entries = this.calendar.entrySet();

        for(Map.Entry<Integer, String> entry : entries) {
            if(entry.getKey().equals(monthNumber)) {
                return true;
            }
        }
        return false;
    }

    /**
     * @param monthName
     * @return true if the monthName is in the valueSet
     */
    public Boolean isValidMonth(String monthName) {
        Set<Map.Entry<Integer, String>> entries = this.calendar.entrySet();

        for(Map.Entry<Integer, String> entry : entries) {
            if(entry.getValue().equals(monthName)) {
                return true;
            }
        }
        return false;
    }

    /**
     * @return number of entries in this mapping
     */
    public Integer size() {
        return this.calendar.size();
    }

    /**
     * @param monthNumber - number of month in year
     * @param monthName - name of month
     */
    public void update(Integer monthNumber, String monthName) {
        this.calendar.put(monthNumber, monthName);
    }
}
