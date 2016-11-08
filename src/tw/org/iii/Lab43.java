package tw.org.iii;

import java.io.IOException;
import java.net.ServerSocket;

public class Lab43 {
    public static void main(String[] args){
        try {
            ServerSocket server =
                    new ServerSocket(9999);
            server.accept();
            server.close();
            System.out.println("Server ok");
        } catch (IOException e) {
        }
    }
}
