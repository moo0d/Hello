package week1_2;
import java.util.Scanner;

public class Task3 {

    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);

        double luoti = 13.28;
        int naula = 32;
        int leiviska = 20;

        System.out.println("Give weight (g):");
        int weight = Integer.parseInt(reader.nextLine());
        double totalLuoti = weight / luoti;

        System.out.printf("luoti %.2f", totalLuoti);
        System.out.println("naula " + (int)(weight / (luoti * naula)));
        System.out.println("leiviskat" + (int)(weight / ((luoti * naula) * leiviska)));

        // Luoti = 13.28g
        // naula = 424.96g
        // leiviskä = 8,499.2g


    }
}
