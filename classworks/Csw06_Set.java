// Qns : Write java program to implement following methods of set interface
// 1--> add - adds a new element 
// 2--> remove - remove the element passed as parameter
// 3--> contains - check if a element is present or not
// 4--> isEmpty - check if a set is empty or not
// 5--> clear - removes all element from the set
// 6--> add a linked list to set and display the result

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;

public class Csw06_Set {
    public static void main(String[] args) {
        Set<Integer> s = new HashSet<Integer>();

        // 1. add
        for (int i = 0; i < 10; i++) {
            s.add(i);
        }

        System.out.println(s);

        // 2. remove
        s.remove(1);

        System.out.println(s);

        // 3. contains
        System.out.println(s.contains(4));

        // 4. isEmpty
        System.out.println(s.isEmpty());

        // 5. clear
        s.clear();

        System.out.println(s);

        // 6. creating a linked list and adding to set
        LinkedList<Integer> l = new LinkedList<>();
        for (int i = 0; i < 5; i++) {
            l.add(i);
            l.add(i + 1);
        }

        System.out.println(l); // we could see duplicate elements in the linked list

        // adding the linked list to set
        s.addAll(l);

        System.out.println(s); // all duplicates removed
    }
}
