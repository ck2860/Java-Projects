package session26;

public class BlastOff implements Runnable {
    @Override
    public void run() {
        int time = -10;

        while (true) {
            if (time < 0) {
                System.out.println("T" + time);
            } else {
                System.out.println("T+ " + time);
            }
            time++;

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("Hey!");
                break;
            }

        }
    }

    public static void main(String[] args) throws InterruptedException {
        BlastOff blast = new BlastOff();
        Thread thread = new Thread(blast);
        thread.start();

        Thread.sleep(7000);
        thread.interrupt();
    }
}
