package Ohjelmointiprojekti_tehtava2;
import java.util.Random;
public class Testiajo {



    public static void main(String[] args) {

        int nolla = 0, yksi = 0, kaksi = 0, kolme = 0, n;
        Random rand = new Random();


        // huomioita: sain tarkempia prosenttimääriä ulos kun nostin kierrosten määrän 1000-10000.

        for (int i = 0; i < 1000; i++) {
            n = rand.nextInt(100)+1;

            if (n > 0 && n <= 10) {
                nolla += 1;
            }
            else if (n > 10 && n <= 30) {
                yksi += 1;
            }
            else if (n > 30 && n <= 80) {
                kaksi += 1;
            }
            else if (n > 80 && n < 101) {
                kolme += 1;
            }

        }
        System.out.println("18-20v " + Math.round(((double) nolla / 1000) * 100) + "% ");
        System.out.println("21-23v " + Math.round(((double) yksi / 1000) * 100) + "% ");
        System.out.println("24-27v " + Math.round(((double) kaksi / 1000) * 100) + "% ");
        System.out.println("28-->v " + Math.round(((double) kolme / 1000) * 100) + "% ");

    }
}
