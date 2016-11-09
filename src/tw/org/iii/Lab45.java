package tw.org.iii;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class Lab45 {
    public static void main(String[] args){
        try {
            URL url = new URL("");
            HttpURLConnection urlConnection =
                    (HttpURLConnection) url.openConnection();
            urlConnection.connect();
            BufferedReader br =
                    new BufferedReader(
                            new InputStreamReader(urlConnection.getInputStream())
                    );
            String line;

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
