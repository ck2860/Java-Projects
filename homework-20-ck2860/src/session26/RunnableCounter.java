package session26;

public class RunnableCounter implements  Runnable {
    private int number;

    public RunnableCounter(int number){
        this.number = number;
    }

    @Override
    public void run() {
        for (int i=1; i < 101; i++) {
            System.out.println("Runnable " + number + " : " + i);
        }
    }

    public static void main(String[] args) {
        RunnableCounter runner1 = new RunnableCounter(1);
        Thread thread1 = new Thread(runner1);
        thread1.start();

//        RunnableCounter runner2 = new RunnableCounter(2);
//        Thread thread2 = new Thread(runner2);
//        thread2.start();
        System.out.println("Done!");
    }
}
