/* SWEN-601
 * Condy Kan
 * ck2860@rit.edu
 */
package Homework11;
/**
 * using java.util.Scanner class for standard input
 */
import java.util.Scanner;
/*
 * Answering the question #3 of the homework #11
 */
public class Main {
    /**
     * The scanner was used to ask the user to enter the values for m,n and k.
     * Those inputs were used for the makeRange function in order to create an array.
     * The user would be asked again, to enter a target value to search for in the array.
     * If she/he enters 0 for target value then the program would quit.
     * Once the target value is entered, linearSearch function would be executed to find the value
     * It would print if it is found or not and tells you the time in milliseconds that it takes to find the target value.
     *
     * @param args
     */
    public static void main(String[] args) {

        System.out.println("Please enter to start the range with: ");
        Scanner scanner = new Scanner(System.in);
        int input1 = scanner.nextInt();
        System.out.println("Please enter to finish the range with: ");
        int input2 = scanner.nextInt();
        System.out.println("Please enter to add the step between values in the range: ");
        int input3 = scanner.nextInt();
        int arrayRange[] = Range.makeRange(input1, input2, input3);
        System.out.println("The length of the array is: " + arrayRange.length);
        int counter = 0;
        while (counter < 1) {
            System.out.println("Enter a target value to search for: ");
            int target = scanner.nextInt();
            if (target < 0) {
                counter++;
            } else {
                Search search1 = new Search();
                System.out.println("Linear search: ");
                int searchLinear = search1.linearSearch(arrayRange, target);
                long start = System.currentTimeMillis(); // comparing time with loop.
                search1.linearSearch1(arrayRange,target);  // for time
                long totalTime1 = (System.currentTimeMillis() - start);
                if (searchLinear == -1){
                    System.out.println("The target value is not in the array");
                }else{
                    System.out.println("The target value is at index "+ searchLinear);
                }
                System.out.println((totalTime1) + " is the total time of linear search in milliseconds.");
                System.out.println("________________________________________________________");
                System.out.println("Binary search: ");
                long start1 = System.currentTimeMillis();
                int searchBinary = search1.binarySearch(arrayRange, target);
                long totalTime2 = (System.currentTimeMillis() - start1);
                if (searchBinary == -1 ){
                    System.out.println("The target value is not in the array");
                }else{
                    System.out.println("The target value is at index "+ searchBinary);
                }
                System.out.println((totalTime2) + " is the total time of binary search in milliseconds.");
                System.out.println("To compare linear search and binary search, the difference between both times is: " + (totalTime2 - totalTime1));
            }
        }
    }
}
