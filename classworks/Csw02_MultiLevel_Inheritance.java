// Qns: Write a java program to show multi-level inheritance

// multi-level = class A -> class B -> class C
public class Csw02_MultiLevel_Inheritance {
    public static void main(String[] args) {
        Car car = new Car();
        car.wheel();
    }
}

class Rubber {
    void wheel() {
        System.out.println("I am Rubber");
    }
}

class Wheel extends Rubber {
    void wheel() {
        System.out.println("I am Wheel");
    }
}

class Car extends Wheel {
    void car() {
        System.out.println("I am Car");
    }
}
