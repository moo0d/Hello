package week1_3;

import java.util.Scanner;

public class Task1 {

    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);

        double a, b, c, rootOne, rootTwo, discriminant;

        System.out.println("Let's calculate a quadratic equation \nax^2 + bx + c = 0");
        System.out.println("Insert a:");
        a = Double.parseDouble(reader.nextLine());

        System.out.println("Insert b:");
        b = Double.parseDouble(reader.nextLine());

        System.out.println("Insert c:");
        c = Double.parseDouble(reader.nextLine());

        // Calculates the discriminant
        discriminant = b * b - 4 * a * c;

        // If the discriminant is smaller than 0 -> there are no real roots.
        if (discriminant < 0) {

            System.out.println("No real roots");

        // If the discriminant is 0 -> there is one real root.
        } else if (discriminant == 0) {
            rootOne = -b / (2 * a);

            System.out.println("One real root:  " + rootOne);

        // If the discriminant is greater than 0 -> there are two real roots.
        } else if (discriminant > 0) {
            rootOne = (-b - Math.sqrt(discriminant)) / (2 * a);
            rootTwo = (-b + Math.sqrt(discriminant)) / (2 * a);

            System.out.println("First real root " + rootOne);
            System.out.println("Second real root " + rootTwo);
        }

    }
}


// Write a program that prompts the user to enter the coefficients of a quadratic equation
// (ax^2 + bx + c = 0) and calculates its roots using the quadratic formula.
// Display the roots on the console. If the equation has no real roots, display the message "No real roots".