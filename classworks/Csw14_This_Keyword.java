// Write a program to demonstrate the use this keyword in following cases
// 1. current class method can be invoked implicitly by this
// 2. a method args can contain this
// 3. a constructor arg can contain this
// 4. a method can return this

public class Csw14_This_Keyword {
    public static void main(String[] args) {
        Person p = new Person("John", new Hand());
        p.get().callDisplayName();
    }
}

class Person {

    Hand hand;

    String name;

    Person(String name, Hand hand) {
        this.name = name;
        this.hand = hand;
    }

    // 4. a method can return this --> returning current object
    Person get() {
        return this;
    }

    void display(Person p) {
        System.out.println("Name = " + p.name);
        System.out.println("No. of Hands = " + p.hand.count);
    }

    void callDisplayName() {
        // 1. current class method can be invoked implicitly by this
        // 2. a method args can contain this
        this.display(this);
    }
}

class Hand {
    int count = 2;

    Hand() {
        // 3. a constructor arg can contain this
        Person p = new Person("Samuel", this);
    }

}