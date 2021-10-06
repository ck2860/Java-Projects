/* SWEN-601
 * Condy Kan
 * ck2860@rit.edu
 */
package Homework10;
/*
 *Answering the question #2 of Homework #10.
 */
public class Multiply extends AbstractOperation{
    /**
     * The constructor for the multiply operation that takes a String operator.
     * @param operator String operator should be "*"
     */
    public Multiply(String operator){
        super(operator);
    }
    /**
     * the method is to multiply the operands
     * if the user does not enter any operands or null, etc then it would return 0.
     * if the user enters something, it would return the total.
     * @param operands a double array of operands
     * @return total
     */
    @Override
    public double operation(double[] operands) {
        if (operands == null ||operands.length == 0){
            return 0;
        }else{
            double result = operands[0];
            for (int i = 1; i < operands.length; i++ ){
                result = result * operands[i];
            }
            return result;
        }
    }
}
// end of Multiply Java class.