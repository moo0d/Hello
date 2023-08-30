package Ohjelmointiprojekti_tehtava2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;

public class Tapahtumalista {
    private PriorityQueue<Tapahtuma> prioLista = new PriorityQueue<>();

    public void tulostaLista() {
        PriorityQueue<Tapahtuma>prioListaKopio = new PriorityQueue<>();
        prioListaKopio.addAll(prioLista);
        int i = 0;
        System.out.println("\nTapahtumalista:");
        while (i < prioLista.size()) {
            Tapahtuma tapahtuma = prioListaKopio.poll();
            System.out.println("Tapahtuma: " + tapahtuma.getTapNimi() + " Aika : " + tapahtuma.getAika()
                    + " Tapahtumatyyppi: "
                    + tapahtuma.getTapahtumanTyyppi());
            i++;
        }
        System.out.println(" ");
    }

    public void lisaaTapahtuma(Tapahtuma a) {
        prioLista.add(a);
        System.out.println("Tapahtuma '" + a.getTapNimi() + "' lisätty");
    }

    public void poistaTapahtuma() {
        if (!prioLista.isEmpty()) {
            Tapahtuma poista = prioLista.poll();
            System.out.println(poista.getTapNimi() + poista.getTapahtumanTyyppi());
        }
    }

    public static void main(String[] args) {
        Tapahtumalista tapahtumalista = new Tapahtumalista();
        Tapahtuma testJono1 = new Tapahtuma("Jono", 1, Tapahtuma.TapahtumanTyyppi.SAAPUMINEN);
        Tapahtuma testTapahtuma1 = new Tapahtuma("Hoitaja", 1, Tapahtuma.TapahtumanTyyppi.SAAPUMINEN);
        Tapahtuma testTapahtuma2 = new Tapahtuma("Lääkäri", 10, Tapahtuma.TapahtumanTyyppi.POISTUMINEN);
        //Tapahtuma testLaakari = new Tapahtuma("Lääkäri", 10);


        tapahtumalista.lisaaTapahtuma(testJono1);
        tapahtumalista.lisaaTapahtuma(testTapahtuma1);
        tapahtumalista.lisaaTapahtuma(testTapahtuma2);


        //tapahtumalista.tulostaLista();

        //tapahtumalista.poistaTapahtuma();

        tapahtumalista.tulostaLista();



    }
}
