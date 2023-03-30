package org.example.udp;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class UDP_Example {
    public static void main(String[] args) throws IOException {
        DatagramSocket socket = new DatagramSocket(12345);
        byte[] receivedData = new byte[1024];

        DatagramPacket receivedPacket = new DatagramPacket(receivedData, receivedData.length);
        socket.receive(receivedPacket);

        String message = new String(receivedPacket.getData(), 0, receivedPacket.getLength());
        System.out.println("Message received: " + message);

        socket.close();
    }
}
