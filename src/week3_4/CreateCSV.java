package week3_4;

import java.io.*;
import java.io.File;
import java.util.ArrayList;

public class CreateCSV {
    private static int number1 = 0;
    private static int number2 = 1;
    private static int number3;
    private final static String FILENAME = "fibonacci.csv";
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < 100; i++) {
            if (i == 0) {
                list.add(0);
                list.add(1);
            }
            else if (i > 1) {
                number3 = number1 + number2;
                number1 = number2;
                number2 = number3;
                list.add(number3);
            }
        }
        for (int i = 0; i < list.size(); i++) {
            System.out.println(i + ". " + list.get(i));
        }

        try {
            File f = new File(FILENAME);
            FileWriter fileWriter = new FileWriter(f);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            String header = "Index, Number";
            bufferedWriter.write(header);
            bufferedWriter.newLine();
            for (int i = 0; i < list.size(); i++) {
                bufferedWriter.write(String.valueOf(i + 1));
                bufferedWriter.write(",");
                bufferedWriter.write(String.valueOf(list.get(i)));
                bufferedWriter.newLine();
            }
            //bufferedWriter.write(String.valueOf(list));
            bufferedWriter.close();
            System.out.println("CSV file created succesfully.");

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

