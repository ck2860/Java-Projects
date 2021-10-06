package Session25;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BadMoveExceptionTest {
    @Test
    public void TestZero(){
        try {
            Square sq1 = new Square();
            sq1.occupy(Piece.BLACK);
            sq1.flip();
            assertEquals("W", sq1.toString());
        }catch (BadMoveException e){
            e.getMessage();
        }
    }
    @Test
    public void TestOne(){
        try {
            Square sq1 = new Square();
            sq1.flip();
            fail();
        }catch (BadMoveException e){
            e.getMessage();
            assertEquals("square is empty", e.getMessage());
        }
    }
    @Test
    public void TestTwo(){
        try {
            Square sq1 = new Square();
            sq1.occupy(Piece.BLACK);
            sq1.occupy(Piece.WHITE);
        }catch (BadMoveException e){
            e.getMessage();
            assertEquals("square is occupied", e.getMessage());
        }
    }
    @Test
    public void TestThree(){
        try {
            Square sq1 = new Square();
//            sq1.occupy(Piece.BLACK);
//            sq1.occupy(Piece.WHITE);
            sq1.flip();
            fail();
        }catch (BadMoveException e){
            e.getMessage();
            assertEquals("square is empty", e.getMessage());
        }
    }


}