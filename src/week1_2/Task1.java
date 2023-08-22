package week1_2;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);


        System.out.println("Enter the number in Fahrenheit:");
        double fahrenheit = Double.parseDouble(reader.nextLine());

        double celsius = ((fahrenheit - 32) * ((double) 5 / 9));

        System.out.printf("%.1f celsius",celsius);

    }
}


