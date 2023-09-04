package Ohjelmointiprojekti_tehtava3_5;

import Ohjelmointiprojekti_tehtava1.Asiakas;

import java.util.LinkedList;
import java.util.Random;


public class Palvelupiste2 {

    static LinkedList<Object> asiakkaat = new LinkedList<Object>();
    static int i = 1, j = 0;
    static long keskiaika = 0;

    public static void lisaaJonoon(Asiakas2 a) {
        asiakkaat.add(a);

    }

    public static void tulostaAsiakkaat() {
        for (Object asiakas : asiakkaat) {
            Asiakas2 asiakas2 = (Asiakas2) asiakas;
            System.out.println(asiakas2.getId() + " " + asiakas2.getAloitusAika() + " " + asiakas2.getLopetusAika());

        }
    }


    public static void poistaJonosta() {
        Asiakas2 poistettuAsiakas = (Asiakas2) asiakkaat.remove();
        poistettuAsiakas.setLopetusAika(Kello2.getInstance().getAika());
        long aloitus = poistettuAsiakas.getAloitusAika();
        long lopetus = poistettuAsiakas.getLopetusAika();

        long aikaJonossa = lopetus - aloitus;
        System.out.println("Asiakas: " + poistettuAsiakas.getId() +
                " Aloitusaika: " + poistettuAsiakas.getAloitusAika() + " Lopetusaika: "
                + poistettuAsiakas.getLopetusAika() + " Jonossa vietetty aika: " + aikaJonossa);
    }
}

/*
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

}
*/