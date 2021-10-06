/* SWEN-601
 * Condy Kan
 * ck2860@rit.edu
 */

package homework02;
/*
 *Answering the question #1 of Homework #02
 */
public class TemperatureParameter_Question1 {
    /**
     * This function converts degrees Fahrenheit to degrees Kelvin
     * by using the formula (K = (5/9 (F - 32) + 273))
     * and returns the result.
     *
     *
     * @param F The temperature in degrees Fahrenheit
     * @return the temperature in degrees Kelvin
     */
    public static int temperature(int F) {
        // K variable is/stands for degrees Kelvin
        int K = ((F-32) * 5/9 + 273);
        return K;
    }
    /**
     * The given temperature of 212 degrees Fahrenheit would be
     * converted to degree Kelvin by executing the temperature function.
     * Lastly, the Statement ("212 degrees Fahrenheit is 373 degrees Kelvin.")
     * would be printed.
     */
    public static void main(String[] args) {
        int K = temperature(212);
        System.out.println("212 degrees Fahrenheit is " + K + " degrees Kelvin.");
    }
}
// end of TemperatureParameter_Question1 Java Class