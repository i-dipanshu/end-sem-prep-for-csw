import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

// Qns: Find the frequency of each digit of a number

public class Csw11_Frequency_EachDigit {
    public static void main(String[] args) {
        // creating a hashmap
        // to store digit and frequency as key-value pair
        Map<Integer, Integer> map = new HashMap<>();

        // take input
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int input = sc.nextInt();

        while (input != 0) {
            // getting the last digit
            int digit = input % 10;

            // if digit present in map, increase it frequency
            if (map.containsKey(digit)) {
                map.put(digit, map.get(digit) + 1);
            } else {
                // if not present, put it in the map with frequency 1
                map.put(digit, 1);
            }

            // removing the current last digit
            input /= 10;
        }

        System.out.println("{ Digit = Frequency }");
        System.out.println(map);

        sc.close();

    }
}
