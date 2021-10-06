package Homework18.weight;

import org.junit.jupiter.api.Test;

import java.util.LinkedList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class WeightAdjacencyGraphTest {
    /**
     *
     * testing connect method
     * dijkstra's method
     * testing add
     */
    @Test
    public void TestZero() {
        WeightAdjacencyGraph graphTest = new WeightAdjacencyGraph();
        graphTest.add("A");
        graphTest.add("B");
        graphTest.add("C");
        graphTest.add("D");

        graphTest.connect("A", "B", 10);
        graphTest.connect("B", "C", 20);
        graphTest.connect("B", "D", 5);
        graphTest.connect("C", "D", 35);


        List input = graphTest.dijkstrasShortestPath("A", "D");
        assertEquals("A", input.get(0));
        assertEquals("B", input.get(1));
        assertEquals("D", input.get(2));
    }
    /**
     * testing connect method
     * dijkstra's method
     * Checking it creates a path within the lowest cost
     * testing add
     */
    @Test
    public void TestOne() {
        WeightAdjacencyGraph graphTest = new WeightAdjacencyGraph();
        graphTest.add("A");
        graphTest.add("B");
        graphTest.add("C");
        graphTest.add("D");

        graphTest.connect("A", "B", 10);
        graphTest.connect("A", "C", 10);
        graphTest.connect("B", "C", 20);
        graphTest.connect("B", "D", 5);
        graphTest.connect("C", "D", 2);


        List input = graphTest.dijkstrasShortestPath("A", "D");
        assertEquals("A", input.get(0));
        assertEquals("C", input.get(1));
        assertEquals("D", input.get(2));
    }
}
