package org.example.tcp;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;

public class Client_TCP {
    public static void main(String[] args) throws IOException {
        Socket client = new Socket("localhost", 12345);
        System.out.println("Connection established with server");

        PrintWriter output = new PrintWriter(client.getOutputStream(), true);
        output.println("Howdy, server!");

        client.close();
    }
}
