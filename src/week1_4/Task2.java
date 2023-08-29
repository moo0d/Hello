package week1_4;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);
        int maxSum = 0, sum = 0, countEnd = 0, countStart = 0, countOn = 0;

        // Käyttäjä määrittää listan koon ja asettaa kokonaisluvut tauluun.

        System.out.print("Enter the size of the array: ");
        int arraySize = reader.nextInt();
        int[] numbers = new int[arraySize];

        System.out.println("Enter the integers into the array: ");

        for (int i = 0; i < arraySize; i++) {
            System.out.print("Enter integer " + (i + 1) + ": ");
            numbers[i] = reader.nextInt();

        }

        // Lista käydään läpi
        for (int i = 0; i < arraySize; i++){
            sum = sum + numbers[i];

            // Jos sum ylittää maxSum -> maxSum saa arvon sum.
            // Countstart alkaa nollasta ja countEnd  päivittyy jos sum on korkeampi kuin maxSum.

            if (sum > maxSum){
                maxSum = sum;
                countStart = countOn;
                countEnd = i;
            }

            // Jos sum alittaa nollan -> sum nollataan ja countOn ottaa talteen indeksin ja plussaa siihen ykkösen.
            else if (sum < 0) {
                sum = 0;
                countOn = i + 1;


            }
        }
        // Tulostetaan ohjeen mukaisesti. countStart ja countEnd lisätään +1, koska indeksi alkaa nollasta.
        System.out.println("\nMaxinum sum: " + maxSum);
        System.out.println("Integers: " + (countStart + 1) + "-" + (countEnd + 1));
    }
}