package org.example.udp;

import java.io.IOException;
import java.net.*;

public class Client_UDP {
    public static void main(String[] args) throws IOException {
        DatagramSocket socket = new DatagramSocket();

        InetAddress ip = InetAddress.getByName("localhost");
        int port = 12345;

        String message = "Hello server!";
        byte[] sentData = message.getBytes();

        DatagramPacket sentPacket = new DatagramPacket(sentData, sentData.length, ip, port);
        socket.send(sentPacket);

        System.out.println("Message sent to server");

        socket.close();




    }
}
