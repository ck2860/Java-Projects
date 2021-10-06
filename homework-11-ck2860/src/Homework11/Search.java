/* SWEN-601
 * Condy Kan
 * ck2860@rit.edu
 */
package Homework11;
/*
 * Answering the question #2 of the homework #11
 */
public class Search {
    /**
     * created a field for index, so every object always start with index at zero.
     */
    private static int index = 0;

    public Search() {} // do we need a constructor??

    /**
     * The function performs as a linear search over the array for the specified target value.
     * So if it doesn't match the first one, then it moves on to the next one, etc until it finds the target value.
     * If they do not match, it returns -1.
     * The function has two parameters: one for int [] array and int target.
     *
     * @param array  the array that holds values
     * @param target the value that you look for/see if it matches in the array.
     * @return the index of the target value in the array
     */

    public static int linearSearch(int[] array, int target) {
        // base case
        if (array.length - 1 < index) {
            index = 0;
            return -1;
        } else if (array[index] == target) {
            int returnIndex = index;
            index = 0;
            return returnIndex; // return index if the target and the value is in the array matched
        } else {
            //recursive case
            index++;
            return linearSearch(array, target);
        }
    }

    public static int linearSearch1(int [] array, int target) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == target) {
                return i;
            }
        }
        return -1;
    }
//        for (int value : array) {
//            if (value == target) {
//                return array[value];
//            }

    /**
     * The function performs as a binary search to find the target value in the array.
     * Binary search is when you look at the middle in the array first then if it isn't matched
     * Then check if the target value is smaller or greater than the middle value
     * You check the left of the halved array if the target value is smaller
     * Or check the right of the halved array if the target value is greater
     * If they do not match, it returns -1.
     * The function has two parameters: int [] array and int target.
     *
     * @param array  the array that holds values
     * @param target the value that you look for/see if it matches in the array.
     * @return the index of target value in the array.
     */

    public static int binarySearch(int[] array, int target) {
        return helper(array,0, array.length-1, target);
    }
    /**
     *
     * The helper method is used to help binary search.
     * If the array[middle] is greater than the target value then we look at the middle of the left array.
     * Otherwise, look at the middle value of right array.
     * @param array  the array that we set from the range
     * @param start the start of the array
     * @param end the end of the array
     * @return recursion
     */
    public static int helper(int [] array, int start, int end, int target){
        int middle =(end+start)/2;
        //base case
        if (array.length <=0  || start > end ) {
            return -1;
        } else if (array[middle] == target){
            return middle; // returns index
        } else if (array[middle] > target) {
            // recursive case
            end = middle - 1;
            return helper(array, start, end, target);
        } else { // array[middle ] < target
            start = middle + 1;
            return helper(array, start, end, target);
        }
    }
}


