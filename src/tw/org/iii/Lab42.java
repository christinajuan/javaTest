package tw.org.iii;

import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.SocketException;

//Client - send file
public class Lab42 {
    public static void main(String[] args){
        long start = System.currentTimeMillis();
        try {
            Socket socket = new Socket(
                    InetAddress.getByName("10.2.24.102"), 9999);

            OutputStream out = socket.getOutputStream();
            FileInputStream fin = new FileInputStream(
                    "dir1/bubble.jpg");
            int b;
            while ((b = fin.read())!=-1){
                out.write(b);
            }
            fin.close();
            out.flush();
            out.close();

            socket.close();
            System.out.println("OK");
            System.out.println(System.currentTimeMillis()-start);
        } catch (Exception ee) {
            System.out.println("Client Except: " + ee.toString());
        }
    }
}
