/* SWEN-601
 * Condy Kan
 * ck2860@rit.edu
 */
package Homework10;
/*
 *Answering the question #1 of Homework #10.
 */
public interface Operation {
    /**
     * the method that would match the operator
     * @param operator String operator
     * @return boolean value:true or false
     */
    boolean matches(String operator);

    /**
     * the method would compute the math with the given operands
     * @param operands a double array of operands
     * @return the result
     */
    double operation(double[] operands);

}
// end of Operation Interface