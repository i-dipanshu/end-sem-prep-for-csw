// Qns: Write a program to demonstrate Wrapper, AutoBoxing and unboxing

public class Csw23_Wrapper {
    public static void main(String[] args) {
        // Creating an Integer Object using a primitive int --> AutoBoxing
        int a = 10;
        Integer i = a;

        // creating a primitive type from Wrapper --> unboxing
        int c = i;
        System.out.println(c);

        // Uses of wrapper class
        System.out.println(i.doubleValue()); // doubles the value
        System.out.println(i.hashCode()); // get the hash code

    }
}
