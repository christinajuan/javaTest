package tw.org.iii;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

public class Lab40 {
    //UDP - 張君雅小妹妹 Receiver
    public static void main(String[] args){
        byte[] buf = new byte[1024];
        try {
            DatagramSocket socket = new DatagramSocket(888);
            DatagramPacket packet = new DatagramPacket(buf,buf.length);
            System.out.println("before");
            socket.receive(packet);
            System.out.println("after");
            socket.close();
            System.out.println("ok");
        }catch (Exception e){
            e.printStackTrace();
        }

    }
}
