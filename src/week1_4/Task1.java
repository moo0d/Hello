package week1_4;
import java.util.Scanner;
import java.util.Random;
public class Task1 {

    public static void main(String[] args) {
        String[] firstNames = {"Pekka", "Joonatan", "Simo", "Juhani", "Liisa", "Sami", "Elias", "Anni", "Anna",
        "Johanna", "Hannele", "Mikko", "Jukka", "Ismo", "Hanne", "Sari"};
        String[] lastNames = {"Nieminen", "Mikkonen", "Kuistinen", "Lahti", "Virtanen", "Korhonen", "Mattila", "Häyhä",
        "Suominen", "Rinne", "Pekkala", "Jyvänen", "Harjala", "Pitkänen", "Pitkälä", "Koskinen"};

        Scanner reader = new Scanner(System.in);
        Random rand = new Random();
        System.out.println("How many random names the program should generate?");
        int amount = reader.nextInt();

        for (int i = 0; i < amount; i++) {
            int num1 = rand.nextInt(16);
            int num2 = rand.nextInt(16);
            System.out.println(firstNames[num1] + " " + lastNames[num2]);
        }

    }
}







//Task 1: A name generator
//
//Write a program that generates random names by combining first and last names from hard-coded name arrays.
// The program should work as follows:
//
//Create two arrays, firstNames and lastNames, which contain first and last names.
//
//Ask the user how many random names the program should generate.
//
//Generate random names using the following logic:
//
//Choose the index value for the first name randomly.
//Choose the index value for the last name randomly.
//Use the index values to create a random full name (i.e. first name and last name).
//Print the generated full name.
//Repeat these steps as many times as the user-specified number of names to generate.