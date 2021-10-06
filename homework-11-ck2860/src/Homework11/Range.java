/* SWEN-601
 * Condy Kan
 * ck2860@rit.edu
 */
package Homework11;
/*
 * Answering the question #1 of the homework #11
 */
public class Range {

//    public Range(){} // do we need a constructor??

    /**
     * The function takes three parameters for the start, the end, and the step.
     * Every time the start adds up to step, it assigns to its index in the array.
     * @param m is for the start
     * @param n is for the end
     * @param k the step between values in the array.
     * @return an array of the integers with values in the range of m to n
     */
    public static int [] makeRange(int m, int n, int k){
        int [] arrayOne = new int [((n-m)/k)+1]; // adding one to hold all of the values
        int currentIndex = 0;
        for(m = m ; m <= n; m+=k) {
            arrayOne[currentIndex] = m;
            currentIndex++;
        }
        return arrayOne;
    }

    /**
     * Calling the makeRange function(m, n, k) and setting k to 1 as default.
     * @param m is for the start
     * @param n is for the end
     * @return the result of makeRange function(m,n, k)
     */
    public static int [] makeRange(int m, int n) {
        return makeRange(m, n, 1);
    }
    /**
     * Calling the makeRange function(m, n, k) and setting m to 0 and k to 1 as default.
     * @param n is for the end
     * @return the result of makeRange function(m,n, k)
     */
    public static int [] makeRange(int n) {
        return makeRange(0, n, 1);
    }

    public void hi() {
        System.out.println("cant see me");
    }
}
