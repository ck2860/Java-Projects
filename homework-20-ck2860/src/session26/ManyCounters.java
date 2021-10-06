package session26;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ManyCounters {
    public static void main(String[] args) throws InterruptedException {
        List<Thread> threads = new ArrayList<>();
        for (int i = 1; i < 11; i++){
            RunnableCounter runner = new RunnableCounter(i);
            Thread thread = new Thread(runner);
            thread.start();
            thread.join();
            threads.add(thread);
        }
//        for(Thread thread : threads){
//            thread.join();
//        }
        System.out.println("Done!");
    }
}
