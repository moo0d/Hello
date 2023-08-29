package lecture;

import java.lang.*;

public class Asiakas {
    private static int curId = 1;
    private int id;
    private long aloitusAika, lopetusAika;

    public Asiakas() {
        this.id = curId++;
        this.aloitusAika = System.currentTimeMillis();
    }

    public int getId() {
        return id;
    }

    public long getAloitusAika() {
        return aloitusAika;
    }

    public static void main(String[] args) {

        Asiakas asiakas1 = new Asiakas();
        Asiakas asiakas2 = new Asiakas();
        System.out.println(asiakas1.getId());
        System.out.println(asiakas2.getId());

    }
}
