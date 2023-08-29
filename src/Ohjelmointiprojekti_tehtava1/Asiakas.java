package Ohjelmointiprojekti_tehtava1;

import java.lang.*;

public class Asiakas {
    private static int curId = 1;
    private int id;
    private long aloitusAika, lopetusAika, kaytettyAika;
    private long aikaEro;
    public Asiakas() {
        this.id = curId++;
        this.aloitusAika = System.currentTimeMillis();
        this.lopetusAika = 0;
    }

    public int getId() {
        return id;
    }

    public long getAloitusAika() {

        return aloitusAika;
    }
    public long getLopetusAika() {

        return lopetusAika;
    }
    public long getKaytettyAika() {
        aikaEro = lopetusAika - aloitusAika;
        return aikaEro;
    }

    public void setLopetusAika(long lopAika) {
        this.lopetusAika = lopAika;

    }

    public static void main(String[] args) {

        Asiakas asiakas1 = new Asiakas();
        Asiakas asiakas2 = new Asiakas();
        Asiakas asiakas3 = new Asiakas();
        Asiakas asiakas4 = new Asiakas();
        asiakas1.setLopetusAika(System.currentTimeMillis());

        System.out.println(asiakas1.getId());
        System.out.println(asiakas2.getId());
        System.out.println(asiakas3.getId());
        System.out.println(asiakas4.getId());




        System.out.println(asiakas1.getAloitusAika());

        try {
            Thread.sleep(1000); // 1000 ms
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        asiakas1.setLopetusAika(System.currentTimeMillis());
        System.out.println(asiakas1.getLopetusAika());
        System.out.println(asiakas1.getKaytettyAika());
    }
}
