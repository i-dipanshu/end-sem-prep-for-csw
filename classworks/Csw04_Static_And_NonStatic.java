// Qns: Write a program to show difference between static and non-static method

// static methods can be called without creating a instance while non-static method couldn't

public class Csw04_Static_And_NonStatic {
    public static void main(String[] args) {
        staticMethod();
        Demo d = new Demo();
        d.nonStaticMethod();
    }

    private static void staticMethod() {
        System.out.println("I'm a static method.");
    }
}

class Demo {
    void nonStaticMethod() {
        System.out.println("I am non-static method.");
    }
}