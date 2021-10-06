package session26;

public class CounterThread extends Thread {
    private int number;
    public CounterThread(int number){
        this.number = number;
    }

    @Override
    public void run() {
        for (int i=1; i < 5; i++) {
            System.out.println("Thread " + number + " : " + i);
        }
    }

    public static void main(String[] args) throws InterruptedException {
//        CounterThread thread1 = new CounterThread(1);
//        thread1.start();
//
//        CounterThread thread2 = new CounterThread(2);
//        thread2.start();
//        System.out.println("Done!");

        CounterThread thread1 = new CounterThread(1);
        System.out.println("is alive: " + thread1.isAlive());
        thread1.start();
        System.out.println("is alive: " + thread1.isAlive());
        Thread.sleep(1000);
        System.out.println("is alive: " + thread1.isAlive());
//        thread1.start(); // you cannot odo that because it sleeps.
        System.out.println("Done!");
    }
}
