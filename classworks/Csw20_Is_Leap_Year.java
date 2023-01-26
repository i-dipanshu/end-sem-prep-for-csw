import java.time.LocalDate;

// Write a program to check whether a year is leap or not

public class Csw20_Is_Leap_Year {
    public static void main(String[] args) {
        int year = 2020;
        LocalDate date = LocalDate.ofYearDay(year, 1);

        System.out.println(date.isLeapYear() ? "Leap Year!!" : "Not Leap Year");
    }

}
