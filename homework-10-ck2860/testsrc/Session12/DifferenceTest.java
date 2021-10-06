package Session12;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DifferenceTest{

    @Test
    public void operationSingle() {
        //Set up
        Operation op = new Difference("-");
        double [] input = {};
        double expected = 0.0d;

        // invoke
        double result = op.operation(input);
        Boolean minus = op.matches("-");

        // assert
        assertEquals(true, minus);
        assertEquals(expected, result);
    }
    @Test
    public void operationNull(){
        //set up
        Operation op = new Difference("-");

        double [] input = null;
        double expected = 0.0d;

        // invoke
        double result = op. operation(input);
        Boolean minus = op.matches("+");

        // assert
        assertEquals(true, minus);
        assertEquals(expected, result);
    }

    @Test
    public void operationZero(){
        //set up
        Operation op = new Difference("-");
        double [] input = {};
        double expected = 0.0d;

        // invoke
        double result = op. operation(input);
        Boolean minus = op.matches("-");

        // assert
        assertEquals(true, minus);
        assertEquals(expected, result);
    }

    @Test
    public  void operationMultiple(){
        //setup
        Operation op = new Difference("-");
        double [] input = {10.0d, 3.0d, 2.0d};
        double expected = 5.0d;

        // invoke
        double result = op.operation(input);
        Boolean minus = op.matches("-");

        // assert
        assertEquals(true, minus);
        assertEquals(expected, result);
    }
}

