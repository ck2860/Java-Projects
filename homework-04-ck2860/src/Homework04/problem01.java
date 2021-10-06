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
* Answering the question #1 of the homework #04
 */
public class problem01 {
    /**
     * The f (stands for f loop) is used to obtain the prime numbers and return boolean values if the prime number is true, otherwise false.
     * Since prime numbers have to be divisible by only itself and 1, a modulo operator is used to set the non-prime numbers as false.
     * Boolean boo1 is set as true, assuming all of the numbers are prime.
     * 0 and 1 aren't prime numbers so the if statement is used to set these numbers as false.
     * If the user enters a number that is greater than 1, the else statement is executed.
     * The for loop is used, we start at 2, condition is used to keep the loop executing until it becomes false.
     * Lastly, the initialized variable would be incremented so the condition would be false and stop the for loop from executing.
     * the if statement inside of for loop is used to set those numbers that can be divided and do not have a remainder as false.
     * The rest of the numbers that do not meet the if statement condition, they are still remained as true.
     *
     * @param n an integer that an user enters to obtain the amount of prime numbers
     * @return the boolean value of numbers. If it is prime, it would return true but if it is not prime, it returns false.
     */
    public static boolean f(long n) {
        boolean boo1 = true;
         // boo = true if the number is prime, & false otherwise.
        if (n <= 1) { // 0 and 1 arent  prime numbers.
            boo1 = false;
        } else {
            for (int i = 2; i < n; i++) {
                // the condition has to be i < n so n (especially prime) wouldn't be divided itself.
                if (n % i == 0)
                    boo1 = false;
            }
        }
        return boo1;
    }
    /**
     * The w (stands for while loop) is used to obtain the prime numbers and return boolean values if the prime number is true, otherwise false.
     * Since prime numbers have to be divisible by only itself and 1, a modulo operator is used to set the non-prime numbers as false.
     * Boolean boo2 is set as true, assuming all of the numbers are prime.
     * 0 and 1 aren't prime numbers so the if statement is used to set these numbers as false.
     * If the user enters a number that is greater than 1, the else statement is executed.
     * The while loop is used, we start at 2, condition is used to keep the loop executing until it becomes false.
     * Lastly, the initialized variable would be incremented so the condition would be false and stop the while loop from executing.
     * the if statement inside of while loop is used to set those numbers that can be divided and do not have a remainder as false.
     * The rest of the numbers that do not meet the if statement condition, they are still remained as true.
     *
     * @param n an integer that an user enters to obtain the amount of prime numbers
     * @return the boolean value of numbers. If it is prime, it would return true but if it is not prime, it returns false.
     */
    public static boolean w(long n) {
        boolean boo2 = true;
        // boo = true if the number is prime; otherwise false.
        if (n <= 1) {
            boo2 = false;
        } else {
            int i = 2;
            while (i < n) {
                if (n % i == 0)
                    boo2 = false;
                    i ++;
            }
        }
        return boo2;
    }
    /**
     * The d (stands for do while loop) is used to obtain the prime numbers and return boolean values if the prime number is true, otherwise false.
     * Since prime numbers have to be divisible by only itself and 1, modulo operator is used to set the non-prime numbers as false.
     * Boolean boo3 is set as true, assuming all of the numbers are prime.
     * 0 and 1 aren't prime numbers so the if statement is used to set these numbers as false.
     * If the user enters a number that is greater than 1, the else statement is executed.
     * The do while loop is used, we start at 2, condition is used to keep the loop executing until it becomes false.
     * Lastly, the initialized variable would be incremented so the condition would be false and stop the do while loop from executing.
     * the if statement inside of do while loop is used to set those numbers that can be divided and do not have a remainder as false.
     * The rest of the numbers that do not meet the if statement condition, they are still remained as true.
     *
     * @param n an integer that an user enters to obtain the amount of prime numbers
     * @return the boolean value of numbers. If it is prime, it would return true but if it is not prime, it returns false.
     */
    public static boolean d(long n) {
        boolean boo3 = true;
        // boo = true if the number is prime; otherwise false.
        if (n <= 1) {
            boo3 = false;
        } else {
            int i = 2;
            if (i < n) {
                do {
                    if (n % i == 0) {
                        boo3 = false;
                    }
                    i++;
                } while (i < n);
            }
        }
        return boo3;
    }
    /**
     * The scanner method was used to create a scanner and read from an input for those three loops.
     * System.out.println was used for a prompt.
     * When an user enters an input (an integer and a letter for a loop methods), the input would be split into a 64-bit integer for an amount of prime numbers and a letter for a chosenloop
     * If the user choose f, w, or d, the switch statement would be performed and one of those cases would be executed.
     * When one of those cases in Switch statement is executed, the nested loops are performed.
     * In nested loop, first loop iterates over every time when second loop prints a prime number and iterates until the condition becomes false.
     * The nested loop is used in order to print the amount of prime numbers that an integer in the input.
     *
     * lastly, when the nested loop is completed, the milliseconds of executing the entire program would be recorded and printed.
     */
    public static void main(String[] args) {
        long time1 = System.currentTimeMillis();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a 64-bit integer amd a loop method ('f' for 'for loop', 'w' for 'while loop', 'd'for 'do while loop') to print your chosen amount of first prime numbers: ");
        String str = scanner.nextLine();

        String input[] = str.split(" ");
        String integer = input[0];
        long n = Long.valueOf(integer);
        String character = input[1];
        char a = character.charAt(0);

        switch (a) {
            case 'f':
                for (long i = 0; i < n; i++) {
                    for (long j = 0; j < n; i++) {
                        if (f(i) == true) {
                            System.out.println(i);
                            j++;
                        }
                    }
                }
                break;
            case 'w':
                for (long i = 0; i < n; i++) {
                    for (long j = 0; j < n; i++) {
                        if (w(i) == true) {
                            System.out.println(i);
                            j++;
                        }
                    }
                }
                break;
            case 'd':
                for (long i = 0; i < n; i++) {
                    for (long j = 0; j < n; i++) {
                        if (d(i) == true) {
                            System.out.println(i);
                            j++;
                        }
                    }
                }
                break;
        }
        long time2 = System.currentTimeMillis();
        System.out.println((time2 - time1) + " is the total time in milliseconds.");
    }
}
// end of Problem01 Java Class.
