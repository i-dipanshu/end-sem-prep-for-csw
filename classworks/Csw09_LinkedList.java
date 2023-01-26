import java.util.LinkedList;
import java.util.Scanner;

// Create a class Student having member variables name, age and mark. 
// Create a LinkedList of student type and perform the below operations on it.
// (a) Display the list.
// (b) Ask the user to enter a student name and search if that student is present in the list or not.
// If present, display its other details.
// (c) Remove a specific student object.
// (d) Count the number of student objects present in the list.

public class Csw09_LinkedList {
    public static void main(String[] args) {
        // data
        String[] students = { "Sam", "Ram", "Val", "Kia" };
        int[] age = { 18, 20, 17, 19 };
        double[] mark = { 99.34, 90, 94.3, 96.4 };

        LinkedList<Student> list = new LinkedList<>();

        // 1. adding elements and displaying
        for (int i = 0; i < students.length; i++) {
            list.add(new Student(students[i], age[i], mark[i]));
        }
        System.out.println(list);

        // 2. search for a student
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a student name: ");
        String input = sc.next().trim();
        sc.close();

        // displaying the details of student in present
        int i = 0;
        for (Student student : list) {
            if (input.compareTo(student.name) == 0) {
                System.out.println(student);
                break;
            }
            i++;
        }
        // 3. remove
        list.remove(i);
        System.out.println(list);

        // 4. size
        System.out.println("Size of List is: " + list.size());
    }
}

class Student {
    String name;
    int age;
    double mark;

    Student(String name, int age, double mark) {
        this.name = name;
        this.age = age;
        this.mark = mark;
    }

    @Override
    public String toString() {
        return "{ Name: " + name + ", Age: " + age + ", Mark: " + mark + " }";
    }
}