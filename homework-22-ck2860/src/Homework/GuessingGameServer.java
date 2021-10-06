package Homework;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Random;

public class GuessingGameServer  {
    /**
     * The main method runs when the client and serverSocket connect and the connection is established as socket.
     * The server port would be 6355.
     * So the server socket listen then accept the connection with client.
     * The random function is used for guessing number that the client has to guess.
     * So the outputstream\printerwriter is used to write something and the inputsteam\bufferedreader is used to reaad something from the client.
     * The client will have 6 guesses but after that and if this client runs out of the guesses
     * but if the client keeps guessing then it would send "error" to client/
     * The client can restart any time, before or after running out of guesses, or get it correctly, etc..
     * If the client enters "quit" then the program ends.
     * If the client enters "restarted" then the new number would be randomized again
     * @param args n/a
     * @throws IOException
     */
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(6355);
        Random random = new Random();
        int ran = random.nextInt(100)+1;  // between 1 and 100
        while (true){
            Socket client = serverSocket.accept();
            OutputStream oS = client.getOutputStream();
            OutputStreamWriter opW = new OutputStreamWriter(oS);
            PrintWriter bw = new PrintWriter(opW); //writer

            InputStream ir = client.getInputStream();
            InputStreamReader isr = new InputStreamReader(ir);
            BufferedReader br = new BufferedReader(isr); // reader

            bw.println("Guess a number");
            bw.flush();
//            System.out.println("sent message");
            String line = "";
            boolean correct = false;
//            line = br.readLine();
//            System.out.println(line);
//            System.out.println(line.getClass().getSimpleName());
            int counter = 1;
            while((line = br.readLine()) != null){
                if(counter < 7 ) {
                    int guess = 0;
                    boolean isInteger = true;
                    try {
                        guess = Integer.parseInt(line);
                    }
                    catch(NumberFormatException e){
                        isInteger = false;
                    }
                    System.out.println("guess #" + counter + ": " + guess);
                    System.out.println(ran);
                    if (isInteger && guess == ran) {
                        bw.println("correct");
                        bw.flush();
                        counter = 7;
                        correct = true;
                    } else if (isInteger && guess > ran) {
                        bw.println("toohigh");
                        bw.flush();
                        counter++;
                    } else if (isInteger && guess < ran) {
                        bw.println("toolow");
                        bw.flush();
                        counter++;
                    }else if (line.equals("restart")){
                        counter = 1;
                        bw.println("restarted");
                        ran = random.nextInt(100)+1; // get a new randomized number.
                        bw.flush();
                    }else if(line.equals("quit")) {
                        bw.println("game_over");
                        bw.flush();
                        System.exit(1);
                    }else{
                        bw.println("error");
                        bw.flush();
                    }
                }
                else {
                    if(counter >= 7 && !correct){
                        bw.println("out_of_guesses");
                        bw.flush();
                        correct = true;
                    }else if (line.equals("restart") && correct){
                        counter = 1;
                        bw.println("restarted");
                        ran = random.nextInt(100)+1; // get a new randomized number.
                        bw.flush();
                        correct = false;
                    }else if(line.equals("quit") && correct) {
                        bw.println("game_over");
                        correct = false;
                        bw.flush();
                        break;
                    }else{
                        bw.println("error");
                        bw.flush();
                    }
                }
            }
            client.close();
        }
    }
}