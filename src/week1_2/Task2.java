package week1_2;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);

        System.out.println("ENSIMMÄINEN SIVU");
        double eka = Double.parseDouble(reader.nextLine());

        System.out.println("TOINEN SIVU");
        double toka = Double.parseDouble(reader.nextLine());

        double hypotenuusa = Math.sqrt(Math.pow(eka, 2) + Math.pow(toka, 2));

        System.out.printf("hypotenuusa %.2f", hypotenuusa);


    }
}




//Write a program that asks the user for the lengths of the legs of a right triangle and prints the length of the
// hypotenuse of the triangle.