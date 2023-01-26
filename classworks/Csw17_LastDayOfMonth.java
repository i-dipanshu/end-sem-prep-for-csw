import java.time.LocalDate;

// Write a program to get the last day of month

public class Csw17_LastDayOfMonth {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        LocalDate lastDate = today.withDayOfMonth(today.lengthOfMonth());
        System.out.println("Last Date of month is : " + lastDate);
        System.out.println("Last Day of month is : " + lastDate.getDayOfWeek());

    }
}
