package Homework18.weight;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TupleTest {
    /**
     * testing the tuple
     */
    @Test
    public void TestZero(){
        Tuple test1 = new Tuple("A", 0);
        Tuple test2 = new Tuple("B", 10);
        assertEquals(0 ,test1.getWeight());
        assertEquals(10 ,test2.getWeight());

    }
    /**
     * testing the tuple
     */
    @Test
    public void TestOne(){
        Tuple test1 = new Tuple("A", 0);
        Tuple test2 = new Tuple("B", 10);
        assertEquals("A" ,test1.getValue());
        assertEquals("B" ,test2.getValue());

    }

}