/* SWEN-601
 * Condy Kan
 * ck2860@rit.edu
 */
package Homework12;
/**
 * Answering #1 of homework12
 */
import static Homework12.SortUtilities.*; // imports entire method/class from SortUtilities to here

public class Sorts {
    /**
     * The insertionSort method is to perform an in place sort on an array passed in as a parameter.
     *
     * @param array an array
     */
    public static void insertionSort(int[] array) {
        for (int i = 1; i < array.length; i++) { //loops through each value in the array
            int index = i; // assigns index to i. So every time it exits out, index would be 1 again.
            while (index > 0 && array[index] < array[index - 1]) { // tests if the value at the index is smaller than the value before at the index then we swap them.
                swap(array, index, index - 1); //calling the swap method to swap two values in the array
                index--; // decrement so it goes backward to check the value before it exits out and moves on to the next index.
            }
        }
    }

    /**
     * This function would call divide method to divide unsorted array
     * then call mergeSort recursively for both sub-arrays
     *
     * @param array an unsorted array
     * @return merged array.
     */
    public static int[] mergeSort(int[] array) {
        if (array.length < 2) {
            return array;
        } else {
            int[][] arrays = divide(array); // divide into two arrays first //arrays[0] = first array, arrays[1] = second array
            int[] sortedArrayOne = mergeSort(arrays[0]); // then call the mergeSort function secondly then divide into two arrays then base call-- keeps two arrays (if the length is 1).
            int[] sortedArrayTwo = mergeSort(arrays[1]); // then call this mergeSort function then divide into two arrays etc.. then base call -- keep two arrays.
            return merge(sortedArrayOne, sortedArrayTwo);
        }
    }
    /**
     * bubbleSort is one of sorting algorithm that loops from index 0 to length-2 and
     * compares each value at index i to the value at index i +1;
     * If the values are out of orders, we would use swap function to swap them then
     * recursively call bubbleSort until it reaches array.length-2.
     *
     * @param array an array
     * @return an sorted array
     */
    public static int[] bubbleSort(int[] array) {
        boolean swapFlag = true;
        while (swapFlag) {
            swapFlag = false;
            for (int i = 0; i <= array.length - 2; i++) {
                if (array[i] > array[i + 1]) {
                    swap(array, i, (i + 1));
                    swapFlag = true;
                }
            }
        }
        return array;
    }

    /**
     * The recursive quickSort algorithm, would return the array if the array is less than 0.
     * The pivot is always at the index 9.
     * It loops once over the array and count the values that are less than, equal to, and greater than the pivot.
     * Uses the counts from the previous step to create the arrays o hold all of the values
     * then loop over again and copy into the the array.
     * After copying the values into the correct arrays and call recursively.
     *
     * @param array
     * @returna array
     */
    public static int[] quickSort(int[] array) {
        int[] leftArray;
        int[] rightArray;
        int[] middleArray;
        if (array.length < 2) { //base case
            return array;
        } else {
            int lessArrayCounter = 0;
            int greatArrayCounter = 0;
            int equalArrayCounter = 0;
            for (int i = 0; i < array.length; i++) {
                if (array[i] == array[0]) {
                    equalArrayCounter++;
                } else if (array[i] < array[0]) {
                    lessArrayCounter++;
                } else {
                    greatArrayCounter++;
                }
            }
            leftArray = new int[lessArrayCounter];
            rightArray = new int[greatArrayCounter];
            middleArray = new int[equalArrayCounter];

            // copy array into three different arrays (less, equal, and greater)
            // this loop will finish before counters become 0
            for (int i = 0; i < array.length; i++) {
                if (array[i] == array[0]) {
                    middleArray[middleArray.length - equalArrayCounter] = array[i];
                    equalArrayCounter--;
                } else if (array[i] < array[0]) {
                    leftArray[leftArray.length - lessArrayCounter] = array[i];
                    lessArrayCounter--;
                } else {
                    rightArray[rightArray.length - greatArrayCounter] = array[i];
                    greatArrayCounter--;
                }
            }
            return SortUtilities.cat(quickSort(leftArray), middleArray, quickSort(rightArray)); //recursive case
        }
    }

    public static int [] selectionSort (int [] array){
//        int copy1 [] = array;
        for (int i = 0; i < array.length-1; i++){  // for the index
            int small = i;
            for (int j = i + 1; j < array.length; j++){
                if (array[j] < array[small]){
                    small = j;
//                    swap(array, array[small], array[i]);
//                    int temp = copy[small];
//                    copy[small] = copy[i];
//                    copy[i] = temp;
                }
            }
            if (small != i) {
//                int temp = array[small];
//                array[small] = array[i];
//                array[i] = temp;
                swap(array, small, i);

            }
        }
        return array;
    }
    public static void heapSort (int array[]){
        int n = array.length;
        for (int i = n/2-1; i >=0;i--) {
            heapify(array, n, i);
        }
        for (int j = n-1; j>=0; j--){
            int temp = array[0];
            array[0] = array[j];
            array[j] = temp;
            heapify(array, j, 0);
        }
    }

    public static void heapify(int array[], int n, int i){
        int largest = i;
        int l = 2*i +1;
        int r = 2*i +2;
        if (l < n && array[l] > array[largest])
            largest = l;
        if(r < n && array[r] > array[largest])
            largest = r;
        if (largest != i) {
            int swap = array[i];
            array[i] = array[largest];
            array[largest] = swap;
            heapify(array, n, largest);
        }
    }
}



