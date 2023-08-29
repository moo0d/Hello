package week1_3;

import java.util.Random;
import java.util.Scanner;

public class Task4 {

    public static void main(String[] args) {

        Random rand = new Random();
        Scanner reader = new Scanner(System.in);

        int score = 0;
        int num1, num2, lasku;


        while (score < 10) {
            num1 = rand.nextInt(10) + 1;
            num2 = rand.nextInt(10) + 1;
            lasku = num1 * num2;
            System.out.println("paljonko on " + num1 + " * " + num2 + "?");
            int vastaus = reader.nextInt();

            if (lasku == vastaus) {
                System.out.println("Oikea vastaus!");
                score = score + 1;

            } else {
                System.out.println("Väärin! aloitat alusta.");
                score = 0;
            }

        }
        if (score == 10) {
            System.out.println("Onnittelut voitit kertotaulu pelin!");
        }
    }
}

// Task 4: Multiplication table exam
//
//In primary school, students must memorize the multiplication tables for numbers 1 to 10.
// Create a program to assist primary school students that presents the user with ten randomly generated
// multiplication problems, where the factors are integers between one and ten.
// After each answer, the program indicates whether it was correct or not.
// The user receives one point for each correctly answered question.
// If the user scores ten points for the entire set of problems, the program congratulates them on mastering
// the multiplication tables and terminates. Otherwise, the program starts a new set of problems.