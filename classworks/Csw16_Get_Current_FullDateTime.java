import java.util.Calendar;

// Write a program to get full date and time

public class Csw16_Get_Current_FullDateTime {
    public static void main(String[] args) {

        Calendar cal = Calendar.getInstance();

        System.out.println("Current Time: " + cal.getTime());
    }
}
