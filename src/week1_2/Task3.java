package week1_2;
import java.util.Scanner;

public class Task3 {

    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);

        double luoti = 13.28;
        double naula = luoti * 32;
        double leiviska = naula * 20;

        System.out.println("Give weight (g):");
        int paino = Integer.parseInt(reader.nextLine());

        int laskuLeiviska = (int)(paino / leiviska);
        double painoJaannos1 = paino - (laskuLeiviska * leiviska);

        int laskuNaula = (int)(painoJaannos1 / naula);
        double painoJaannos2 = painoJaannos1 - (laskuNaula * naula);

        double laskuLuoti = painoJaannos2 / luoti;
        double roundedLaskuluoti = Math.round(laskuLuoti * 100.0) / 100.0;

        System.out.println(paino + " grams is " + laskuLeiviska + " leiviskä, " + laskuNaula + " naula, and " +
                roundedLaskuluoti + " luoti.");

        // Luoti = 13.28g
        // naula = 424.96g
        // leiviskä = 8,499.2g


    }
}
