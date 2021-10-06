/* SWEN-601
 * Condy Kan
 * ck2860@rit.edu
 */

package homework02;
/**
 * java.util.Scanner class was imported for standard input
 */
import java.util.Scanner;
/*
 *Answering the question #3 of Homework #02
 */
public class StringParameter_Question3 {
    /**
     * This concatenate function would concatenate five parameters: two strings, an integer, a floating point, and a boolean respectively
     * and return the final concatenated result as a String.
     *
     * @param a first string of the concatenation, which is the user's first input
     * @param b the user's input of second string of the concatenation
     * @param c the user enters an integer to add onto interconnected two strings.
     * @param d a floating point of the concatenation that the user would input
     * @param e the user has two options (true or false) to add the final part of the concatenation.
     * @return the concatenated string of five parameters
     */
    public static String concatenate(String a, String b, int c, float d, boolean e) {
        String str = a + b + c + d + e;
        return str;
    }
    /**
     * The Scanner was created in order to read the user's inputs
     * First System.out.println was used for a prompt, telling the user to enter a string
     * Once the user will enter a string for the first parameter, the input will be stored as the first string parameter(a).
     * The second prompt, saying to enter a string was printed.
     * When the second input enters, it stores as a second string parameter (b).
     * The third prompt is printed, letting the user know that this input must be an integer value.
     * The integer parameter (third parameter (c)) will be defined as the user's integer input.
     * Fourth System.out.println allows the user answer the question/prompt to match and define the fourth parameter(d)
     * Final prompt prints as the user has two options (true or false) to enter and define the fifth and final parameter(e)
     * Lastly, the conctenated string of all five values will be printed.
     */
    public static void main(String[] args) {
        Scanner string = new Scanner(System.in);
        System.out.println("Enter a string.");
        String first = string.next();
        System.out.println("Enter a char.");
        String second = string.next();
        System.out.println("Enter an integer.");
        int third = string.nextInt();
        System.out.println("Enter a floating point.");
        float fourth = string.nextFloat();
        System.out.println("Enter a boolean.");
        boolean fifth = string.nextBoolean();
        System.out.println(concatenate(first, second, third, fourth, fifth));
    }
}
// end of StringParameter_Question3 Java Class