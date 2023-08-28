package lecture;

public class week1_4 {

    public static void main(String[] args) {

        final int NUMBERS = 7, TOTAL = 39;
        int arvottu;
        int[] line = new int[NUMBERS];
        boolean found;

        for (int i = 0; i < NUMBERS; i++) {
            do {
                arvottu = (int) (Math.random() * TOTAL) + 1;
                found = false;
                for (int j = 0; j <= i - 1; j++){
                    if (line[j] == arvottu) {
                        found = true;
                        System.out.println("duplicate" + line[j]);

                    }
                }
            } while (found);
            line[i] = arvottu;
        }
        java.util.Arrays.sort(line);
        for (int i = 0; i < line.length; i++){
            System.out.println(line[i]);
        }
    }
}