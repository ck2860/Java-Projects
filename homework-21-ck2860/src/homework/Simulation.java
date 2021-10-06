package homework;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;


public class Simulation {
    /**
     * The main method has three command lines, if not then a usage message would be printed and exit the program.
     * The first argument would be the log name, second argument would be the input file to create log messages, last argument would be the number of producers to create.
     * @param args args[0] should be an output file, args[1] should be an input file, and args[2] should be the amount of producers.
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {
        if(args.length == 3){
            Logger logger = new Logger(args[0]);
            int numOfProducers = Integer.parseInt(args[2]);
            ArrayList<Thread> producers = new ArrayList<>();

            File file = new File(args[1]);
            FileReader fileReader = new FileReader(file);
            BufferedReader br = new BufferedReader(fileReader);

            for (int i=0; i <= numOfProducers; i++) {
                //Producer producer = new Producer(logger, args[1], "Producer " + i);
                Producer producer = new Producer(logger, br, "Producer " + i);
                producers.add(producer);
            }
            for (int j = 0; j <producers.size(); j++) {
                producers.get(j).start();
            }
        } else {
            System.out.println("Usage: java homework21.Simulation <log filename><input filename><# of producers>");
            System.exit(1);
        }
    }
}