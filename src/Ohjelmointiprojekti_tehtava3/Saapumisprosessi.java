package Ohjelmointiprojekti_tehtava3;
import eduni.distributions.Uniform;
import java.util.ArrayList;




public class Saapumisprosessi {
    private String tapahtuma;
    private long aika;

    public Saapumisprosessi(String tapahtuma, long aika) {
        this.tapahtuma = tapahtuma;
        this.aika = aika;

    }
    public void lisaaTapahtumaListaan(ArrayList<String> tapahtumalista) {
        Kello kello = Kello.getInstance();
        //System.out.println(kello.getAika());
        Uniform uniform = new Uniform(1, 100);
        long satunnaisluku = (long) uniform.sample();
        this.aika = satunnaisluku;
        kello.setAika(kello.getAika() + satunnaisluku);

        tapahtumalista.add("Tapahtuma: \"" + tapahtuma + "\" Saapumisaika: \"" + aika + "\" Kello: " + kello.getAika());


    }
    public static void main (String[] args) {
        ArrayList<String> tapahtumalista = new ArrayList<>();
        Saapumisprosessi tapahtuma = new Saapumisprosessi("Saapuminen" , 0);
        for (int i = 0; i < 10; i++) {
            tapahtuma.lisaaTapahtumaListaan(tapahtumalista);

        }
        for (String tapahtumaL : tapahtumalista){
            System.out.println(tapahtumaL);

        }

    }
}
