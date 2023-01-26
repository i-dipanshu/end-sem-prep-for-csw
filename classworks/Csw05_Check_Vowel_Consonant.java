// Qns: Check whether input character is vowel or consonant

import java.util.Scanner;

public class Csw05_Check_Vowel_Consonant {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a character: ");
        // taking input as lower case
        char input = sc.next().toLowerCase().charAt(0);

        if (search(input)) {
            System.out.println("The input is a vowel");
        } else {
            System.out.println("The input is a consonant");
        }

        sc.close();
    }

    private static boolean search(char input) {
        char[] vowels = { 'a', 'e', 'i', 'o', 'u' };
        for (char vowel : vowels) {
            if (input == vowel) {
                return true;
            }
        }
        return false;
    }
}
