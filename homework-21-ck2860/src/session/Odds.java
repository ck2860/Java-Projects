package session;

public class Odds implements Runnable {
    private boolean first;

    public Odds() {
        first = false;
    }

    public boolean isFirst() {
        return first;
    }

    @Override
    public synchronized void run() {
        for(int i=1; i<=20; i=i+2) {
            // print the next number
            System.out.println(i);
            // toggle the first flag
            first = true;
            // notify evens that it is its turn to go
            notify();

            // wait for next turn turn
            try {
                wait();
            } catch (InterruptedException e) {
                // squash
            }
        }
    }
}
