package homework;

import java.io.*;
import java.util.LinkedList;
import java.util.Queue;

public class Logger extends Thread {
    /**
     * fields for filename, logQueue, and BufferedWriter
     */
    private final String filename;
    private final Queue<Log> logQueue;
    private BufferedWriter bw;

    /**
     * the constructor that takes the filename as a parameter.
     * File would be created and FileWriter method would be used as well.
     * BufferedWriter is used to buffer the fileWriter.
     * logQueue is implemented by a linked list, that would be a queue of log messages.
     * @param filename file name
     * @throws Exception throws an exception if there are errors.
     */

    public Logger(String filename) throws Exception {
        this.filename = filename;
        File f = new File(filename);
        FileWriter fw = new FileWriter(f);
        bw = new BufferedWriter(fw);
        this.logQueue = new LinkedList<>();
    }

    /**
     * The method would add the message to the queue
     * The messages would be printed out into the output.
     * The message would be also written into the file.
     * @param message the message that the logger would write.
     * @throws Exception
     */

    public boolean logAdd(Log message){
        System.out.println(message);
        try {
            bw.write(message + "\n");
            logQueue.add(message);
            bw.flush();
            return true;
        }
        catch(IOException e) {
//            bw.close();
            e.printStackTrace();
            System.exit(1);
            return false;
        }
    }

    @Override
    public void run() {
        boolean tf = true;
        while(tf){
            Log message;
            synchronized (logQueue){
                if(logQueue.size() == 0){
                    try{
                        logQueue.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                message = logQueue.poll();
            }
            tf = logAdd(message);
        }
    }
}