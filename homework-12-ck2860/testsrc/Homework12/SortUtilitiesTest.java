package Homework12;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SortUtilitiesTest {
    /**
     * Test sorted method
     */
    @Test
    public void sortedTest1(){
        int [] input = {1,2,3,4,5,6};
        boolean test1 = SortUtilities.sorted(input);
        assertEquals(true, test1);
    }
    /**
     * Test sorted method
     */
    @Test
    public void sortedTest2(){
        int [] input = {1,2,3,5,5,6};
        boolean test1 = SortUtilities.sorted(input);
        assertEquals(true, test1);
    }
    /**
     * Test sorted method
     */
    @Test
    public void sortedTest3(){
        int [] input = {1,2,3,5,4,6};
        boolean test1 = SortUtilities.sorted(input);
        assertEquals(false, test1);
    }
    /**
     * Test swap method
     */
    @Test
    public void swapTest1(){
        int [] input = {1,2,3,6,5,4};
        int [] expected = {1,2,3,4,5,6};
        SortUtilities.swap(input, 3, 5);
        assertArrayEquals(expected, input);
    }
    /**
     * Test divide method
     */
    @Test
    public void divideTest(){
        int [] input = {1,2,3,6,5,4};
        int []expected1= {1,3,5};
        int []expected2 = {2,6,4};
        int [][] dividedInput = SortUtilities.divide(input);
        assertArrayEquals(expected1, dividedInput[0]);
        assertArrayEquals(expected2, dividedInput[1]);
    }

    /**
     * Test merge method
     */
    @Test
    public void mergeTest(){
        int [] input1 = {1,3,5};
        int [] input2= {2,6,4};
        int []expected = {1,2,3,4,5,6};
        int [] mergeInput = SortUtilities.merge(input1, input2);
        int [] mergeSortedInput = Sorts.mergeSort(mergeInput);
        assertArrayEquals(expected, mergeSortedInput);
    }

    /**
     * test concatenated method
     */
    @Test
    public void concatenatedTest(){
        int [] input1 = {1,3,5};
        int [] input2= {2,4,4};
        int []expected = {1,3,5,2,4,4};
        int [] mergeInput = SortUtilities.cat(input1, input2);
        assertArrayEquals(expected, mergeInput);
    }

}