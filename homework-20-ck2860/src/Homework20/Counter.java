package Homework20;

import java.util.ArrayList;
import java.util.Scanner;

public class Counter extends Thread{
    /**
     * a private field for int number
     */
    private int number;
    private Counter previous;

    /**
     * the constructor for counter that takes a number
     * @param number
     */
    public Counter(int number, Counter previous){
        this.number = number;
        this.previous = previous;
    }

    /**
     * the run method would print the thread #.
     */

    @Override
    public void run() {
        if(previous != null){
            try {
                previous.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Thread # " + number);
    }

    /**
     * The method would create and start the counter threads for each number
     * then the numbers would print in order so each thread would have to wait until the previous thread
     * would be done then prints its own thread and number.
     * @param args specifies the number to count up to
     * @throws InterruptedException
     */

    public static void main(String[] args) throws InterruptedException {
        if(args.length == 1){
            String number = args[0]; //accepts a single command line argument that specifies the number to count up to.
            Counter previous = new Counter(1, null);
            previous.start();
            for (int i=2; i <= Integer.valueOf(number) + 1; i++) {
                Counter counter = new Counter(i, previous );
                counter.start();
                previous = counter;
            }
//            threads.get(0).start();
//            for (int j = 1; j <threads.size(); j++) {
//                threads.get(j-1).join();
//                threads.get(j).start();
//            }

//            for (int j = 1; j <threads.size(); j++) {
//                threads.get(j-1).join();
//            }
        }else{
            System.out.println("Usage: java homework20.Counter<number>");
//            System.out.println("buttercup");
//            System.out.print("123");
//            System.out.print("456");
//            System.out.println("789");
//            System.out.print("abc");
//            Scanner scanner = new Scanner(System.in);
//            for(boolean go=true; go;) {
//                System.out.print("Keep going?");
//                go = scanner.nextBoolean();
//            }
//            for (int i = 2; i < 5;){
//                System.out.println();
//            }

            System.exit(1);
        }

    }

}
