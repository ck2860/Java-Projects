package Homework17;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ChessboardTest {
    /**
     * testing the board without plotting.
     */
    @Test
    public void TestZero(){
        String[][] board = new String[4][4];
        Chessboard game1 = new Chessboard(board);
        String[][] input = game1.board(board);
        assertEquals(" ", input[0][1]);
    }

    /**
     * testing location method making sure it is in the right place.
     */
    @Test
    public void TestOne(){
        String[][] board = new String[4][4];
        Chessboard game1 = new Chessboard(board);
        game1.location("HI", 3,3);
        assertEquals("HI", board[3][3]);
    }
    /**
     * testing the plot method..
     */
    @Test
    public void TestTwo(){
        String[][] board = new String[4][4];
        Chessboard game1 = new Chessboard(board);
        game1.location("S", 0, 0);
        game1.location("E", 3, 3);
        game1.plot();
        assertEquals("1", board[2][1]);
    }
    /**
     * testing the plot method with more steps
     */
    @Test
    public void TestThree(){
        String[][] board = new String[4][4];
        Chessboard game1 = new Chessboard(board);
        game1.location("S", 0, 0);
        game1.location("E", 1, 1);
        game1.plot();
        assertEquals("1", board[2][1]);
        assertEquals("2", board[0][2]);
        assertEquals("3", board[2][3]);
    }
}
