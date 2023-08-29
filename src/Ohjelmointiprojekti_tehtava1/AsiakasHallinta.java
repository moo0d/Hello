package Ohjelmointiprojekti_tehtava1;

import java.util.LinkedList;
import java.util.Scanner;

public class AsiakasHallinta {

    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);
        LinkedList<Object> asiakkaat = new LinkedList<Object>();

        while (true) {
            System.out.println("Valitse toimenpide painamalla 1-3 ja enter");
            System.out.println("1. Lisää asiakas");
            System.out.println("2. Poista asiakas");
            System.out.println("3. Lopeta ohjelma");
            int paatos = reader.nextInt();


            if (paatos == 1) {
                Asiakas uusiAsiakas = new Asiakas();
                asiakkaat.add(uusiAsiakas);
                System.out.println("Asiakas " + uusiAsiakas.getId() + " lisätty jonoon");

            }
            else if (paatos == 2) {
                Asiakas poistettuAsiakas = (Asiakas) asiakkaat.remove();
                poistettuAsiakas.setLopetusAika(System.currentTimeMillis());
                System.out.println("Asiakas " + poistettuAsiakas.getId() + " poistettu jonosta. Asiakas ollut jonossa " +
                        poistettuAsiakas.getKaytettyAika() + "ms.\n");


            }
            else if (paatos == 3) {
                System.out.println("Ohjelma sulkeutuu.");
                break;
            }
        }
    }
}
