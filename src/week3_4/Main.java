package week3_4;

import java.io.*;
import java.net.*;
import java.util.ArrayList;

public class Main {
    static ArrayList<Double>list = new ArrayList<>();
    private static double total = 0;
    public static void main(String[] args) {

        URL myUrl;
        try {
            myUrl = new URL("https://users.metropolia.fi/~olliv/olio/korvike.csv");
        } catch (MalformedURLException e) {
            System.err.println(e);
            return;
        }

        try {

            InputStream istream = myUrl.openStream();
            InputStreamReader istreamreader = new InputStreamReader(istream);
            BufferedReader reader = new BufferedReader(istreamreader);
            String line;


            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",");
                if (parts.length > 3 && parts[0].equals("1.1.2023")) {
                    list.add(Double.valueOf(parts[3]));
                }
            }
            reader.close();
        } catch (IOException e) {
            System.err.println(e);
        }
        for (double value : list) {
            total = total + value;

        }
        System.out.printf(" Average temperature 1.1.2023: %.2f celcius", total / list.size());
    }
}