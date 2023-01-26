// Qns: A java program to display prime numbers from 1 to n. n is input given by user

import java.util.Scanner;

public class Csw01_Prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();

        // printing primes
        while (n >= 1) {
            if (isPrime(n)) {
                System.out.print(n + " ");
            }
            n--;
        }
        sc.close();
    }

    // checks if number is prime
    private static boolean isPrime(int num) {
        // finding sqrt of num
        int sqrtOfNum = (int) Math.sqrt(num);

        while (sqrtOfNum >= 2) {
            if (num % sqrtOfNum == 0) {
                return false;
            }
            sqrtOfNum--;
        }
        return true;
    }
}