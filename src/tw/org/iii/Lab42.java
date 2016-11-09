package tw.org.iii;

import java.io.BufferedOutputStream;
import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import java.net.SocketException;

//Client - send file
public class Lab42 {
    public static void main(String[] args){
        try {
            Socket socket = new Socket(
                    InetAddress.getByName(""), 9999);
//cmd-ipconfig 查ip
//            socket.getOutputStream();
            BufferedOutputStream bout =
                    new BufferedOutputStream(
                            socket.getOutputStream());

            bout.write("Hello, Christ\nHello, World".getBytes());
            bout.flush();
            bout.close();

            socket.close();
            System.out.println("OK");
        } catch (Exception ee) {

        }
    }
}
