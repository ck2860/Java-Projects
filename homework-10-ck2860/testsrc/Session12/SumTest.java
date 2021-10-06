package Session12;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SumTest  {
    @Test
    public void operationSingle() {
        //setup
        /**
         * Create any variables needed for the test, including an instance of the class under test.
         */
        Operation op = new Sum("+");
//        double [] input = {1.0d};
//        double expected = 1.0d;
//        double [] input = {};
//        double expected = 0.0d;
        double [] input = {5.1d, 4.4d, 3.0d};
        double expected = 12.5d;
        // invoke
        /**
         * Invoke the method that is being tested using values created during set up
         */
        double result = op.operation(input);
        Boolean plus = op.matches("+");

        // assert
        /**
         * Validate that the method worked as intended and returned the correct result
         */
        assertEquals(true, plus);
        assertEquals(expected, result);
    }
    @Test
    public void operationNull(){
        //set up
        Operation op = new Sum("+");
        double [] input = null;
        double expected = 0.0d;

        // invoke
        double result = op. operation(input);
        Boolean plus = op.matches("+");

        //assert
        assertEquals(true, plus);
        assertEquals(expected, result);
    }
}