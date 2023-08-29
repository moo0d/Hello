package week1_4;
import java.util.Scanner;


public class Task3 {

    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int arraySize = reader.nextInt();
        boolean check;
        int[] numbers = new int[arraySize];
        int[] finalNumbers = new int[arraySize];
        int j = 0;

        System.out.println("Enter integers in the array ");


        // Lisätään kokonaisluvut listaan numbers.
        for (int i = 0; i < arraySize; i++) {
            System.out.print("Enter integer " + (i + 1) + ": ");
            numbers[i] = reader.nextInt();
        }

        // Käydään läpi numbers-taulukon alkioita ja poistetaan duplikaatit finalNumbers-taulukosta.
        for (int i = 0; i < arraySize; i++) {
            check = false;
            // Tarkistetaan, onko numbers[i] jo finalNumbers-taulukossa.
            for (int k = 0; k < j; k++) {
                if (numbers[i] == finalNumbers[k]) {
                    check = true;
                    break;
                }
            }
            // Jos numbers[i] ei ole duplikaatti, lisätään se finalNumbers-taulukkoon ja päivitetään j.
            if (!check) {
                finalNumbers[j++] = numbers[i];
            }
        }

        System.out.println("The array without duplicates:");
        for (int i = 0; i < j; i++) {
            System.out.print(finalNumbers[i] + " ");
        }
    }
}