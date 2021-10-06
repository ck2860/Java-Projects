package Homework18.weight;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EdgeTest {
    /**
     * testing the edge
     */
    @Test
    public void TestZero() {
        Vertex a = new Vertex("A");
        Vertex b = new Vertex("B");
        Edge test1 = new Edge(a, b, 10);
        Edge test2 = new Edge(a, b, 15);
        assertEquals(10, test1.getWeight());
        assertEquals(15, test2.getWeight());
    }

    /**
     * testing the edge
     */
    @Test
    public void TestOne() {
        Vertex a = new Vertex("A");
        Vertex b = new Vertex("B");
        Edge test1 = new Edge(a, b, 10);
        Edge test2 = new Edge(a, b, 15);
        assertEquals(a, test1.getFrom());
        assertEquals(b, test1.getTo());

        assertEquals(a, test2.getFrom());
        assertEquals(b, test2.getTo());

    }
}