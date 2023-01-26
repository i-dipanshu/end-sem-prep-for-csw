import java.time.LocalDate;

// Qns : get no of days in a month

public class Csw19_No_Of_DaysInMonth {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        System.out.println(today.lengthOfMonth());
    }
}
