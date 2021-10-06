package Homework;

import java.io.*;
import java.net.InetAddress;
import java.net.Socket;
import java.util.Scanner;


public class GuessingGameClient {
    /**
     * The socket (client) will connect to port 6355 and connect the server.
     * Once it reads the server's first message then it would print "guess a number" first so the user can enter his/her first guess
     * if the user does not guess the first time then it would ask the user to guess again, etc.
     * but the user would only have 6 guesses, after that the user would either quit or restart the game
     * If the user restarts the game, then the user would play again.
     * If the user correctly guesses the game then the user either can restart or quit the game.
     * If the user enters quit then it would end the program.
     * @param args hostname of the server (localhost)
     * @throws IOException
     */
    public static void main(String[] args) throws IOException {
        if(args.length == 1){
            Scanner userInput = new Scanner(System.in);
//            InetAddress local = InetAddress.getLocalHost();
//            Socket client = new Socket (local.getHostAddress(), 6355);
//            System.out.println(args[0]);
            Socket client = new Socket (args[0], 6355);
//            System.out.println(local.getHostName());
            InputStream ir = client.getInputStream();
            InputStreamReader isr = new InputStreamReader(ir);
            BufferedReader br = new BufferedReader(isr); // reader

            OutputStream oS = client.getOutputStream();
            OutputStreamWriter opW = new OutputStreamWriter(oS);
            PrintWriter bw = new PrintWriter(opW); // writer
            String message = "";

            int counter = 0;
            // add loop here to write to server
            while(!message.equals(null)) {
    //            System.out.println("RECENT MESSAGE: " + message);
                // read all lines from server
                message = br.readLine();
    //            System.out.println(message);
                if (message.equals("Guess a number")){
                    System.out.println("Guess a number: ");
                    counter ++;
                }else if(message.equals("toolow")){
                    System.out.println("Too Low!");
                    if(counter < 6){
                        System.out.println("Guess again");
                    }
                    counter ++;
                }else if(message.equals("toohigh")){
                    System.out.println("Too High!");
                    if(counter < 6){
                        System.out.println("Guess again");
                    }
                    counter++;
                }else if (message.equals("correct")){
                    System.out.println("Correct!");
                }else if (message.equals("game_over")){
                    System.out.println("Game Over");
                    break;
                }else if(message.equals("error")) {
                    System.out.println("error");
                }else if(message.equals("restarted")){
                    System.out.println("restarted");
                    System.out.println("Guess a number");
                    counter = 1;
                }else if(message.equals("out_of_guesses")){
                    System.out.println("out of guesses");
                }
                String guess = userInput.nextLine();
                bw.println(guess);
                bw.flush();
            }
            client.close();
        }else{
            System.out.println("Usage: java homework22.GuessingGameClient<localhost>");
            System.exit(1);
        }
    }
}
