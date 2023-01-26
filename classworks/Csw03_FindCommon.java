// Qns : Write a java program to find common elements between two ArrayList

import java.util.ArrayList;
import java.util.List;

public class Csw03_FindCommon {
    public static void main(String[] args) {
        List<Integer> l1 = new ArrayList<>();
        List<Integer> l2 = new ArrayList<>();

        // adding elements to lists
        for (int i = 0; i < 20; i++) {
            if (i % 2 == 0) {
                l1.add(i);
            }
            if (i % 3 == 0) {
                l2.add(i);
            }
        }

        List<Integer> common = new ArrayList<Integer>(l1);
        // storing the common elements from two lists in a new list
        common.retainAll(l2);
        System.out.println(common);
    }
}
