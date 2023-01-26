import java.time.LocalDate;

// write a program to get the first and last day of month

public class Csw18_First_And_Last_Day_Of_Month {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        System.out.println("First day: " + today.withDayOfMonth(1).getDayOfWeek());
        System.out.println("Last day: " + today.withDayOfMonth(today.lengthOfMonth()).getDayOfWeek());
    }
}
