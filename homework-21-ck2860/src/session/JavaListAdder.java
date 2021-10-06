package session;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import util.MyNodeList;

public class JavaListAdder implements  Runnable {
    private List<Integer> list;
    private int start;
    private int stop;

    public JavaListAdder(List<Integer> list, int start, int stop){
        this.list = list;
        this.start = start;
        this.stop = stop;
    }


    @Override
    public void run() {
        for(int i =start; i <=stop; i++){
            list.add(i);
        }
    }

    public static void main(String[] args) throws InterruptedException {
//        MyList<Integer> list = new MyArrayList<>();
        List<Integer> list = new ArrayList<>();


        Thread[] threads = new Thread[10];
        for(int i =0; i < threads.length; i++){
            int start = (1000 * i) + 1;
            int stop = start + 999;

            JavaListAdder adder = new JavaListAdder(list, start, stop);
            Thread thread = new Thread(adder);
            thread.start();
//            thread.join();
            threads[i] = thread;
        }

        for (Thread thread : threads){
            thread.join();
        }
        System.out.println("size of the list: "+ list.size());
    }
}

