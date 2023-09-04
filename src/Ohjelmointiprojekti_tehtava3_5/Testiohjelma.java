package Ohjelmointiprojekti_tehtava3_5;

import Ohjelmointiprojekti_tehtava3_5.Palvelupiste2;

import java.util.ArrayList;
import java.util.LinkedList;

import static Ohjelmointiprojekti_tehtava3_5.Palvelupiste2.asiakkaat;
import static Ohjelmointiprojekti_tehtava3_5.Palvelupiste2.poistaJonosta;

public class Testiohjelma {

    private static long total = 0;

    public static void main(String[] args) {
        ArrayList<String> tapahtumalista = new ArrayList<>();
        Kello2 kello = Kello2.getInstance();
        for (int i = 0; i < 10; i++) {
            Saapumisprosessi2 saapuminen = new Saapumisprosessi2("Saapuminen", 0);
            saapuminen.lisaaTapahtumaListaan(tapahtumalista);
        }
        System.out.println("Viimeisimmän luodun tapahtuman kellonaika: " + kello.getAika());



        for (int i = 0; i < tapahtumalista.size(); i++) {
            Asiakas2 asiakas = new Asiakas2();

            //
            String tapahtuma = tapahtumalista.get(i);
            String[] osat = tapahtuma.split(" ");
            String aikaMerkkijono = osat[1];
            long aika = Long.parseLong(aikaMerkkijono);
            total = total + aika;
            asiakas.setAloitusAika(total);
            //System.out.println(total);
            //
            Palvelupiste2.lisaaJonoon(asiakas);
        }
        //Palvelupiste2.tulostaAsiakkaat();
        while (!asiakkaat.isEmpty()) {
            //System.out.println(kello.getAika()); // 591
            long aika = kello.getAika();
            kello.setAika(aika + 5);
            poistaJonosta();
        }
        //Palvelupiste2.tulostaAsiakkaat();

    }


}

