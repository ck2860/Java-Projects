package Homework12;

import java.util.Arrays;

public class SpeedTest {
//    /**
//     * an int [] array will be passed in as a parameter
//     */
//    private int[] array;

//    /**
//     * The constructor that takes int [] array as a parameter.
//     *
//     * @param array an array
//     */
//    public SpeedTest(int[] array) {
//        this.array = array;
//    }

    /**
     * The function to time the performance of the insertion sort
     */
    public static void insertionSortTime(int [] array) {  // cannot use static if you create an object instead of.
        int[] copy = Arrays.copyOf(array, array.length);
        System.out.println("Performing Insertion Sort test on " + copy.length+ " elements");
        System.out.println("Pre-sorted: " + SortUtilities.sorted(copy));
        long start1 = System.currentTimeMillis();
        Sorts.insertionSort(copy);
        System.out.println("Completed in " + (System.currentTimeMillis()-start1) + " milliseconds");
        System.out.println("sorted: " + SortUtilities.sorted(copy));
    }

    /**
     * the function to time the performance of the quick sort.
     */

    public static void quickSortTime(int [] array) {
        int[] copy = Arrays.copyOf(array, array.length);
        System.out.println("Performing Quick Sort test on " + copy.length+ " elements");
        System.out.println("Pre-sorted: " + SortUtilities.sorted(copy));
        long start1 = System.currentTimeMillis();
        int [] array1 = Sorts.quickSort(copy);
        System.out.println("Completed in " + (System.currentTimeMillis()-start1) + " milliseconds");
        System.out.println("sorted: " + SortUtilities.sorted(array1));
    }

    /**
     * the function to time the performance of the bubble sort
     */
    public static void bubbleSortTime(int [] array){
        int[] copy = Arrays.copyOf(array, array.length);
        System.out.println("Performing Bubble Sort test on " + copy.length + " elements");
        System.out.println("Pre-sorted: " + SortUtilities.sorted(copy));
        long start1 = System.currentTimeMillis();
        int [] array1 = Sorts.bubbleSort(copy);
        System.out.println("Completed in " + (System.currentTimeMillis()-start1) + " milliseconds");
        System.out.println("sorted: " + SortUtilities.sorted(array1));
    }

    /**
     * the function to time the performance of the merge sort
     */
    public  static void mergeSortTime(int [] array){
        int[] copy = Arrays.copyOf(array, array.length);
        System.out.println("Performing Merge Sort test on " + copy.length + " elements");
        System.out.println("Pre-sorted: " + SortUtilities.sorted(copy));
        long start1 = System.currentTimeMillis();
        int [] array1 = Sorts.mergeSort(copy);
        System.out.println("Completed in " + (System.currentTimeMillis()-start1) + " milliseconds");
        System.out.println("sorted: " + SortUtilities.sorted(array1));
    }
    public  static void selectionSortTime(int [] array){
        int[] copy = Arrays.copyOf(array, array.length);
        System.out.println("Performing Selection Sort test on " + copy.length + " elements");
        System.out.println("Pre-sorted: " + SortUtilities.sorted(copy));
        long start1 = System.currentTimeMillis();
        int [] array1 = Sorts.selectionSort(copy);
        System.out.println("Completed in " + (System.currentTimeMillis()-start1) + " milliseconds");
        System.out.println("sorted: " + SortUtilities.sorted(array1));
    }
    public  static void heapSortTime(int [] array){
        int[] copy = Arrays.copyOf(array, array.length);
        System.out.println("Performing Heap Sort test on " + copy.length + " elements");
        System.out.println("Pre-sorted: " + SortUtilities.sorted(copy));
        long start1 = System.currentTimeMillis();
        Sorts.heapSort(copy);
        System.out.println("Completed in " + (System.currentTimeMillis()-start1) + " milliseconds");
        System.out.println("sorted: " + SortUtilities.sorted(copy));
    }

    /**
     * Use makeArray function to make an array of size 100.
     * Use insertionSort function timing with the array and call other sorts with the same
     * array to compare them against each other.
     *
     * @param args is a part of main method, for command arguments.
     */
    public static void main(String[] args) {
//        int[] array1 = SortUtilities.makeArray(5);
//        insertionSortTime(array1);
//        System.out.println("");
//        quickSortTime(array1);
//        System.out.println("");
//        bubbleSortTime(array1);
//        System.out.println("");
//        mergeSortTime(array1);
//        for (int i = 0; i < array1.length; i++){
//            System.out.println(array1[i]);
//        }
//        System.out.println("");
//
//        int [] array2 = SortUtilities.makeArray(5);
//        for (int i = 0; i < array2.length; i++){
//            System.out.println(array2[i]);
//        }
//        insertionSortTime(array2);
//        System.out.println("");
//        quickSortTime(array2);
//        System.out.println("");
//        bubbleSortTime(array2);
//        System.out.println("");
//        mergeSortTime(array2);
//        System.out.println("");
//        int [] array3 = SortUtilities.makeArray(2000);
//        insertionSortTime(array3);
//        System.out.println("");
//        quickSortTime(array3);
//        System.out.println("");
//        bubbleSortTime(array3);
//        System.out.println("");
//        mergeSortTime(array3);
//        System.out.println("");
//        int [] array4 = SortUtilities.makeArray(80000);
//        insertionSortTime(array4);
//        System.out.println("");
//        quickSortTime(array4);
//        System.out.println("");
//        bubbleSortTime(array4);
//        System.out.println("");
//        mergeSortTime(array4);
//        System.out.println("");
        int [] array5 = SortUtilities.makeArray(10000);
        insertionSortTime(array5);
        System.out.println("");
        quickSortTime(array5);
        System.out.println("");
        bubbleSortTime(array5);
        System.out.println("");
        mergeSortTime(array5);
        System.out.println("");
        selectionSortTime(array5);
        System.out.println("");
        heapSortTime(array5);
    }
}



