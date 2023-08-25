package week1_1;
import java.util.Scanner;

public class Task3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("Give the first number:");

        int first = Integer.parseInt(scanner.nextLine());

        System.out.println("Give the second number:");
        int second = Integer.parseInt(scanner.nextLine());

        System.out.println("Give the third number:");
        int third = Integer.parseInt(scanner.nextLine());

        // Numbers muuttujan luonti, jonka avulla voidaan laskea jakolasku oikein. (ettei vastaus ole kokonaisluku)
        double numbers = first + second + third;

        System.out.println("The sum of the numbers is " + (first + second + third));
        System.out.println("The product of the numbers is " + (first * second * third));
        // Printtaan vastauksen 13 desimaalin tarkkuuteen. Ilman String.formatia luku oli 15 desimaalin tarkkuudella.
        System.out.println("The average of the numbers is " + String.format("%.13f", (numbers / 3)));
    }

}