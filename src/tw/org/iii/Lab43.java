package tw.org.iii;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;


//Server
public class Lab43 {
    public static void main(String[] args){
        try {
            ServerSocket server =
                    new ServerSocket(9999);
            System.out.println("Listen...");
            Socket socket = server.accept();

            server.accept();
            BufferedReader br =
                    new BufferedReader(
                            new InputStreamReader(
                                    socket.getInputStream()));

            String line;
            while ((line = br.readLine()) != null){
                System.out.println(line);
            }
            br.close();


            server.close();
            System.out.println("Server OK");
        } catch (IOException e) {

        }
    }
}
