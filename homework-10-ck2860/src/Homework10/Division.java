/* SWEN-601
 * Condy Kan
 * ck2860@rit.edu
 */
package Homework10;
/*
 *Answering the question #2 of Homework #10.
 */
public class Division extends AbstractOperation {
    /**
     * The constructor for the division operation that takes a String operator.
     * @param operator String operator should be "/"
     */
    public Division(String operator) {
        super(operator);
    }

    /**
     * the method is to divide the operands
     * if the user does not enter any operands or null, etc then it would return 0.
     * if the user enters something, it would return the total.
     * @param operands a double array of operands
     * @return result
     */
    @Override
    public double operation(double[] operands) {
        if (operands == null || operands.length == 0) {
            return 0;
        } else {
//            double result = operands[0]/operands[1];
//            return  result;
            double result = operands[0];
            for (int i = 1; i < operands.length; i++) {
                if (operands[i] == 0) {
                    result = -0;
//                    System.out.println("Cannot be divided by 0");
                } else {
                    result /= operands[i];
                }
            }
            return result;
        }
    }
}
// end of Division Java class.