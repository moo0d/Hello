package Ohjelmointiprojekti_tehtava2;


public class Tapahtuma implements Comparable<Tapahtuma> {

    private String tapNimi;
    private int aika;
    private TapahtumanTyyppi tapahtumanTyyppi;

    public enum TapahtumanTyyppi {
        SAAPUMINEN, POISTUMINEN
    }

    public Tapahtuma(String tapNimi, int aika, TapahtumanTyyppi tapahtumanTyyppi) {
        this.tapNimi = tapNimi;
        this.aika = aika;
        this.tapahtumanTyyppi = tapahtumanTyyppi;
    }

    public TapahtumanTyyppi getTapahtumanTyyppi() {
        return tapahtumanTyyppi;
    }
    public String getTapNimi() {
        return tapNimi;
    }
    public long getAika() {
        return aika;
    }
    public int compareTo(Tapahtuma o) {
        return aika - o.aika;
    }

}
