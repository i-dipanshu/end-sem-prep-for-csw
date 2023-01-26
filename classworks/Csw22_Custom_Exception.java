// Qns --> Write a program with user defined MyException 

public class Csw22_Custom_Exception {
    public static void main(String[] args) {
        try {
            throw new MyException("Null Pointer Exception");

        } catch (MyException e) {
            System.out.println(" Exception Caught --> " + e);
        }
    }
}

// our custom MyException handler
class MyException extends Exception {
    MyException(String str) {
        super(str);
    }
}
