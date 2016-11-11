package tw.org.iii;

import java.io.File;
import java.io.IOException;

public class Lab48 {
    public static void main(String[] args){
        try {
            MultipartUtility mu =
                    new MultipartUtility(
                            "http://10.2.24.102/Lab02.php","utf-8");
            mu.addFilePart("upload", new File("upload/10.2.24.102.jpg"));
            mu.finish();
            System.out.println("Upload ok");
        } catch (IOException e) {
            System.out.println(e.toString());
        }
    }
}
