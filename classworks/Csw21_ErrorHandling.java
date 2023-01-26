// Write a program that can produce exceptions and catch 
// them using try, catch, finally blocks

public class Csw21_ErrorHandling {
    public static void main(String[] args) {
        try {
            System.out.println("I will always printed");
            System.out.println("I'll throw an error: " + 10 / 0);
        } catch (Exception e) {
            System.err.println("Error --> " + e);
        } finally {
            System.out.println("I'll be printed regardless of errors");
        }

        System.out.println("I'll be printed only if error is handles above");
    }
}
