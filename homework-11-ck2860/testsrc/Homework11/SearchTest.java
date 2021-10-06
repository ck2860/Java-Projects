package Homework11;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SearchTest {
    @Test
    public void linearSearchTest1() {
        Range range1 = new Range();
        Search search1 = new Search();

        int input1 = 1;
        int input2 = 10;
        int input3 = 1;
        int arrayRange[] = range1.makeRange(input1, input2, input3);

        int expected = 7;

        int test1 = search1.linearSearch(arrayRange, 8);

        assertEquals(expected, test1);
    }
    @Test
    public void linearSearchTest2() {
        Range range1 = new Range();
        Search search1 = new Search();

        int input1 = 1;
        int input2 = 10;
        int input3 = 2;
        int arrayRange[] = range1.makeRange(input1, input2, input3);

        int expected = 2;

        int test1 = search1.linearSearch(arrayRange, 5);
        assertEquals(expected, test1);
    }
    @Test
    public void linearSearchTest3() {
        Range range1 = new Range();
        Search search1 = new Search();

        int input1 = 1;
        int input2 = 10;
        int input3 = 2;
        int arrayRange[] = range1.makeRange(input1, input2, input3);

        int expected = -1;

        int test1 = search1.linearSearch(arrayRange, 4);

        assertEquals(expected, test1);
    }
    @Test
    public void linearSearchTest4() {
        Range range1 = new Range();
        Search search1 = new Search();

        int input1 = 1;
        int input2 = 10;
        int input3 = 3;
        int arrayRange[] = range1.makeRange(input1, input2, input3);

        int expected = 1;

        int test1 = search1.linearSearch(arrayRange, 4);
        assertEquals(expected, test1);
    }
    @Test
    public void linearSearchTest5() {
        Range range1 = new Range();
        Search search1 = new Search();

        int input1 = 2;
        int input2 = 11;
        int input3 = 2;
        range1.makeRange(input1, input2, input3);
        int arrayRange[] = range1.makeRange(input1, input2, input3);

        int expected = 3;

        int test1 = search1.linearSearch(arrayRange, 8);
        assertEquals(expected, test1);
    }
    @Test
    public void linearSearchTest6() {
        Range range1 = new Range();
        Search search1 = new Search();

        int input1 = 2;
        int input2 = 11;
        int input3 = 2;
        range1.makeRange(input1, input2, input3);
        int arrayRange[] = range1.makeRange(input1, input2, input3);

        int expected = -1;

        int test1 = search1.linearSearch(arrayRange, 0);
        assertEquals(expected, test1);
    }
    @Test
    public void linearSearchTest7() {
        Range range1 = new Range();
        Search search1 = new Search();

        int input1 = 0;
        int input2 = 10000000;
        int input3 = 1;
        range1.makeRange(input1, input2, input3);
        int arrayRange[] = range1.makeRange(input1, input2, input3);

        int expected = 5550;

        int test1 = search1.linearSearch(arrayRange, 5550);
        assertEquals(expected, test1);
    }
    @Test
    public void binarySearchTest1() {
        Range range1 = new Range();
        Search search1 = new Search();

        int input1 = 0;
        int input2 = 10;
        int input3 = 1;
        range1.makeRange(input1, input2, input3);

        int arrayRange[] = range1.makeRange(input1, input2, input3);

        int expected = 5;

        int test1 = search1.binarySearch(arrayRange, 5);
        assertEquals(expected, test1);
    }
    @Test
    public void binarySearchTest2() {
        Range range1 = new Range();
        Search search1 = new Search();

        int input1 = 0;
        int input2 = 10;
        int input3 = 1;
        range1.makeRange(input1, input2, input3);

        int arrayRange[] = range1.makeRange(input1, input2, input3);

        int expected = 8;

        int test1 = search1.binarySearch(arrayRange, 8);
        assertEquals(expected, test1);
    }
    @Test
    public void binarySearchTest3() {
        Range range1 = new Range();
        Search search1 = new Search();

        int input1 = 0;
        int input2 = 10;
        int input3 = 1;
        range1.makeRange(input1, input2, input3);

        int arrayRange[] = range1.makeRange(input1, input2, input3);

        int expected = 3;

        int test1 = search1.binarySearch(arrayRange, 3);
        assertEquals(expected, test1);
    }
    @Test
    public void binarySearchTest4() {
        Range range1 = new Range();
        Search search1 = new Search();

        int input1 = 1;
        int input2 = 10;
        int input3 = 2;
        range1.makeRange(input1, input2, input3);

        int arrayRange[] = range1.makeRange(input1, input2, input3);

        int expected = -1;

        int test1 = search1.binarySearch(arrayRange, 0);
        assertEquals(expected, test1);
    }
    @Test
    public void binarySearchTest5() {
        Range range1 = new Range();
        Search search1 = new Search();

        int input1 = 0;
        int input2 = 1000000;
        int input3 = 1;
        range1.makeRange(input1, input2, input3);

        int arrayRange[] = range1.makeRange(input1, input2, input3);

        int expected = 500;

        int test1 = search1.binarySearch(arrayRange, 500);
        assertEquals(expected, test1);
    }
    @Test
    public void binarySearchTest6() {
        Range range1 = new Range();
        Search search1 = new Search();

        int input1 = 0;
        int input2 = 10000000;
        int input3 = 2;
        range1.makeRange(input1, input2, input3);

        int arrayRange[] = range1.makeRange(input1, input2, input3);

        int expected = 3;

        int test1 = search1.binarySearch(arrayRange, 6);
        assertEquals(expected, test1);
    }
    @Test
    public void binarySearchTest7() {
        Range range1 = new Range();
        Search search1 = new Search();

        int input1 = 0;
        int input2 = 10;
        int input3 = 2;
        range1.makeRange(input1, input2, input3);

        int arrayRange[] = range1.makeRange(input1, input2, input3);

        int expected = -1;

        int test1 = search1.binarySearch(arrayRange, 21);
        assertEquals(expected, test1);
    }
}