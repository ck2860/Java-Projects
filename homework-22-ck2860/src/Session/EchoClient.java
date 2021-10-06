package Session;

import java.io.*;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

public class EchoClient {
    public static void main(String[] args) throws IOException {
//        InetAddress local = InetAddress.getLocalHost();
////        System.out.println(local.getHostAddress());
////        System.out.println(local.getHostName());
//
//        Socket socket = new Socket (local.getHostAddress(), 33075);

        InetAddress local = InetAddress.getLocalHost();
        Socket socket = new Socket (local.getHostAddress(), 33075);
        PrintWriter pw = new PrintWriter(socket.getOutputStream());
        pw.println("Hello, Server!");

        pw.flush(); // need this to send the data

        InputStream ir = socket.getInputStream();
        InputStreamReader isr = new InputStreamReader(ir);
        BufferedReader br = new BufferedReader(isr);
        String message = br.readLine();
        System.out.println(message);

        socket.close();
    }
}
