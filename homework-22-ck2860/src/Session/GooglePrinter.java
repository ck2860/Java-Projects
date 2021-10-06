package Session;
import java.io.*;
import java.net.InetAddress;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class GooglePrinter {

    public static void main(String[] args) throws IOException {
        URL google = new URL("http://www.google.com");

        URLConnection connection = google.openConnection();

        connection.connect();

        InputStream input = connection.getInputStream();
        InputStreamReader iReader = new InputStreamReader(input);
        BufferedReader reader = new BufferedReader(iReader);

        String line;
        while ((line = reader.readLine()) != null){
            System.out.println(line);
        }
    }
}
