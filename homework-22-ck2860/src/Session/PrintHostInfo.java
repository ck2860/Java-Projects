package Session;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class PrintHostInfo {
    public static void main(String[] args) throws UnknownHostException {
        InetAddress local = InetAddress.getLocalHost();
        System.out.println(local.getHostAddress());
        System.out.println(local.getCanonicalHostName());
        System.out.println(local.getHostName());

        InetAddress google = InetAddress.getByName("www.google.com");
        System.out.println(google.getHostName());
        System.out.println(google.getHostAddress());
    }
}
