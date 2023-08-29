package week1_3;

import java.util.Scanner;

public class Task3 {

    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);

        int eka, toka;

        System.out.println("Anna ensimmäinen luku:");
        eka = reader.nextInt();
        System.out.println("Anna toinen luku:");
        toka = reader.nextInt();

        while (eka < toka) {
            if (isPrime(eka))
                System.out.print(eka + " ");

            eka++;
        }
    }

    public static boolean isPrime(int num) {
        boolean check = true;
        if (num < 2) {
            return false;
        }
        for (int i = 2; i <= num / 2; ++i) {

            if (num % i == 0) {
                check = false;
                break;
            }
        }

        return check;
    }
}


// Write a program that prompts the user to enter two positive integers, start and end (where start < end).
// The program should generate and display all the prime numbers between start and end, inclusive.
//
// A prime number is a positive integer greater than 1 that has no positive divisors other than 1 and itself.
//
// Your program should use control structures (such as loops and conditional statements) to implement the logic for
// generating and checking prime numbers.