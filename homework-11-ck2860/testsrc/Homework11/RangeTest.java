package Homework11;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RangeTest {
    @Test
    public void oneStep() {
        Range range1 = new Range();

        int input1 = 0;
        int input2 = 5;
        int input3 = 1;

        int expected1 = 0;
        int expected2 = 1;
        int expected3 = 2;
        int expected4 = 3;
        int expected5 = 4;
        int expected6 = 5;

        int[] test1 = range1.makeRange(input1, input2, input3);

        assertEquals(expected1, test1[0]);
        assertEquals(expected2, test1[1]);
        assertEquals(expected3, test1[2]);
        assertEquals(expected4, test1[3]);
        assertEquals(expected5, test1[4]);
        assertEquals(expected6, test1[5]);
    }

    @Test
    public void threeSteps() {
        Range range1 = new Range();

        int input1 = 1;
        int input2 = 10;
        int input3 = 3;

        int expected1 = 1;
        int expected2 = 4;
        int expected3 = 7;
        int expected4 = 10;

        int[] test1 = range1.makeRange(input1, input2, input3);

        assertEquals(expected1, test1[0]);
        assertEquals(expected2, test1[1]);
        assertEquals(expected3, test1[2]);
        assertEquals(expected4, test1[3]);
    }

    @Test
    public void startWithTwo() {
        Range range1 = new Range();

        int input1 = 2;
        int input2 = 10;
        int input3 = 1;

        int expected1 = 2;
        int expected2 = 3;
        int expected3 = 4;
        int expected4 = 5;
        int expected5 = 6;


        int[] test1 = range1.makeRange(input1, input2, input3);

        assertEquals(expected1, test1[0]);
        assertEquals(expected2, test1[1]);
        assertEquals(expected3, test1[2]);
        assertEquals(expected4, test1[3]);
        assertEquals(expected5, test1[4]);
    }
    @Test
    public void endWithElevenAndTwoSteps() {
        Range range1 = new Range();

        int input1 = 2;
        int input2 = 11;
        int input3 = 2;

        int expected1 = 2;
        int expected2 = 4;
        int expected3 = 6;
        int expected4 = 8;
        int expected5 = 10;


        int[] test1 = range1.makeRange(input1, input2, input3);

        assertEquals(expected1, test1[0]);
        assertEquals(expected2, test1[1]);
        assertEquals(expected3, test1[2]);
        assertEquals(expected4, test1[3]);
        assertEquals(expected5, test1[4]);
    }
    @Test
    public void checkLength1() {
        Range range1 = new Range();

        int input1 = 1;
        int input2 = 10;
        int input3 = 1;

        int expected = 10;


        int[] test1 = range1.makeRange(input1, input2, input3);
        assertEquals(expected, test1.length);
    }
    @Test
    public void checkLength2() {
        Range range1 = new Range();

        int input1 = 1;
        int input2 = 10;
        int input3 = 3;

        int expected = 4;

        int[] test1 = range1.makeRange(input1, input2, input3);
        assertEquals(expected, test1.length);
    }
    @Test
    public void checkLength3() {
        Range range1 = new Range();

        int input1 = 2;
        int input2 = 11;
        int input3 = 2;

        int expected = 5;

        int[] test1 = range1.makeRange(input1, input2, input3);
        assertEquals(expected, test1.length);
    }
    @Test
    public void testSecondMethod() {
        Range range1 = new Range();

        int input1 = 0;
        int input2 = 5;

        int expected1 = 0;
        int expected2 = 1;
        int expected3 = 2;
        int expected4 = 3;
        int expected5 = 4;
        int expected6 = 5;

        int[] test1 = range1.makeRange(input1, input2);
        // step = 1

        assertEquals(expected1, test1[0]);
        assertEquals(expected2, test1[1]);
        assertEquals(expected3, test1[2]);
        assertEquals(expected4, test1[3]);
        assertEquals(expected5, test1[4]);
        assertEquals(expected6, test1[5]);
    }
    @Test
    public void testThirdMethod() {
        Range range1 = new Range();

        int input1 = 5;

        int expected1 = 0;
        int expected2 = 1;
        int expected3 = 2;
        int expected4 = 3;
        int expected5 = 4;
        int expected6 = 5;

        int[] test1 = range1.makeRange(input1);
        // start with 0, step = 1

        assertEquals(expected1, test1[0]);
        assertEquals(expected2, test1[1]);
        assertEquals(expected3, test1[2]);
        assertEquals(expected4, test1[3]);
        assertEquals(expected5, test1[4]);
        assertEquals(expected6, test1[5]);
    }

}
