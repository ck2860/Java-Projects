package Session;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class EchoServer {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(33075);
        System.out.println("Waiting for client to connect...");
        Socket client = serverSocket.accept();
        System.out.println("connected to " + client.getInetAddress());
        InputStream input = client.getInputStream();
        Scanner scanner = new Scanner(input);
        String line = scanner.nextLine();
        System.out.println(line);

        OutputStream output = client.getOutputStream();
        OutputStreamWriter opW = new OutputStreamWriter(output);
        PrintWriter bw = new PrintWriter(opW); //writer
        bw.write("HELLOOOO client");


        bw.flush();
        client.close();
    }
}
