package Ohjelmointiprojekti_tehtava1;

import java.util.LinkedList;
import java.util.Scanner;
import java.util.Random;

public class Palvelupiste {
    static LinkedList<Object> asiakkaat = new LinkedList<Object>();
    static int i = 1, j = 0;
    static long keskiaika = 0;
    public static void lisaaJonoon(Asiakas a) {
        asiakkaat.add(a);

    }

    public static Object poistaJonosta() {
        Asiakas poistettuAsiakas = (Asiakas) asiakkaat.remove();
        poistettuAsiakas.setLopetusAika(System.currentTimeMillis());
        keskiaika = keskiaika + poistettuAsiakas.getKaytettyAika();
        return poistettuAsiakas.getKaytettyAika();
    }

    public static void palvele() {
        System.out.println("Palvellaan asiakkaita...");
        while (!asiakkaat.isEmpty()) {

            Random random = new Random();
            try {
                Thread.sleep(random.nextInt(2001) + 1000);
            } catch (InterruptedException e) {
                e.printStackTrace();

            }

            System.out.println("Asiakas " + i + " poistuu jonosta ajassa " + poistaJonosta() + "ms");
            i++;
            j++;
        }
        System.out.println("Keskiaika jonossa " + keskiaika / j + "ms");
        keskiaika = 0;
        j = 0;
    }

    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);

        while (true) {
            System.out.println("\nValitse toimenpide painamalla 1-3 ja enter");
            System.out.println("1. Lisää asiakas");
            System.out.println("2. Palvele asiakkaita");
            System.out.println("3. Lopeta ohjelma");
            int paatos = reader.nextInt();


            if (paatos == 1) {
                Asiakas uusiAsiakas = new Asiakas();
                lisaaJonoon(uusiAsiakas);
                System.out.println("Asiakas " + uusiAsiakas.getId() + " lisätty jonoon");

            }
            else if (paatos == 2) {
                palvele();

            }
            else if (paatos == 3) {
                break;

            }

        }

    }
}