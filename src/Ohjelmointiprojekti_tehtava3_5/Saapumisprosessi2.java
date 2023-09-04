package Ohjelmointiprojekti_tehtava3_5;

import Ohjelmointiprojekti_tehtava3.Kello;
import eduni.distributions.Uniform;

import java.util.ArrayList;



public class Saapumisprosessi2 {

    private String tapahtuma;
    private long aika;

    public Saapumisprosessi2(String tapahtuma, long aika) {
        this.tapahtuma = tapahtuma;
        this.aika = aika;

    }

    public long getAika() {
        return aika;
    }


    public void lisaaTapahtumaListaan(ArrayList<String> tapahtumalista) {
        Kello2 kello = Kello2.getInstance();
        //System.out.println(kello.getAika());
        Uniform uniform = new Uniform(1, 100);
        long satunnaisluku = (long) uniform.sample();
        this.aika = satunnaisluku;
        kello.setAika(kello.getAika() + satunnaisluku);

        tapahtumalista.add(tapahtuma + " " + aika);


    }

    public static void main(String[] args) {
        ArrayList<String> tapahtumalista = new ArrayList<>();
        Saapumisprosessi2 tapahtuma = new Saapumisprosessi2("Saapuminen", 0);

        for (int i = 0; i < 10; i++) {
            tapahtuma.lisaaTapahtumaListaan(tapahtumalista);

        }
        for (String tapahtumaL : tapahtumalista) {
            System.out.println(tapahtumaL);

        }

    }
}
