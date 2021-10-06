/* SWEN-601
 * Condy Kan
 * ck2860@rit.edu
 */

package homework02;
/**
 * Using java.util.Scanner class for standard input
 */
import java.util.Scanner;
/*
*Answering the question #2 of Homework #02
 */
public class MassParameter_Question2 {
    /**
     * Einstein function is used to calculate and return energy in Joules by using the equation, E=mc^2
     * Speed of light (c) = 3*10^8 m/s, that was found on (https://hypertextbook.com/facts/2002/JohnnyAlicea2.shtml)
     * @param grams the mass in grams that an user enters
     * @return the result of energy in Joules
     */
    public static double Einstein(double grams) {
        double c = 3.00 * 100000000; //3.0*10^8 m/s
        double m = (grams / 1000); // converting it to kilogram
        double E = m*c*c; // E = mc^2
        return E;
    }
    /**
     *The scanner method was used to create a scanner and read from an input for the Einstein function.
     * System.out.println was used for a prompt.
     * When an user enters an input(a number of grams), the Einstein function executes and prints the energy in Joules.
     */
    public static void main(String[] args) {
        Scanner energy = new Scanner(System.in);
        System.out.println("Enter a number of grams");
        float mass = energy.nextFloat();
        System.out.println(Einstein(mass) + " J");
    }
}
// end of MassParameter_Question2 Java Class