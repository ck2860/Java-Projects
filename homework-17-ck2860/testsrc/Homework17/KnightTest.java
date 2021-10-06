package Homework17;

import org.junit.jupiter.api.Test;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Queue;

import static org.junit.jupiter.api.Assertions.*;

class KnightTest {
    /**
     * testing if the knights'x and y.
     */
    @Test
    public void TestZero(){
        Knight test = new Knight(0, 0);
        Knight test2 = new Knight(3,3);

        assertEquals(0, test.getX());
        assertEquals(0, test.getY());
        assertEquals(3, test2.getX());
        assertEquals(3, test2.getY());
    }

    /**
     * testing the inBounds method
     */
    @Test
    public void TestOne(){
        String [][] board = new String [4][4];
        Knight test = new Knight(0, 0);
        Boolean input = test.inBounds(3,2,board.length);
        assertEquals(true, input);
    }

    /**
     * testing the inBounds method
     */
    @Test
    public void TestTwo(){
        String [][] board = new String [4][4];
        Knight test = new Knight(0, 0);
        Boolean input = test.inBounds(4,4,board.length);
        assertEquals(false, input);
    }
}

