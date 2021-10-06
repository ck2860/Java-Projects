package Homework18;

import java.util.*;

public class AdjacencyGraph<T> implements Graph<T> {
    /**
     * a vertices as a field aka as in map structure.
     */
    private Map<T, Vertex<T>> vertices;

    /**
     * a constructor that sets a hashmap for vertices.
     */
    AdjacencyGraph() {
        vertices = new HashMap<>();
    }

    /**
     * adding the value and put in vertices.
     *
     * @param value values
     */

    @Override
    public void add(T value) {
        Vertex<T> vertex = new Vertex<>(value);
        vertices.put(value, vertex);
    }

    /**
     * Connecting to a neighbor
     *
     * @param value    value
     * @param neighbor neighbor
     */

    @Override
    public void connectDirected(T value, T neighbor) {
        Vertex<T> v = vertices.get(value);
        Vertex<T> n = vertices.get(neighbor);
        v.addNeighbor(n);
    }

    /**
     * connecting to more than one neighbor
     *
     * @param value     value
     * @param neighbors neighbors
     */

    @Override
    public void connectDirected(T value, T... neighbors) {
        for (T neighbor : neighbors) {
            connectDirected(value, neighbor);
        }
    }

    /**
     * connecting two values together (sharing the connection)
     *
     * @param value    value
     * @param neighbor neighbors
     */

    @Override
    public void connectUndirected(T value, T neighbor) {
        connectDirected(value, neighbor);
        connectDirected(neighbor, value);
    }

    /**
     * connecting two values together and other neighbors (sharing the connection)
     *
     * @param value     value
     * @param neighbors more than one neighbor
     */

    @Override
    public void connectUndirected(T value, T... neighbors) {
        for (T neighbor : neighbors) {
            connectUndirected(value, neighbor);
        }
    }

    /**
     * Creating a queue then add the start value, then dequeue as long its not empty.
     * Then if its matches the next value aka end then it would return true.
     * If not, then adds its neighbors to the queue..
     * then rediscover the path.. ala dequeue.
     * return true ot false.
     * if the queue is empty then it would return as false.
     *
     * @param start start
     * @param end   end
     * @return
     */
    @Override
    public boolean breadthFirstSearch(T start, T end) {
        Vertex<T> startV = vertices.get(start);
        Vertex<T> endV = vertices.get(end);

        Queue<Vertex<T>> queue = new LinkedList<Vertex<T>>();
        Set<Vertex<T>> visited = new HashSet<>();

        queue.add(startV);
        visited.add(startV);

        while (queue.size() > 0) {
            Vertex<T> next = queue.poll();
            if (next == null) {
                continue;
            }
            if (next == endV) {
                return true;
            }

            for (Vertex<T> neighbor : next.getNeighbors()) {
                if (!visited.contains(neighbor)) {
                    visited.add(neighbor);
                    queue.add(neighbor);
                }
            }
        }
        return false;
    }

    /**
     * Building a path with BFs..
     * this would show if a path exists..
     * So each vertex keeps track of its predecessor until it reaches to the final des.
     * path would be created as a list of values from start to end..
     *
     * @param start start
     * @param end   end
     * @return
     */

    @Override
    public List<T> breadthFirstPath(T start, T end) {
        Vertex<T> startV = vertices.get(start);
        Vertex<T> endV = vertices.get(end);

        Queue<Vertex<T>> vertexList = new LinkedList<>();
        ArrayList<Vertex<T>> visited = new ArrayList<>();

        LinkedList<Vertex<T>> pred = new LinkedList<>();
        int currIndex = 0;

        pred.add(null);

        vertexList.add(startV);
        visited.add(startV);

        LinkedList<T> path = new LinkedList<>();

        if (breadthFirstSearch(start, end) == false) {
            path = new LinkedList<>();
            return null;
        } else {
            while (vertexList.size() > 0) {
                Vertex<T> next = vertexList.poll();
                if (next == null) {
                    continue;
                }
                if (next == endV) {
                    path.add(endV.getValue());
                    break;
                }
                for (Vertex<T> neighbor : next.getNeighbors()) {
                    if (!visited.contains(neighbor)) {
                        pred.add(next);
                        visited.add(neighbor);
                        vertexList.add(neighbor);
                    }
                }
                currIndex++;
                //path.add(next.getValue());

            }
            while (currIndex != 0) {
                Vertex<T> parent = pred.get(currIndex);
                path.add(parent.getValue());
                currIndex = visited.indexOf(parent);
            }
        }
        Collections.reverse(path);
        return path;
    }

    /**
     * The depth first search method is to search the nearest neighbor to check if there is a path from start to end.
     * so it would reach to the end vertex.
     * It would return true if there is a path from start to end.
     * @param start vertex value
     * @param end vertex value
     * @return boolean value: true if the path exists, false if the path doesnt exist.
     */

    @Override
    public boolean depthFirstSearch(T start, T end) {
        Set<Vertex<T>> visited = new HashSet<>();
        Vertex<T> startV = vertices.get(start);
        visited.add(startV);

        visitDFS(startV, visited);

        Vertex<T> endV = vertices.get(end);

//        for(Vertex<T> vertex: visited){
//            System.out.println(vertex.getValue());
//        }

        return visited.contains(endV);
    }

    /**
     * This method is a helper method for depth first search method to find the path.
     * @param vertex vertex
     * @param visited visited set
     */
    public void visitDFS(Vertex<T> vertex, Set<Vertex<T>> visited) {
        for (Vertex<T> neighbor : vertex.getNeighbors()) {
            if (!visited.contains(neighbor)) {
                visited.add(neighbor);
                visitDFS(neighbor, visited);
            }
        }
    }

    /**
     * The depth first search path would be returned but would use the helper method to get the finalized path.
     * @param start vertex value
     * @param end vertex value
     */
    @Override
    public List<T> depthFirstPath(T start, T end) {
        Vertex<T> startV = vertices.get(start);
        Vertex<T> endV = vertices.get(end);

        Set<Vertex<T>> visited = new HashSet<>();
        visited.add(startV);

        return visitDFSPath(startV, endV, visited);
    }

    /**
     *
     * @param s start vertex
     * @param e end vertex
     * @param visited visiting set
     * @return list of the path if not then null.
     */

    private List<T> visitDFSPath(Vertex<T> s, Vertex<T> e, Set<Vertex<T>> visited) {
        if (s == e) {
            LinkedList<T> path = new LinkedList<>();
            path.add(s.getValue());
            return path;
        } else {
            for (Vertex<T> neighbor : s.getNeighbors()) {
                if (!visited.contains(neighbor)) {
                    visited.add(neighbor);
                    List<T> path = visitDFSPath(neighbor, e, visited);
                    if (path != null) {
                        path.add(0, s.getValue());
                        return path;
                    }
                }
            }
        }
        return null;
    }

    /**
     * A size of vertices
     *
     * @return the size of vertices.
     */

    @Override
    public int size() {
        return vertices.size();
    }

    /**
     * The depth first search stack is showed how the stack works and would return true if the path exists.
     * @param start value
     * @param end value
     * @return true if the path is found, false if the path doesn't exist.
     */
    public boolean depthFirstSearchStack(T start, T end) {
        Vertex<T> startV = vertices.get(start);
        Vertex<T> endV = vertices.get(end);

        Stack<Vertex<T>> stack = new Stack<Vertex<T>>();
        Set<Vertex<T>> visited = new HashSet<>();

        stack.push(startV);
        visited.add(startV);

        while (stack.size() > 0) {
            Vertex<T> next = stack.pop();
            if (next == null) {
                continue;
            }
            if (next == endV) {
                return true;
            }
            for (Vertex<T> neighbor : next.getNeighbors()) {
                if (!visited.contains(neighbor)) {
                    stack.push(neighbor);
                    visited.add(neighbor);
                }
            }
        }
        return false;
    }
        /**
         * the main method is for showing you to make a graph, then build a graph..
         * testing all of the methods and showing you that they are either connected or not.
         * @param args
         */


    public static void main(String[] args) {
        AdjacencyGraph graphTest = new AdjacencyGraph();
        graphTest.add("A");
        graphTest.add("B");
        graphTest.add("C");
        graphTest.add("D");
        graphTest.add("E");
        graphTest.add("F");
        graphTest.add("G");

        graphTest.add("1");
        graphTest.add("2");
        graphTest.add("3");
        graphTest.add("4");
        graphTest.add("5");
        graphTest.add("6");
        graphTest.add("7");
        graphTest.add("8");



        graphTest.connectUndirected("A", "B");
        graphTest.connectDirected("B", "C");
        graphTest.connectUndirected("C", "D");
        graphTest.connectDirected("D", "A");
        graphTest.connectUndirected("E", "F", "G");
        graphTest.connectDirected("G", "F", "A");


        graphTest.connectUndirected("1", "2", "3");
        graphTest.connectUndirected("2", "4", "5");
        graphTest.connectUndirected("3", "8", "5", "4");
        graphTest.connectUndirected("4", "6");
        graphTest.connectUndirected("5", "6");
        graphTest.connectUndirected("6", "7");


        System.out.println("Breadth First Search");
        System.out.println("Path from A to D :" + graphTest.breadthFirstSearch("A","D"));
        System.out.println("Path from A to D :" + graphTest.breadthFirstPath("A","D"));
//
        System.out.println("Path from A to E :" + graphTest.breadthFirstSearch("A","E"));
        System.out.println("Path from A to E :" + graphTest.breadthFirstPath("A","E"));

        System.out.println("Depth First Search");
        System.out.println("Path from A to D exists: "+ graphTest.depthFirstSearch("A", "D"));
        System.out.println("Path from A to D exists: "+ graphTest.depthFirstPath("A", "D"));

        System.out.println("Path from A to E exists: "+ graphTest.depthFirstSearch("A", "E"));
        System.out.println("Path from A to E exists: "+ graphTest.depthFirstPath("A", "E"));

        System.out.println("Depth First Search with Stack");
        System.out.println("Path from A to D exists: "+ graphTest.depthFirstSearchStack("A", "D"));
        System.out.println("Path from A to D exists: "+ graphTest.depthFirstPath("A", "D"));

        System.out.println("Path from A to E exists: "+ graphTest.depthFirstSearchStack("A", "E"));
        System.out.println("Path from A to E exists: "+ graphTest.depthFirstPath("A", "E"));

        System.out.println("Breadth First Search");
        System.out.println("Path from 1 to 7 :" + graphTest.breadthFirstSearch("1","7"));
        System.out.println("Path from 1 to 7 :" + graphTest.breadthFirstPath("1","7"));

        System.out.println("Depth First Search");
        System.out.println("Path from 1 to 7 exists: "+ graphTest.depthFirstSearch("1", "7"));
        System.out.println("Path from 1 to 7 exists: "+ graphTest.depthFirstPath("1", "7"));

        System.out.println("Depth First Search with Stack");
        System.out.println("Path from 1 to 7 exists: "+ graphTest.depthFirstSearchStack("1", "7"));
        System.out.println("Path from 1 to 7 exists: "+ graphTest.depthFirstPath("1", "7"));
//        System.out.println("Path from 1 to 7 exists: "+ graphTest.AF("1", "7"));



    }
}
