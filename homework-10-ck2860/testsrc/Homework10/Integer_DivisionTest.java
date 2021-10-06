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
class Integer_DivisionTest {
    /**
     * If there is only one operand in the array, it has to return the operand.
     */
    @Test
    public void operationSingle(){
        AbstractOperation op = new Integer_Division("//");
        String inputOperator = "//";

        double [] input = {8.0d};
        double expected = 8.0;

        Boolean operator = op.matches(inputOperator);
        Double result = op.operation(input);

        assertEquals(true, operator);
        assertEquals(expected, result);

    }
    /**
     * If there is none in the array, it has to return 0.
     */
    @Test
    public void operationZeroes(){
        AbstractOperation op = new Integer_Division("//");
        String inputOperator = "//";

//        double [] input = {0.0d};
        double [] input = {};
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
    public void operationNull(){
        AbstractOperation op = new Integer_Division("//");
        String inputOperator = "//";

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
        AbstractOperation op = new Integer_Division("//");
        String inputOperator = "//";

        double [] input = {5.3d, 5.0d};
        double expected = 1.0d;

        double result = op.operation(input);
//        int resultA = Integer.valueOf((int) result);

        Boolean operator = op.matches(inputOperator);

        assertEquals(true, operator);
        assertEquals(expected, result);
    }
    /**
     * If there is three numbers or more in the array, it has to return the total
     */
    @Test
    public void operationMultiples(){
        AbstractOperation op = new Integer_Division("//");
        String inputOperator = "//";

        double [] input = {5.5d, 1.0d, 3.5d};
        double expected = 1.0d;

        double result = op.operation(input);

        Boolean operator = op.matches(inputOperator);

        assertEquals(true, operator);
        assertEquals(expected, result);
    }
    /**
     * If there is operand that divided by zero in the array, it has to return the string: "cannot be divided by 0";
     */
    @Test
    public void operationDividedByZero(){
        AbstractOperation op = new Integer_Division ("//");
        String inputOperator = "//";

        double [] input = {8.0d, 0.0d};
        String expected = "Cannot be divided by 0";

        double result = op.operation(input);
        if (result == -0){
            Object result1 = "Cannot be divided by 0";
            assertEquals(expected, result1);
        }else{
            assertEquals(expected, result);
        }
        Boolean operator = op.matches(inputOperator);
        assertEquals(true, operator);
    }
    /**
     * If there are negative numbers in the array, it has to return the positive total.
     */
    @Test
    public void operationNegative(){
        //set up
        AbstractOperation op = new Integer_Division("//");
        String inputOperator = "//";

        double [] input = {-5.0d, -10.0d};
        double expected = 0.0d;

        double [] input1 = {-4.0d, -2.0d};
        double expected1 = 2.0d;

        // invoke
        double result = op.operation(input);
        double result1 = op.operation(input1);
        Boolean operator = op.matches(inputOperator);

        // assert
        assertEquals(true, operator);
        assertEquals(expected, result);
        assertEquals(expected1, result1);
    }
    /**
     * If there is mixed signed numbers in the array, it has to return the total.
     */
    @Test
    public void operationPosAndNeg() {
        //set up
        AbstractOperation op = new Integer_Division("//");
        String inputOperator = "//";

        double [] input = {-5.0d, 1.7d, 2.0d};
        double expected = -1.0d;

        // invoke
        double result = op.operation(input);
        Boolean operator = op.matches(inputOperator);

        // assert
        assertEquals(true, operator);
        assertEquals(expected, result);
    }
    /**
     * If there is an operand that divided by zero in the array, it has to return the string: "cannot be divided by 0";
     */
    @Test
    public void operationMultiplesAndZeroes(){
        AbstractOperation op = new Integer_Division ("//");
        String inputOperator = "//";

        double [] input = {8.0d, 0.0d, 0.0d};
        String expected = "Cannot be divided by 0";

        double result = op.operation(input);
        if (result == -0){
            Object result1 = "Cannot be divided by 0";
            assertEquals(expected, result1);
        }else{
            assertEquals(expected, result);
        }
        Boolean operator = op.matches(inputOperator);
        assertEquals(true, operator);
    }
    /**
     * If the operators don't match, it has to return false.
     */
    @Test
    public void operationErrorOperator1(){
        AbstractOperation op = new Integer_Division("//");
        String inputOperator = "!";

        Boolean operator = op.matches(inputOperator);

        assertEquals(false, operator);
    }
    /**
     * If the operators don't match, it has to return false.
     */
    @Test
    public void operationErrorOperator2(){
        AbstractOperation op = new Integer_Division("//");
        String inputOperator = null;

        Boolean operator = op.matches(inputOperator);

        assertEquals(false, operator);
    }
}