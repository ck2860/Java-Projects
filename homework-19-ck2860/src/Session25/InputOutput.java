package Session25;
import java.io.*;
import java.util.LinkedList;
import java.util.List;

public class InputOutput {
    public static void writeSquares(List<Square> sq, File filename) throws IOException {
        FileWriter fw = new FileWriter(filename);
//        fw.write(String.valueOf(sq.get(0)));
        for (int i = 0; i < sq.size(); i++) {
            fw.write(sq.get(i).toString());
        }
        fw.flush();
        fw.close();
    }

    public static void readSquares(List<Square> sq, File filename) throws IOException, FileNotFoundException, BadMoveException {
        FileReader fr = new FileReader(filename);
        int i = fr.read(); //character as an int.
        while(i!= -1) {
            System.out.println((char)i); // convert the int into char.
            Square square = new Square();
            if ((char) i == 'B') {
                square.occupy(Piece.BLACK);
            } else if ((char) i == 'W') {
                square.occupy(Piece.WHITE);
            }
            sq.add(square);
            i = fr.read();
        }
//        for (int a = 0; a < sq.size(); a++) {
//            System.out.println(sq.get(a));
//        }
            fr.close();
    }

    public static void main(String[] args) throws IOException, BadMoveException, FileNotFoundException {
        try {
            List<Square> sqTest = new LinkedList<>();
            Square sq1 = new Square();
            sq1.occupy(Piece.BLACK);
            Square sq2 = new Square();
            Square sq3 = new Square();
            sq3.occupy(Piece.WHITE);
            sqTest.add(sq1);
            sqTest.add(sq2);
            sqTest.add(sq3);
            File file = new File("hi");
            writeSquares(sqTest, file);
            readSquares(sqTest, file);
        }
        catch (Exception e){
            System.out.println(e);
            System.exit(1);
        }

       // sqTest.add(new Square());
    }
}
