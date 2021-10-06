package session;

public class Deadlock extends Thread {

    private String name;
    private String lock1;
    private String lock2;

    public Deadlock(String name, String lock1, String lock2) {
        this.name = name;
        this.lock1 = lock1;
        this.lock2 = lock2;
    }

    public String getName1() {
        return name;
    }

    public String getLock1() {
        return lock1;
    }

    public String getLock2() {
        return lock2;
    }

    @Override
    public void run() {
        while(true) {
            System.out.println(getName1() + " is getting " + getLock1());
            synchronized(lock1) {
                System.out.println(getName1() + " is getting " + getLock2());
                synchronized(lock2) {
                    System.out.println(getName1() + "got it");
                }
            }
        }
    }

    public static void main(String[] args) {
        String lock1 = "lock1";
        String lock2 = "lock2";

        new Thread(new Deadlock("deadlock1", lock1, lock2)).start();
        new Thread(new Deadlock("deadlock2", lock2, lock1)).start();
    }
}