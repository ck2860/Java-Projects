/* SWEN-601
 * Condy Kan
 * ck2860@rit.edu
 */
package Homework12;
/**
 * Answering #1 of homework12
 */
import java.util.Random;
/**
 * The java.util.Random class is a pseudorandom number generator
 */
public class SortUtilities {
    /**
     * The private field for random generator, using the seed to keep the same sequence.
     */
    private static final Random randomNumber = new Random(1);

    /**
     * The sorted function would return true if the array parameter is sorted, and false otherwise.
     * We can compare the value at each index i to the value at index i-1.
     *
     * @param array an array
     * @return boolean value: true if its sorted, false otherwise.
     */
    public static boolean sorted(int[] array) {
        for (int i = 1; i < array.length; i++) {
            if (array[i] < array[i - 1]) {
                return false; // returns once
            }
        }
        return true;
    }

    /**
     * The swap function is to swap the values in indexes a and b.
     * Prints an array
     *
     * @param array an array
     * @param a     an index
     * @param b     an index
     */
    public static void swap(int[] array, int a, int b) {
        int temp = array[a];
        array[b] = array[a];
        array[a] = temp;
    }

    /**
     * The makeArray function is to create arrays filled with unsorted random numbers
     *
     * @param size that an array would be.
     * @return an array of the specified size
     */

    public static int[] makeArray(int size) {
        int[] array = new int[size];
        for (int i = 1; i < array.length; i++) {
            array[i] = randomNumber.nextInt(size); // assigns a random number per loop.
        }
        return array;
    }

    /**
     * The first step of the merge sort algorithms: an array of n elements have to be divided into two subarrays
     * with n/2 in each array.
     * One array is created with even index only and another array is created with odds index.
     *
     * @param array an array
     * @return both arrays as a two dimensional array
     */
    public static int[][] divide(int[] array) { // split an array into two arrays by selecting evens and odds.
        int[] arrayEvens;
        int[] arrayOdds;
        if (array.length % 2 == 0) {
            arrayEvens = new int[(array.length / 2)];
            arrayOdds = new int[array.length - arrayEvens.length];
        } else {
            arrayEvens = new int[(array.length / 2) + 1];
            arrayOdds = new int[array.length - arrayEvens.length];
        }
        int evenIndex = 0;
        int oddIndex = 0;
        for (int i = 0; i < array.length; i++) {
            if (i % 2 == 0) {
                arrayEvens[evenIndex] = array[i];
                evenIndex++;
            } else {
                arrayOdds[oddIndex] = array[i];
                oddIndex++;
            }
        }
        return new int[][] {arrayEvens, arrayOdds}; // EX: array[0] = ArrayEvens, array[1] = arrayOdds.
    }

    /**
     * The last step of Merge sort: merging two arrays of n/2 into a single array with n elements
     *
     * @param a first array
     * @param b second array
     * @return one merged array
     */
    public static int[] merge(int[] a, int[] b) {
        int[] mergedArray = new int[a.length + b.length];
        int aIndex = 0;
        int bIndex = 0;
        for (int i = 0; i < mergedArray.length; i++) {
            if (aIndex >= a.length) {
                mergedArray[i] = b[bIndex];
                bIndex++;
                continue;
            }
            if (bIndex >= b.length) {
                mergedArray[i] = a[aIndex];
                aIndex++;
                continue;
            }
            if (a[aIndex] < b[bIndex]) {
                mergedArray[i] = a[aIndex];
                aIndex++;
            } else {
                mergedArray[i] = b[bIndex];
                bIndex++;
            }
        }
        return mergedArray;
    }

    /**
     * The method is used to concatenates the arrays in as a parameter into a single array.
     * @param arrays variable length parameter of arrays
     * @return a concatenated array
     */
    public static int[] cat(int[]...arrays) {
        // determine the size of new concatenated array
        int size = 0;
        for (int[] array : arrays) {
            size += array.length; // count the length of each array(sub-array) of the array.
        }
//         same thing as above
//        for (int i = 0; i < arrays.length; i ++){
//            size = size + arrays[i].length;
//        }

        // make a new concatenated array with our calculated size
        int[] cat_array = new int[size];
        // copy over the number from all arrays into one big array
        int i = 0;
        for (int[] array : arrays) { // looping through each array (subarray) of the array
            for (int number : array) { // looping through each value inside of the subarray.
                cat_array[i] = number; //copying/assigning them into the cat_array.
                i++;
            }
        }
        // same thing as above (nested loop)
//        for (int i = 0; i < arrays.length; i++) {
//            for (int j = 0; j < arrays[i].length; j++) {
//
//            }
//        }
        return cat_array;
    }

//    public static void main(String[] args) {
//        int[] array1 = makeArray(10);
//        int [] copy1 = array1;
//        int [] copy2 = array1;
//        int[] array2 = Sorts.quickSort(copy1);
//        int[] array3 = Sorts.bubbleSort(copy2);
//
//        System.out.println("unsorted\n============");
//        for (int item : array1) {
//            System.out.println(item);
//        }
//        System.out.println("sorted using quickSort\n============");
//        for (int item : array2) {
//            System.out.println(item);
//        }
//        System.out.println("sorted using bubbleSort\n============");
//        for (int item : array3) {
//            System.out.println(item);
//        }
//    }
}

