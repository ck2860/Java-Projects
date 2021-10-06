package Homework18.weight;

import org.junit.jupiter.api.Test;

import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class VertexTest {
    /**
     * testing the getter for value
     */
    @Test
    public void TestZero(){
        Vertex test1 = new Vertex(1);
        Vertex test2 = new Vertex(2);

        assertEquals(1, test1.getValue());
        assertEquals(2, test2.getValue());
    }

    /**
     * testing neighbors size
     */
    @Test
    public void TestOne(){
        Vertex test1 = new Vertex(1);
        Vertex test2 = new Vertex(2);
        test1.addNeighbor(test2, 12);
        assertEquals(1, test1.getNeighbors().size());
    }

    /**
     * testing edge
     */
    @Test
    public void TestTwo(){
        Vertex test1 = new Vertex(1);
        Vertex test2 = new Vertex(2);
        test1.addNeighbor(test2, 12);
        assertEquals(12, test1.getEdges().getWeight());
    }
}