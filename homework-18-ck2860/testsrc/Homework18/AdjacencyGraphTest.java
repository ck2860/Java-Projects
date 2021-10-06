package Homework18;

import org.junit.jupiter.api.Test;

import java.util.LinkedList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class AdjacencyGraphTest {
    /**
     * testing connectDirected method
     * breadth first search
     * breadth first path
     * testing size
     *
     */
    @Test
    public void TestZero(){
        AdjacencyGraph graphTest = new AdjacencyGraph();
        graphTest.add("A");
        graphTest.add("B");
        graphTest.add("C");

        graphTest.connectDirected("A", "B");
        graphTest.connectDirected("B", "C");
        graphTest.connectDirected("C", "D");


        boolean input = graphTest.breadthFirstSearch("A","C");
        boolean input2 = graphTest.breadthFirstSearch("C","A");
        List expectedOne= graphTest.breadthFirstPath("A","C");
        assertEquals(true,input);
        assertEquals(false,input2);

        assertEquals("A",expectedOne.get(0));
        assertEquals("B",expectedOne.get(1));
        assertEquals("C",expectedOne.get(2));

        assertEquals(3,graphTest.size());
    }
    /**
     * testing connectUnDirected method
     * breadth first search
     * breadth first path
     * testing size
     *
     */
    @Test
    public void TestOne(){
        AdjacencyGraph graphTest = new AdjacencyGraph();
        graphTest.add("A");
        graphTest.add("B");
        graphTest.add("C");

        graphTest.connectDirected("A", "B");
        graphTest.connectUndirected("B", "C");
        graphTest.connectUndirected("C", "A");


        boolean input = graphTest.breadthFirstSearch("A","C");
        boolean input2 = graphTest.breadthFirstSearch("C","A");
        List expectedOne= graphTest.breadthFirstPath("A","C");
        assertEquals(true,input);
        assertEquals(true,input2);

        assertEquals("A",expectedOne.get(0));
        assertEquals("C",expectedOne.get(1));

        assertEquals(3,graphTest.size());
    }

    /**
     * testing connectdirected method with multiple neighbors at the same time.
     */

    @Test
    public void TestTwo(){
        AdjacencyGraph graphTest = new AdjacencyGraph();
        graphTest.add("A");
        graphTest.add("B");
        graphTest.add("C");

        graphTest.connectDirected("A", "B", "C");

        boolean input = graphTest.breadthFirstSearch("A","B");
        boolean input2 = graphTest.breadthFirstSearch("C","A");
        List expectedOne= graphTest.breadthFirstPath("A","C");
        assertEquals(true,input);
        assertEquals(false,input2);

        assertEquals("A",expectedOne.get(0));
        assertEquals("C",expectedOne.get(1));

        assertEquals(3,graphTest.size());
    }

    /**
     * testing connectUndirected method with multiple neighbors at the same time.
     */

    @Test
    public void TestThree(){
        AdjacencyGraph graphTest = new AdjacencyGraph();
        graphTest.add("A");
        graphTest.add("B");
        graphTest.add("C");

        graphTest.connectUndirected("A", "B", "C");

        boolean input = graphTest.breadthFirstSearch("A","B");
        boolean input2 = graphTest.breadthFirstSearch("C","A");
        List expectedOne= graphTest.breadthFirstPath("A","C");
        assertEquals(true,input);
        assertEquals(true,input2);

        assertEquals("A",expectedOne.get(0));
        assertEquals("C",expectedOne.get(1));

        assertEquals(3,graphTest.size());
    }
}