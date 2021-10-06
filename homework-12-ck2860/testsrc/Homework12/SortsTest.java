package Homework12;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SortsTest {
    /**
     * Test insertionSort method
     */
    @Test
    public void insertionSort() {
        int [] input1 = {1,3,4,5,6,3,5};
        int [] expected = {1,3,3,4,5,5,6};
        Sorts.insertionSort(input1);
        assertArrayEquals(expected, input1);
    }
    /**
     * Test mergeSort method
     */
    @Test
    public void mergeSort() {
        int [] input = {1,3,4,5,6,3,5};
        int [] expected = {1,3,3,4,5,5,6};
        int [] input1 = Sorts.mergeSort(input);
        assertArrayEquals(expected, input1);
    }
    /**
     * Test bubbleSort method
     */
    @Test
    public void bubbleSort() {
        int [] input1 = {1,3,4,5,6,3,5};
        int [] expected = {1,3,3,4,5,5,6};
        Sorts.bubbleSort(input1);
        assertArrayEquals(expected, input1);
    }
    /**
     * Test quickSort method
     */
    @Test
    public void quickSort1() {
        int [] input = {1,3,4,5,6,3,5};
        int [] expected = {1,3,3,4,5,5,6};
        int [] input1 = Sorts.quickSort(input);
        assertArrayEquals(expected, input1);
    }

    /**
     * Testing that quickSort method doesn't modify the original array.
     */
    @Test
    public void quickSort2() {
        int [] input = {1,3,4,5,6,3,5};
        int [] expected = {1,3,4,5,6,3,5};
        int [] input1 = Sorts.quickSort(input);
        assertArrayEquals(expected, input);
    }
}