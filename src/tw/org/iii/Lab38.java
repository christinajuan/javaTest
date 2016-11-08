package tw.org.iii;

import java.io.*;
import java.io.FileOutputStream;
import java.io.EOFException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Lab38 {
    public static void main(String[] args){
        //序列化
        Brad383 obj = new Brad383();
        try {
            ObjectOutputStream oout = new ObjectOutputStream(
                    new FileOutputStream("dir1/brad.o2"));
            oout.flush();
            oout.close();
        } catch (Exception ee) {System.out.println(ee.toString());}
        System.out.println("--------");
        //解序列化
        try {
            ObjectInputStream oin = new ObjectInputStream(
                    new FileInputStream("dir1/brad.o2"));
            Brad383 obj3 = (Brad383)oin.readObject();
            oin.close();
            System.out.println("ok");
        } catch (Exception e) {System.out.println(e.toString());}
    }
}
class Brad381{
    Brad381(){System.out.println("Brad381()");}
}
class Brad382 extends Brad381{
    Brad382(){System.out.println("Brad382()");}
}
class Brad383 extends Brad382 implements Serializable{
    Brad384 obj;
    Brad383(){obj = new Brad384(); System.out.println("Brad383()");}
}
class Brad384{}