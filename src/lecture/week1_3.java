package lecture;

import java.util.Scanner;

public class week1_3 {

    public static void main(String[] args) {

        final int KORKEUS = 10, LEVEYS = 60;

        int i, j;
        char maastosymboli;

        for (i = 1; i <= KORKEUS; i++) {
            for (j = 1; j < LEVEYS; j++) {

                //maastosymboli = '-';

                double satunnaisluku = Math.random();
                if (satunnaisluku < 0.05) {
                    maastosymboli = 'E';
                } else if (satunnaisluku < 0.15) {
                    maastosymboli = 'V';
                } else {
                    maastosymboli = '-';
                }

                System.out.print(maastosymboli);
            }
            System.out.println();
        }
    }
}
