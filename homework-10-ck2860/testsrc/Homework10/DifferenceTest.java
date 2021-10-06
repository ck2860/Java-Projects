/* SWEN-601
 * Condy Kan
 * ck2860@rit.edu
 */
package Homework10;

import org.junit.jupiter.api.Test;
/**
 * for the testing
 */
import static org.junit.jupiter.api.Assertions.assertEquals;
/**
 * for assertEquals method
 */
public class DifferenceTest {
    /**
     * If there is only one operand in the array, it has to return the operand.
     */
    @Test
    public void operationSingle() {
        AbstractOperation op = new Difference("-");

//        String inputOperator = "-";
        String inputOperator = "-";

        double[] input = {8.0d};
        double expected = 8.0d;

        Boolean operator = op.matches(inputOperator);
        double result = op.operation(input);

        assertEquals(true, operator);
        assertEquals(expected, result);
    }
    /**
     * If there is null in the array, it has to return 0.
     */
    @Test
    public void operationNull() {
        AbstractOperation op = new Difference("-");
        String inputOperator = "-";

        double[] input = null;
        double expected = 0.0d;

        double result = op.operation(input);
        Boolean operator = op.matches(inputOperator);

        assertEquals(true, operator);
        assertEquals(expected, result);
    }
    /**
     * If there is two numbers in the array, it has to return the total
     */
    @Test
    public void operationDoubles() {
        //set up
        AbstractOperation op = new Difference("-");
        String inputOperator = "-";

        double [] input = {5.5d, 5.5d};
        double expected = 0.0d;

        // invoke
        double result = op.operation(input);
        Boolean operator = op.matches(inputOperator);

        // assert
        assertEquals(true, operator);
        assertEquals(expected, result);
    }
    /**
     * If there is three numbers or more in the array, it has to return the total
     */
    @Test
    public void operationMultiples() {
        AbstractOperation op = new Difference("-");
        String inputOperator = "-";

        double [] input = {1.2d, 1.0d, 5.0d};
        double expected = -4.8d;

        double result = op.operation(input);
        Boolean operator = op.matches(inputOperator);

        assertEquals(true, operator);
        assertEquals(expected, result);
    }
    /**
     * If there is none in the array, it has to return 0.
     */
    @Test
    public void operationZero() {
        AbstractOperation op = new Difference("-");
        String inputOperator = "-";

        double[] input = {};
        double expected = 0.0d;

        double result = op.operation(input);
        Boolean operator = op.matches(inputOperator);

        assertEquals(true, operator);
        assertEquals(expected, result);
    }
    /**
     * If there is mixed signed numbers in the array, it has to return the total.
     */
    @Test
    public void operationPosAndNeg() {
        //set up
        AbstractOperation op = new Difference("-");
        String inputOperator = "-";

        double [] input = {-5.0d, 1.0d, 5.0d};
        double expected = -11.0d;

        // invoke
        double result = op.operation(input);
        Boolean operator = op.matches(inputOperator);

        // assert
        assertEquals(true, operator);
        assertEquals(expected, result);
    }
    /**
     * If there is negative operands in the array, it has to return negative total.
     */
    @Test
    public void operationNegative(){
        //set up
        AbstractOperation op = new Difference("-");
        String inputOperator = "-";

        double [] input = {-5.0d, -10.0d};
        double expected = 5.0d;

        // invoke
        double result = op.operation(input);
        Boolean operator = op.matches(inputOperator);

        // assert
        assertEquals(true, operator);
        assertEquals(expected, result);
    }
    /**
     * If there is the value of zero in the array, it shouldn't affect the total.
     */
    @Test
    public void operationSubtractedByZero(){
        AbstractOperation op = new Difference("-");
        String inputOperator = "-";

        double [] input = {5.0d, 0.0d};
        double expected = 5.0d;

        double result = op.operation(input);
        Boolean operator = op.matches(inputOperator);

        assertEquals(true, operator);
        assertEquals(expected, result);
    }
    /**
     * If the operators don't match, it has to return false.
     */
    @Test
    public void operationErrorOperator1(){
        AbstractOperation op = new Difference("-");
        String inputOperator = "+";

        Boolean operator = op.matches(inputOperator);

        assertEquals(false, operator);
    }
    /**
     * If the operators don't match, it has to return false.
     */
    @Test
    public void operationErrorOperator2(){
        AbstractOperation op = new Difference("-");
        String inputOperator = null;

        Boolean operator = op.matches(inputOperator);

        assertEquals(false, operator);
    }
}
