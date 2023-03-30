package org.example.tcp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class TCP_Example {
    public static void main(String[] args) throws IOException {
        ServerSocket server = new ServerSocket(12345);
        System.out.println("Server initializing in port " + server.getLocalPort());

        Socket client = server.accept();
        System.out.println("Client " + client.getInetAddress().getHostName() + " connected.");

        BufferedReader entry = new BufferedReader(new InputStreamReader(client.getInputStream()));
        String message = entry.readLine();
        System.out.println("Message received: " + message);

        client.close();
        server.close();
    }
}