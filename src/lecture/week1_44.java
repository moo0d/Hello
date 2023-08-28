package lecture;
import java.util.Random;
public class week1_44 {

    public static void main(String[] args) {

        final int NUMBERS = 7, TOTAL = 39;
        int arvottu;
        int[] line = new int[NUMBERS];
        boolean[] used = new boolean[TOTAL + 1];
        Random random = new Random();




        for (int i = 0; i < NUMBERS; i++) {
            do {
                //arvottu = (int) (Math.random() * TOTAL) + 1;
                arvottu = random.nextInt(TOTAL)+1;
            } while (used[arvottu]);

            used[arvottu] = true;
            line[i] = arvottu;
        }
        java.util.Arrays.sort(line);
        for (int i = 0; i < line.length; i++){
            System.out.println(line[i]);
        }
    }
}