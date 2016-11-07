package tw.org.iii;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class Lab33 {
    public static void main(String[] args){
        try {
            FileOutputStream fout =
                    new FileOutputStream("dir1/file3", true);
            fout.write("Hello, 我的美麗日記\n".getBytes());
            fout.flush();
            fout.close();
        } catch (Exception e) {

        }
    }
}
