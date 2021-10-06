package session;

import util.*;


public class ListAdder implements Runnable {
    private final MyList<Integer> list;
    private int start;
    private int stop;

    public ListAdder(MyList<Integer> list, int start, int stop){
        this.list = list;
        this.start = start;
        this.stop = stop;
    }


    @Override
    public void run() {
        for(int i =start; i <=stop; i++){
//            synchronized (list){
                list.add(i);
//            }
        }
    }

    public static void main(String[] args) throws InterruptedException {
//        MyList<Integer> list = new MyArrayList<>();
//        MyList<Integer> list = new MyNodeList<>();
        MyList<Integer> list = new SafeArrayList<>();


        Thread[] threads = new Thread[10];
        for(int i =0; i < threads.length; i++){
            int start = (1000 * i) + 1;
            int stop = start + 999;

            ListAdder adder = new ListAdder(list, start, stop);
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
