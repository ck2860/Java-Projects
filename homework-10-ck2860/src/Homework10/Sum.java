/* SWEN-601
 * Condy Kan
 * ck2860@rit.edu
 */
package Homework10;
/*
 *Answering the question #1 of Homework #10.
 */
public class Sum extends AbstractOperation {
    /**
     * The constructor for the sum operation that takes a String operator.
     * @param operator String operator should be "+"
     */
    public Sum(String operator) {
        super(operator);
    }

    /**
     * the method is to add the operands
     * if the user does not enter any operands or null, etc then it would return 0.
     * if the user enters something, it would return the total.
     * @param operands a double array of operands
     * @return total
     */

    @Override
    public double operation(double[] operands) {
        if (operands == null|| operands.length == 0) {
            return 0;
        } else {
            double total = 0.0d;
            for (double operand : operands){
                total += operand;
            }
            return total;
        }
    }
}
// end of Sum Java class.