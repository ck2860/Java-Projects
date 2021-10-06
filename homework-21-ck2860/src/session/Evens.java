package session;

public class Evens implements Runnable {
    private final Odds odds;

    public Evens(Odds odds) {
        this.odds = odds;
    }


    @Override
    public void run() {
        synchronized(odds) {
            // make sure that odds goes first
            if(!odds.isFirst()) {
                try {
                    odds.wait();
                } catch (InterruptedException e) {
                    // squash
                    e.printStackTrace();
                }
            }

            for(int i=2; i<=20; i=i+2) {
                // print the next number
                System.out.println(i);

                //notify odds that it is its turn to go
                odds.notify();

                // wait for next turn
                try {
                    odds.wait();
                } catch (InterruptedException e) {
                    // squash
                }
            }
        }
    }
}
