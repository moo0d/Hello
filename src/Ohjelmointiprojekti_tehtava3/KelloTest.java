package Ohjelmointiprojekti_tehtava3;


import eduni.distributions.Uniform;

public class KelloTest {

    public static void main(String[] args) {

        Kello kello = Kello.getInstance();
        System.out.println(kello.getAika());
        kello.setAika(2000);
        System.out.println(kello.getAika());
        kello.setAika(3000);
        System.out.println(kello.getAika());

        Uniform uniform = new Uniform(0.0, 1.0);
        System.out.println(uniform.sample());
    }
}
