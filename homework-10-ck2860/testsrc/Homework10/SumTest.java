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
public class SumTest {
    /**
     * If there is only one operand in the array, it has to return the operand.
     */
    @Test
    public void operationSingle() {
        AbstractOperation op = new Sum("+");
        String inputOperator = "+";

        double[] input = {6.0d};
        double expected = 6.0d;

        double result = op.operation(input);
        Boolean operator = op.matches(inputOperator);

        assertEquals(true, operator);
        assertEquals(expected, result);
    }
    /**
     * If there is null in the array, it has to return 0.
     */
    @Test
    public void operationNull() {
        AbstractOperation op = new Sum("+");
        String inputOperator = "+";

        double[] input = null;
        double expected = 0.0d;

        double result = op.operation(input);
        Boolean operator = op.matches(inputOperator);

        assertEquals(true, operator);
        assertEquals(expected, result);
    }
    /**
     * If there is none in the array, it has to return 0.
     */
    @Test
    public void operationZero(){
        AbstractOperation op = new Sum("+");
        String inputOperator = "+";

        double [] input = { };
        double expected = 0.0d;

        double result = op.operation(input);
        Boolean operator = op.matches(inputOperator);

        assertEquals(true, operator);
        assertEquals(expected, result);
    }
    /**
     * If there is three numbers or more in the array, it has to return the total
     */
    @Test
    public void operationMultiple(){
        //setup
        AbstractOperation op = new Sum("+");
        String inputOperator = "+";

        double [] input = {10.0d, 5.0d, 12.0d};
        double expected = 27.0d;

        // invoke
        double result = op.operation(input);
        Boolean operator = op.matches(inputOperator);

        // assert
        assertEquals(true, operator);
        assertEquals(expected, result);
    }
    /**
     * If there are negative numbers in the array, it has to return the total.
     */
    @Test
    public void operationNegative(){
        //set up
        AbstractOperation op = new Sum("+");
        String inputOperator = "+";

        double [] input = {-5.0d, -10.0d};
        double expected = -15.0d;

        // invoke
        double result = op.operation(input);
        Boolean operator = op.matches(inputOperator);

        // assert
        assertEquals(true, operator);
        assertEquals(expected, result);
    }
    /**
     * If there is two numbers in the array, it has to return the total
     */
    @Test
    public void operationDoubles() {
        //set up
        AbstractOperation op = new Sum("+");
        String inputOperator = "+";

        double [] input = {5.5d, 5.5d};
        double expected = 11.0d;

        // invoke
        double result = op.operation(input);
        Boolean operator = op.matches(inputOperator);

        // assert
        assertEquals(true, operator);
        assertEquals(expected, result);
    }
    /**
     * If there is mixed signed numbers in the array, it has to return the total.
     */
    @Test
    public void operationPosAndNeg() {
        //set up
        AbstractOperation op = new Sum("+");
        String inputOperator = "+";

        double [] input = {-5.0d, 1.0d, 5.0d};
        double expected = 1.0d;

        // invoke
        double result = op.operation(input);
        Boolean operator = op.matches(inputOperator);

        // assert
        assertEquals(true, operator);
        assertEquals(expected, result);
    }
    /**
     * If there is a value of zero in the array, it shouldnt affect the total.
     */
    @Test
    public void operationAddByZero(){
        AbstractOperation op = new Sum("+");
        String inputOperator = "+";

        double [] input = {0.0d, 4.0d};
        double expected = 4.0d;

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
        AbstractOperation op = new Sum("+");
        String inputOperator = "++";

        Boolean operator = op.matches(inputOperator);

        assertEquals(false, operator);
    }
    /**
     * If the operators don't match, it has to return false.
     */
    @Test
    public void operationErrorOperator2(){
        AbstractOperation op = new Sum("+");
        String inputOperator = null;

        Boolean operator = op.matches(inputOperator);

        assertEquals(false, operator);
    }
    /**
     * If the operators don't match, it has to return false.
     */
    @Test
    public void operationErrorOperator3(){
        AbstractOperation op = new Sum("+");
        String inputOperator = "*";

        Boolean operator = op.matches(inputOperator);

        assertEquals(false, operator);
    }
}
