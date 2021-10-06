package session;

public class EvensAndOdds {
    public static void main(String[] args) {
        Odds odds = new Odds();
        new Thread(odds).start();

        Evens evens = new Evens(odds);
        new Thread(evens).start();
    }
}
