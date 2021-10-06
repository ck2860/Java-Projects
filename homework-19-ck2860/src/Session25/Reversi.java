package Session25;

import java.io.IOException;

public class Reversi {
    public static void main(String[] args) { // or throws  BadMoveException
        Square square = new Square();
        try {
            square.flip();
        } catch (BadMoveException e) {
            e.printStackTrace();
        }
    }
}
