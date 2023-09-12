package week3_4;

import java.io.*;
import java.net.*;

public class Main {
    public static void main(String[] args) {
        // first, create the url
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
            StringBuilder response = new StringBuilder();

            // here we read the content of the web page line by line
            while ((line = reader.readLine()) != null) {
                //response.append(line);
                if (line.split(",")[0].equals("1.1.2023")) {
                    response.append(line.split(",")[3]);

                }
            }
            // now it is time to print the result
            reader.close();
            System.out.println(response.toString());

        } catch (IOException e) {
            System.err.println(e);
        }
    }
}