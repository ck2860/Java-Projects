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
class ExponentTest {
    /**
     * If there is only one operand in the array, it has to return the operand.
     */
    @Test
    public void operationSingle() {
        AbstractOperation op = new Exponent("**");
        String inputOperator = "**";

        double[] input = {5.0d};
        double expected = 5.0d;

        double result = op.operation(input);
        Boolean operator = op.matches(inputOperator);

        assertEquals(true, operator);
        assertEquals(expected, result);
    }
    /**
     * If there is none in the array, it has to return 0.
     */
    @Test
    public void operationZeroes() {
        AbstractOperation op = new Exponent("^");
        String inputOperator = "^";

        double[] input = {};
        double expected = 0.0d;

        Boolean operator = op.matches(inputOperator);
        Double result = op.operation(input);

        assertEquals(true, operator);
        assertEquals(expected, result);
    }
    /**
     * If there is null in the array, it has to return 0.
     */
    @Test
    public void operationNull() {
        AbstractOperation op = new Exponent("**");
        String inputOperator = "**";

        double[] input = null;
        double expected = 0.0d;

        Boolean operator = op.matches(inputOperator);
        Double result = op.operation(input);

        assertEquals(true, operator);
        assertEquals(expected, result);
    }
    /**
     * If there is two numbers in the array, it has to return the total
     */
    @Test
    public void operationDoubles() {
        AbstractOperation op = new Exponent("^");
        String inputOperator = "^";

        double[] input = {2.5d, 3.0d};
        double expected = 15.625d;

        double[] input1 = {3.0d, 5.0d};
        double expected1 = 243.0d;

        double result = op.operation(input);
        double result1 = op.operation(input1);


        Boolean operator = op.matches(inputOperator);

        assertEquals(true, operator);
        assertEquals(expected, result);
        assertEquals(expected1, result1);
    }
    /**
     * If the exponent is zero, it has to return 1.
     */
    @Test
    public void operationExponentByZero() {
        AbstractOperation op = new Exponent("**");
        String inputOperator = "**";

        double[] input = {8.0d, 0.0d};
        double expected = 1.0d;

        double[] input1 = {0.0d, 0.0d};
        double expected1 = 1.0d;

        double result = op.operation(input);
        double result1 = op.operation(input1);

        Boolean operator = op.matches(inputOperator);
        assertEquals(true, operator);
        assertEquals(expected, result);
        assertEquals(expected1, result1);
    }
    /**
     * If the base is negative, it has to return either positive or neg answer.
     */
    @Test
    public void operationNegativeBase() {
        AbstractOperation op = new Exponent("^");
        String inputOperator = "^";

        double[] input = {-5.0d, 2.0d};
        double expected = 25.0d;
        double result = op.operation(input);

        Boolean operator = op.matches(inputOperator);

        assertEquals(true, operator);
        assertEquals(expected, result);
    }
    /**
     * If the exponent is negative, it has to return the positive answer.
     */
    @Test
    public void operationNegativeExponent() {
        AbstractOperation op = new Exponent("**");
        String inputOperator = "**";

        double[] input = {2.0d, -5.0d};
        double expected = 0.03125d;
        double result = op.operation(input);

        Boolean operator = op.matches(inputOperator);

        assertEquals(true, operator);
        assertEquals(expected, result);
    }
    /**
     * If both numbers are negative, it has to return the negative answer.
     */
    @Test
    public void operationBothNegative() {
        //set up
        AbstractOperation op = new Exponent("^");
        String inputOperator = "^";

        double[] input = {-2.0d, -5.0d};
        double expected = -0.03125d;

        // invoke
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
        AbstractOperation op = new Exponent("^");
        String inputOperator = "!";

        Boolean operator = op.matches(inputOperator);

        assertEquals(false, operator);
    }
    /**
     * If the operators don't match, it has to return false.
     */
    @Test
    public void operationErrorOperator2(){
        AbstractOperation op = new Exponent("^");
        String inputOperator = null;

        Boolean operator = op.matches(inputOperator);

        assertEquals(false, operator);
    }
    /**
     * If the operators don't match, it has to return false.
     */
    @Test
    public void operationErrorOperator3(){
        AbstractOperation op = new Exponent("**");
        String inputOperator = "^";

        Boolean operator = op.matches(inputOperator);

        assertEquals(true, operator);
    }
}