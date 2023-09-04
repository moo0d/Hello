package Ohjelmointiprojekti_tehtava3_5;

public class Kello2 {
    private static Kello2 INSTANCE = null;
    private long aika;
    private Kello2() {}




    public static Kello2 getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new Kello2();
        }
        return INSTANCE;
    }

    public long getAika() {
        return aika;
    }

    public void setAika(long aikaUusi) {
        aika = aikaUusi;
    }
}
