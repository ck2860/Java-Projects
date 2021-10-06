package homework;

import java.io.FileReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;
import java.io.*;

public class Producer extends Thread {
    /**
     * Producer is a thread so it extends thread class.
     * the private fields are logger, bufferreader, number and name
     */
    private Logger logger;
    private BufferedReader br;
    private String name;
    private static final Queue<String> logQueue = new LinkedList<>();


    /**
     * The constructor takes logger, filename and string name.
     * @param logger
     * @param name
     * @throws FileNotFoundException
     */
    //public Producer(Logger logger, String filename, String name) throws FileNotFoundException {
    public Producer(Logger logger, BufferedReader br, String name) throws FileNotFoundException {
        this.logger = logger;
        /*File file = new File(filename);
        FileReader fileReader = new FileReader(file);
        br = new BufferedReader(fileReader);*/
        this.br = br;
        this.name = name;
    }

    /**
     * This method would randomize the severity type for the producer.
     * @return the type of severity
     */

    public Severity getSeverity() {
        Random random = new Random();
        int ranSeverity = random.nextInt(4);
        Severity severity;
        if (ranSeverity == 0) {
            severity = Severity.DEBUG;
        } else if (ranSeverity == 1) {
            severity = Severity.INFO;
        } else if (ranSeverity == 2) {
            severity = Severity.WARNING;
        } else {
            severity = Severity.CRITICAL;
        }
        return severity;
    }

    /**
     * the getter for name
     * @return name
     */

    public String getName1(){
        return this.name;
    }

    public static synchronized void readLine(Producer producer, BufferedReader br, Logger logger){
        try {
            String text = br.readLine();
            Log log = new Log(producer.getSeverity(), producer.getName1(), text);
            logger.logAdd(log);
        } catch (Exception e) {
            e.printStackTrace();
            System.exit(1);
        }
    }

    /**
     * The run method would be synchronized so one thread would be running at a time.
     * The producer would be asleep for a random number of milliseconds between 0 and 5000.
     * When the producer wakes up, it should generate a log message and use the logger to log it.
     * The message should be the next line from the provided file.
     * As we use queue, the lines would be logged in order.
     * then we would notify the logger to write the lines into the files.
     * When the producers are done with reading the file then it should stop.
     */

    @Override
    public synchronized void run() {
        int counter = 0;
        try {
            //String text = br.readLine();
            while (true) {
                readLine(this, br, logger);
                Random random = new Random();
                int x = random.nextInt(5001);
                Thread.sleep(x);
                /*Log log = new Log(getSeverity(), getName1(), text);
                if (!logQueue.contains(log.getMessage())) {
                    logger.logAdd(log);
                    logQueue.add(text);
                }
                text = br.readLine();*/
            }
        } catch (Exception e) {
            e.printStackTrace();
            System.exit(1);
        }
    }

//    public static void main(String[] args) throws Exception {
//        Logger log = new Logger("data\\test.txt");
//        Producer producer = new Producer(log, "data\\alice_in_wonderland.txt", "Producer 1");
//        Producer producer1 = new Producer(log, "data\\alice_in_wonderland.txt", "Producer 2");
//        producer.start();
//        producer1.start();
//    }
}
