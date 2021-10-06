/* SWEN-601
 * Condy Kan
 * ck2860@rit.edu
 * The goal of the assignment#03 is to use boolean expressions, a series of if-else-if statements, and switch statements
 * and develop java programming skills.
 */

package homework03;
/*
 * importing java.util.Scanner class for standard input
 */
import java.util.Scanner;
/*
 *Answering the question #2 of Homework #03
 */
public class problem02 {

    /**
     * The entire program is in the body of the main method.
     *
     * System.out is used to print a prompt for an user, entering either 1 or 2.
     * Scanner is used to read the user's response for the prompt.
     * There is a branching conditional statement for this program.
     * The user has the option to choose 1 to go to the music's conditional statement or choose 2 to go to the movie's conditional statement.
     *
     * When the user choose 1, she/he has a option to discuss music or movies. The if statement would be performed after entering her/his choice.
     * If the input is music, she/he would be asked if she/he likes The Beatles.
     * The if and else statements would be executed in the music conditional statement.
     * If the user likes The Beatles, she/he has to enter true for yes so the if statement's body would be performed. The output is "Good Taste!".
     * If the user doesn't like The Beatles, he/she has to enter false for no so the body of the else statement would be executed.
     * "There is no accounting for taste!" is printed.
     *
     * The else-if statement would be executed if the user enters 2 for movies.
     * Once the user chooses movies to discuss about, she/he would be asked if which Star Wars episode was the best. There are 7 episodes of Star Wars.
     * There are one if statement, two if-else statements  and one else statement are in the movie's conditional statement.
     * The body of if statement for 4 is the same as the body for 5.
     * Th if-else statements for 1, 2, and, 3 have the exact program.
     * Lastly the if-else statements for 6 and 7 execute the same task.
     * The else statement for movie would let the user that they do not have more than 7 episodes.
     * If the user either choose 4 or 5, the body of the if statement would be executed; it prints, "I agree".
     * If the user choose 1, 2, or 3. the body of the if-else statements' body would be performed.
     * If the input is 6 or 7, the body of its's if-else statement will be executed and printed, "I like those, too!".
     * If the user does not choose episode 1-7, the body of the else statement will be printed, "There is no episode (their input) in Star Wars".
     *
     * However if the user neither chooses 1 for music nor 2 for movies, the System.out will be executed, "You neither entered 1 nor 2."
     *
     * @param args is a part of the main method, for command arguments.
     */

    public static void main(String[] args) {
        System.out.println("Enter 1 to discuss music or enter 2 to discuss movies: ");
        Scanner discuss = new Scanner(System.in);
        int a = discuss.nextInt();
        if (a == 1) {
            System.out.println("Let's discuss about music, do you like The Beatles? please enter true for yes or enter false for no");
            Scanner music = new Scanner(System.in);
            Boolean b = music.nextBoolean();
            if (b == true) {
                System.out.println("Good Taste!");
            }else {
                System.out.println("There is no accounting for taste!");
            }
        } else if (a == 2) {
            System.out.println("Let's discuss about movies, which Star Wars episode (1-7) was the best?");
            Scanner movie = new Scanner(System.in);
            int c = movie.nextInt();
            if (c == 4 || c ==5 ) {
                System.out.println("I agree!");
            } else if (c == 1 || c ==2 || c ==3) {
                System.out.println("Um, no");
            } else if (c == 6 || c == 7) {
                System.out.println("I like those, too!");
            } else {
                System.out.println("There is no episode " + c + " in Star Wars");
            }
        }else {
            System.out.println("You neither entered 1 nor 2.");
        }
    }
}
// end of problem02 Java Class