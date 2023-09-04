package Ohjelmointiprojekti_tehtava3_5;




public class Tapahtuma2 implements Comparable<Tapahtuma2> {

    private String tapNimi;
    private int aika2;
    private TapahtumanTyyppi2 tapahtumanTyyppi2;

    public enum TapahtumanTyyppi2 {
        SAAPUMINEN, POISTUMINEN
    }

    public Tapahtuma2(String tapNimi, int aika, TapahtumanTyyppi2 tapahtumanTyyppi) {
        this.tapNimi = tapNimi;
        this.aika2 = aika;
        this.tapahtumanTyyppi2 = tapahtumanTyyppi;
    }

    public TapahtumanTyyppi2 getTapahtumanTyyppi() {

        return tapahtumanTyyppi2;
    }
    public String getTapNimi() {

        return tapNimi;
    }
    public long getAika() {

        return aika2;
    }
    public int compareTo(Tapahtuma2 o) {

        return aika2 - o.aika2;
    }

}
