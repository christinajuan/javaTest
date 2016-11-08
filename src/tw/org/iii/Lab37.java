package tw.org.iii;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Lab37 {
    public static void main(String[] args){
        try {
            ObjectInputStream oin =
                    new ObjectInputStream(new FileInputStream("dir1/brad.oo"));
            Object obj = oin.readObject();
            Student s2 = (Student) obj;
            System.out.println(s2.name + ":" + s2.caleScore() + ":" + s2.calcAvg());
            oin.close();
        } catch (ClassNotFoundException e) {

        } catch (IOException e) {

        }
    }

}
