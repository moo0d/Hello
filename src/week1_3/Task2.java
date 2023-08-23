package week1_3;
import java.util.Scanner;
public class Task2 {

    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);

        String binary;
        int decimal;

        System.out.println("Anna binäärilukuja: ");
        binary = reader.nextLine();

        decimal = Integer.parseInt(binary,2);


        System.out.println(decimal);



    }
}

// Write a program that prompts the user to enter a binary number (composed of 0s and 1s)
// and converts it to decimal. Display the decimal equivalent on the console.
// Hint: use the charAt method of the String class to retrieve the individual bits in the input string.