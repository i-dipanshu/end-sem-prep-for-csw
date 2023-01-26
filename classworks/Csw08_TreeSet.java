import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

// Qns: Write a program to create a TreeSet of Integer type 
// and perform below operation 
// 1. display the treeSet
// 2. ask the user to enter a number and search whether the number is present in TreeSet or not
// 3. Remove the element from the TreeSet and display it

public class Csw08_TreeSet {
    public static void main(String[] args) {
        Set<Integer> set = new TreeSet<>();

        // adding few elements
        for (int i = 0; i < 5; i++) {
            set.add(i);
        }

        // 1. display
        System.out.println(set);

        // 2. search
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int input = sc.nextInt();
        System.out.println((set.contains(input)) ? "Element found" : "Element not found");
        sc.close();

        // 3. remove
        set.remove(4);
        System.out.println(set);
    }
}
