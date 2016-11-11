package tw.org.iii;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;

public class Lab47 {
    public static void main(String[] args){
        try {
            URL url = new URL("http://10.2.24.102/Lab02.php?x=123&y=789");
            HttpURLConnection conn =
                    (HttpURLConnection) url.openConnection();
            conn.connect();

            BufferedReader br = new BufferedReader(
                    new InputStreamReader(conn.getInputStream()));
            String line = br.readLine();
            br.close();


            System.out.println(line);
            System.out.println("Finish");

        } catch (IOException e) {

        }
    }
}
