import java.util.HashMap;
import java.util.Map;

// Qns : Find the frequency of each element present in an array

public class Csw12_Frequency_In_Array {
    public static void main(String[] args) {

        // given array
        int[] arr = { 1, 2, 2, 1, 3, 5, 1, 5, 6, 7, 5, 6, 8, 9, 1, 2, 5, 6 };

        // creating a HashMap to store answer
        // key --> element of arr & value --> its frequency
        Map<Integer, Integer> map = new HashMap<>();

        for (int e : arr) {
            if (map.containsKey(e)) {
                map.put(e, map.get(e) + 1);
            } else {
                map.put(e, 1);
            }
        }

        System.out.println("{ Element = Frequency }");
        System.out.println(map);

    }
}
