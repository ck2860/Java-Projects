/* SWEN-601
 * Condy Kan
 * ck2860@rit.edu
 */

package Homework04;
/**
 * using java.util.Scanner class for standard input
 */
import java.util.Scanner;
/*
 * Answering the question #2 of the homework #04
 */
public class problem02 {
    /**
     * The logic of Sieve of Eratosthenes was used to get the prime numbers.
     * The method was obtained from https://en.wikipedia.org/wiki/Sieve_of_Eratosthenes
     * Firstly we have to create a list of consecutive integers from 2 to n.
     * Then we initialized p to 2 since it is the smallest prime number.
     * Thirdly, the multiples of p would be incremented.
     * The first number that is greater than p that is not false then we set p as the primer then repeat.
     * Lastly, in the end, those numbers that aren't marked, are prime numbers below n.
     *
     * The sieve function was created to obtain the prime numbers & return boolean values in the boolean array by following the rules of Sieve of Eratosthenes.
     * The boolean[] boo array was created in order to position the boolean values in the array.
     * The for loop was used to create an array of consecutive integers from 2 to the user's input and set them true.
     * After setting all of the numbers (2 to n), the nested of for loops would be executed to mark/set all of the multiples of the prime numbers to false.
     * The outer loop of the nested loops goes through the all of the boolean values, then if the value in this position in the array is equal to true, then goes on to the inner for loop.
     * In the inner loop, it loops as enumerate/increment the multiples of prime numbers until the condition becomes false.
     * When the condition becomes false, the inner loop exits/goes back to the outer loop.
     * Then it would increment to the next number, etc.. If the value in the position is true, then goes into the inner loop.
     * If the value in the position (multiple of p) has already marked as false, it would not go into the inner loop.
     * It would increment to the next number until the value in next number's position is true.
     * The nested for loops keeps looping until the outer loop of the nested loop's condition becomes false.
     * After the outer loop's condition becomes false, the boolean values would be returned as the entire program is completed.
     * All of the positions in the array aren't marked as false, they are prime numbers in the boolean array.
     *
     * @param n is an integer that an user enters to obtain the amount of prime numbers
     * @return the boolean array that consists of boolean values. If it is prime, it would return true but if it is not prime, it returns false.
     */

    public static boolean[] sieve(int n) {
        boolean[] boo = new boolean[n*n];
        // boolean in arrays's default value is false so don't need to do anything for 0 and 1.
        for (int i = 2; i < boo.length ; i++) {//1st step: creating a list of consecutive integers from 2 to n.
            boo[i] = true;
        }
        for (int p = 2; p < boo.length ; p++) { // 2nd step: starting with 2; 4th step: increment p to next number
            if (boo[p] == true) {
                for (int q = p * p; q < boo.length ; q = q + p) { // 3rd step: increment the multiples of p from 2p, 3p, etc...{
                    boo[q] = false; // marking them as false.
                }
            }
        }
        return boo; //fifth step: all of the numbers that aren't marked as false, should return as true.
    }
    /**
     * The scanner method was used to create a scanner and read from an input for the sieve function.
     * System.out.println was used for a prompt to get the user's chosen amount of prime numbers.
     * The boolean array was created to hold 10 million values so it is big enough to hold the values that an user wants in the array.
     * The array was set to true for prime numbers and false for non-prime numbers values as the sieve function is performed.
     * The counter was used to count primer numbers and would print the user's chosen amount of primer numbers.
     * As the counter sets 0, the for loop executes to go through every position (up to the user's input) in the array
     * and set the boolean values (true if the number is prime, and false if the number is not prime).
     * as setting the prime numbers as true in the boolean array, it prints the prime numbers and  the counter increments until the counter is equal to the input and breaks the flow of the control.
     *
     * Finally, when the for loop completes/stops printing the prime numbers, the milliseconds of executing the entire program would be recorded and printed.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number to get your chosen amount of first prime numbers:");
        int n = scanner.nextInt();
        boolean[] primeArray = new boolean[1000001]; // Creating a boolean array to hold 10 million

        // to count prime numbers in the boolean array & print them out.
        int counter = 0;
        for (int i = 0; i < primeArray.length; i++) {
            primeArray = sieve(n);
            if (counter == n) {
                break;
            } else {
                if (primeArray[i] == true) {
                    System.out.println(i);
                    counter++; }
            }
        }
        System.out.println(System.currentTimeMillis() + " is the total time in milliseconds.");
    }
}
// end of Problem02 Java Class.
