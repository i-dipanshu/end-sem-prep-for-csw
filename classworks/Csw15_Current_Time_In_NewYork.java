import java.util.Calendar;
import java.util.TimeZone;

// Write a java program to get current time in new york

public class Csw15_Current_Time_In_NewYork {
    public static void main(String[] args) {
        Calendar cal = Calendar.getInstance();
        cal.setTimeZone(TimeZone.getTimeZone("America/New_York"));
        System.out.println(
                "Current Time in new york = " + cal.get(Calendar.HOUR_OF_DAY) + ":" + cal.get(Calendar.MINUTE));
    }
}
