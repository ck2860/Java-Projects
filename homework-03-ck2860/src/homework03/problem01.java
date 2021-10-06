/* SWEN-601
 * Condy Kan
 * ck2860@rit.edu
 * The goal of the assignment#03 is to use boolean expressions, a series of if-else-if statements, and switch statements
 * and develop java programming skills.
 */

package homework03;
/*
 * Using java.util.Scanner class for standard input
 */
import java.util.Scanner;
/*
*Answering the question #1 of Homework #03.
 */
public class problem01 {

/**
 * public static void (String[] args) {} is the main method.
 * The entire program, which is the main method's body, was executed.
 * The Scanner method is used to allow/read the user's input.
 * First prompt is printed to ask the user for her/his age.
 * Once the user enters her/his age, the conditional statements are executed.
 * A series of a if-else-if: one if statement, three else-if statements and one else statement is performed.
 * The if statement's body would be executed when the user enters less than 10; the statement: "Is this your first program?" would be printed.
 * the first of else-if statement's body would be executed if the user enters a number between 10 and 12; "A tween!" would be printed.
 * If the user's input between 13 and 19,"A teen" statement is executed in the second else-if's body.
 * If the user enters a number between 20 and 29, the third and last else-if statement would be executed; "A twenty-something!") prints in the output.
 * Printing "with age comes experience" is in the else statement.
 * Lastly, the else statement would be executed when the user puts a number that is greater or equal to 30.
 *
 * @param args is a part of the main method, for command arguments.
*/

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("How old are you?");
        int age = scanner.nextInt();
        
        if (age < 10) {
            System.out.println("Is this your first program?");
        } else if (age < 13) {
            System.out.println("A tween!");
        } else if (age < 20) {
            System.out.println("A teen!");
        } else if (age < 30) {
            System.out.println("A twenty-something!");
        } else {
            System.out.println("With age comes experience");
        }
    }
}
// end of problem01 Java Class