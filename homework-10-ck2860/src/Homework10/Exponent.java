/* SWEN-601
 * Condy Kan
 * ck2860@rit.edu
 */
package Homework10;
/*
 *Answering the question #3 of Homework #10.
 */
public class Exponent extends AbstractOperation {
    /**
     * The constructor for the exponent operation that takes a String operator.
     * @param operator String operator should be "^" or "**"
     */
    public Exponent(String operator){
        super(operator);
    }
    /**
     * the method is to exponent of the operands
     * if the user does not enter any operands or null, etc then it would return 0.
     * if the user enters something, it would return the total.
     * @param operands a double array of operands
     * @return result
     */
    @Override
    public double operation(double[] operands) {
        if (operands == null || operands.length == 0) {
            return 0;
        }else if(operands.length == 1){
            return operands[0];
        }else if(operands[1] < 0){
            double operand1 = -(operands[1]);
            double result = operands[0];
            for (int i = 1; i < operand1 ; i++ ){
                result *= operands[0];
            }return (1/result);
        }else if(operands[1] == 0) {
            return 1;
        }else{
            double result = operands[0];
            for (int i = 1; i < operands[1]; i++ ){
                result *= operands[0];
            }
         return result;
        }
    }
}
// end of Exponent Java class.