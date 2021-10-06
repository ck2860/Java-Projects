/* SWEN-601
 * Condy Kan
 * ck2860@rit.edu
 * The goal of the assignment#03 is to use boolean expressions, a series of if-else-if statements, and switch statements
 * and develop java programming skills.
 */

package homework03;
/*
 * importing java.util.Random class for generating a pseudorandom number
 * Obtaining from Oracle's java.util.Random documentations (https://docs.oracle.com/en/java/javase/12/docs/api/java.base/java/util/Random.html)
 */
import java.util.Random;
/*
 * importing java.util.Scanner class for standard input
 */
import java.util.Scanner;
/*
 *Answering the question #3 of Homework #03
 */
public class problem03 {

    /**
     * This guessing function would allow the user to guess a number and see if this guessed number is higher, lower, or equal to the generated pseudorandom number (randomized number).
     * There are if statement, else-if statement, and one else statement in the conditional statement for this guessing function.
     * If the guessed number is higher than the randomized number, the body of the if statement will be performed & printed, "Too high!".
     * The else-if's body would be executed only if the guessed number is lower than the randomized number. The output would be "Too low!".
     * The else statement happens when you correctly guess the randomized number. It prints "Correct!".
     * Also, the function returns the boolean value, if the guess is correct then it's true but if the guess is not correct then false.
     * @param number the generated pseudorandom number.
     * @param guess the number that an user guesses and enters.
     * @return the boolean value: true if the user's guess is equal to the randomized number, and false if the user 's guess isn't equal to the randomized number.
     */

    public static boolean guessing(int number, int guess){
        boolean boo;
        if (guess > number){
            System.out.println("Too high!");
            boo = false;
        }else if (guess < number ){
            System.out.println("Too low!");
            boo = false;
        }else {
            System.out.println("Correct!");
            boo = true;
        }
        return boo;
    }

    /**
     * The program that would allow the user to make guesses (up to 3 guesses) and execute the Random method in the main method.
     * The pseudorandom number would be generated between 1 and 10 for the guessing function.
     * the nextInt(int bound) is obtained from Oracle's java.util.Random documentation.
     * nextInt(10) command is used. However, the number would return an value between 0 to 9. So 1 is added to the command in order to get this randomized number is between 1 and 10.
     * The Scanner method is executed to obtain the user's input.
     * Once a prompt prints in the output and asks the user to guess/enter a number, the guessing function is performed.
     * For the entire program, if the guess is incorrect, the guess would be false. However, if the guess is correct, the guess would be true.
     * There is one if and one else statement for this first guessing.
     * If the first guess is false, the only if statement for first guessing would be performed and printed, "Try again. Please guess a number: " so the user has to guess again.
     * If the first guess is true, the user wouldn't get asked again and the body of else statement would be executed. The output statement is "You got it first time".
     * If the user enters her/his second guess, the guessing function would be executed for the second guessing.
     * Conditional statements (one if and one else statements) would be executed for the second guessing
     * If the user's second guess is false, the if statement would be executed and the user would need to guess again. The output will be ""Try again. Please enter a number: " for a third guessing prompt
     * If the user's second guess is true, then else statement's body would perform and print "You got it second time".
     * When the user has to make her/his last guess, the guessing function is performed for the third time.
     * There is last one if and else statement for this third and last guessing.
     * If the user's third guess is false, she/he runs out of chances. The if statement's body would be performed and printed, "You only can have three guesses, sorry!".
     * The body of the else statement will be performed if the user's third guess is true. It prints "You got it third time".
     *
     * @param args is a part of the main method, for command arguments.
     */

    public static void main(String[] args){
        Random r = new Random();
        // adding 1 to int number in order to make 0 as exclusive,
        // set random number value between from 1 to 10
        int number = r.nextInt(10) + 1;
        System.out.println("Please guess a number: ");
        Scanner scanner = new Scanner(System.in);
        int userGuess1 = scanner.nextInt();
        boolean guess1 = guessing(number, userGuess1);
        if (guess1 == false) {
            System.out.println("Try again. Please guess a number: ");
            int userGuess2 = scanner.nextInt();
            boolean guess2 = guessing(number, userGuess2);
            if (guess2 == false) {
                System.out.println("Try again. Please enter a number: ");
                int userGuess3 = scanner.nextInt();
                boolean guess3 = guessing(number, userGuess3);
                    if (guess3 == false){
                        System.out.println("You only can have three guesses, sorry!");
                    }else {
                        System.out.println("You got it third time!");
                    }
            }else{
                System.out.println("You got it second time!");
            }
        }else{
            System.out.println("You got it first time");
        }

    }
}
// end of problem03 Java Class
