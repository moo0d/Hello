package Ohjelmointiprojekti_tehtava3;



public class Kello {
    private static Kello INSTANCE = null;
    private long aika;
    private Kello() {}




    public static Kello getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new Kello();
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
