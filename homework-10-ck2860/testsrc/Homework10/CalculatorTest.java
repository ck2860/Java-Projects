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
class CalculatorTest {
    /**
     * The operationOne method is used to test the difference operation
     */
    @Test
    public void operationOne(){
        Calculator calculator = new Calculator();
        String inputOperator = "-";

        double [] input = {5.0d, 0.0d};
        double expected = 5.0d;

        Object test1 = calculator.calculating(inputOperator, input);
        assertEquals(expected, test1);
    }
    /**
     * The operationTwo method is used to test the sum operation
     */
    @Test
    public void operationTwo(){
        Calculator calculator = new Calculator();
        String inputOperator = "+";

        double [] input = {8.0d, 0.0d};
        double expected = 8.0d;

        Object test1 = calculator.calculating(inputOperator, input);
        assertEquals(expected, test1);
    }
    /**
     * The operationThree method is used to test the division operation
     */
    @Test
    public void operationThree(){
        Calculator calculator = new Calculator();
        String inputOperator = "/";

        double [] input = {8.0d, 4.0d};
        double expected = 2.0d;

        Object test1 = calculator.calculating(inputOperator, input);
        assertEquals(expected, test1);
    }
    /**
     * The operationFour method is used to test the integer division operation
     */
    @Test
    public void operationFour(){
        Calculator calculator = new Calculator();
        String inputOperator = "//";

        double [] input = {5.3d, 5.0d};
        double expected = 1.0d;

        Object test1 = calculator.calculating(inputOperator, input);
        assertEquals(expected, test1);
    }
    /**
     * The operationFive method is used to test the multiply operation
     */
    @Test
    public void operationFive(){
        Calculator calculator = new Calculator();
        String inputOperator = "*";

        double [] input = {5.0d, 5.0d};
        double expected = 25.0d;

        Object test1 = calculator.calculating(inputOperator, input);
        assertEquals(expected, test1);
    }
    /**
     * The operationSix method is used to test the modulo operation
     */
    @Test
    public void operationSix(){
        Calculator calculator = new Calculator();
        String inputOperator = "%";

        double [] input = {8.0d, 2.0d};
        double expected = 0.0d;

        Object test1 = calculator.calculating(inputOperator, input);
        assertEquals(expected, test1);
    }
    /**
     * The operationSeven method is used to test the exponent operation
     */
    @Test
    public void operationSeven(){
        Calculator calculator = new Calculator();
        String inputOperator = "^";

        double [] input = {8.0d, 2.0d};
        double expected = 64.0d;

        Object test1 = calculator.calculating(inputOperator, input);
        assertEquals(expected, test1);
    }
    /**
     * The operationEight method is used to test the exponent operation
     */
    @Test
    public void operationEight(){
        Calculator calculator = new Calculator();
        String inputOperator = "**";

        double [] input = {10.0d, 2.0d};
        double expected = 100.0d;

        Object test1 = calculator.calculating(inputOperator, input);
        assertEquals(expected, test1);
    }
    /**
     * The operationNine method is used to test if the operator is not in the array so it should print "unknown operator: $:"
     */
    @Test
    public void operationNine(){
        Calculator calculator = new Calculator();
        String inputOperator = "5";

        double [] input = {10.0d, 2.0d};
        String expected = "Unknown operator: $:";

        Object test1 = calculator.calculating(inputOperator, input);
        assertEquals(expected, test1);
    }

}