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
class MultiplyTest {
    /**
     * If there is only one operand in the array, it has to return the operand.
     */
    @Test
    public void operationSingle(){
        AbstractOperation op = new Multiply("*");
        String inputOperator = "*";

        double[] input = {8.0d};
        double expected = 8.0d;

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
        AbstractOperation op = new Multiply("*");
        String inputOperator = "*";

        double[] input = {};
        double expected = 0.0d;

        double result = op.operation(input);
        Boolean operator = op.matches(inputOperator);

        assertEquals(true, operator);
        assertEquals(expected, result);
    }
    /**
     * If there is null in the array, it has to return 0.
     */
    @Test
    public void operationNull(){
        AbstractOperation op = new Multiply("*");
        String inputOperator = "*";

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
    public void operationDoubles(){
        AbstractOperation op = new Multiply("*");
        String inputOperator = "*";

        double[] input = {3.5d, 2.3d};
        double expected = 8.049999999999999d;

        double result = op.operation(input);
        Boolean operator = op.matches(inputOperator);

        assertEquals(true, operator);
        assertEquals(expected, result);
    }
    /**
     * If there is three numbers or more in the array, it has to return the total
     */
    @Test
    public void operationMultiples(){
        AbstractOperation op = new Multiply("*");
        String inputOperator = "*";

        double[] input = {3.0d, 2.0d, 4.0d};
        double expected = 24.0d;

        double result = op.operation(input);
        Boolean operator = op.matches(inputOperator);

        assertEquals(true, operator);
        assertEquals(expected, result);
    }
    /**
     * If there are negative numbers in the array, it has to return the positive total.
     */
    @Test
    public void operationNegative(){
        //set up
        AbstractOperation op = new Multiply("*");
        String inputOperator = "*";

        double [] input = {-5.0d, -10.0d};
        double expected = 50.0d;

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
        AbstractOperation op = new Multiply("*");
        String inputOperator = "*";

        double [] input = {-5.0d, 1.0d, 5.0d};
        double expected = -25.0d;

        // invoke
        double result = op.operation(input);
        Boolean operator = op.matches(inputOperator);

        // assert
        assertEquals(true, operator);
        assertEquals(expected, result);
    }
    /**
     * If there is a value of zero in the array, it has to return 0.
     */
    @Test
    public void operationMultipliedByZero(){
        AbstractOperation op = new Multiply("*");
        String inputOperator = "*";

        double [] input = {0.0d, 5.0d};
        double expected = 0.0d;

        double [] input1 = {120.5d, 0.0d};
        double expected1 = 0.0d;

        double result = op.operation(input);
        double result1 = op.operation(input1);
        Boolean operator = op.matches(inputOperator);

        assertEquals(true, operator);
        assertEquals(expected1, result1);
        assertEquals(expected, result);
    }
    /**
     * If the operators don't match, it has to return false.
     */
    @Test
    public void operationErrorOperator1(){
        AbstractOperation op = new Multiply("*");
        String inputOperator = "3";

        Boolean operator = op.matches(inputOperator);

        assertEquals(false, operator);
    }
    /**
     * If the operators don't match, it has to return false.
     */
    @Test
    public void operationErrorOperator2(){
        AbstractOperation op = new Multiply("*");
        String inputOperator = null;

        Boolean operator = op.matches(inputOperator);

        assertEquals(false, operator);
    }
}