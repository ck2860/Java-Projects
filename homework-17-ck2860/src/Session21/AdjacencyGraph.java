package Session21;

import java.util.*;

public class AdjacencyGraph<T> implements Graph<T> {
    private Map<T, Vertex<T>> vertices;

    AdjacencyGraph(){
        vertices = new HashMap<>();
    }

    @Override
    public void add(T value) {
        Vertex<T> vertex = new Vertex<>(value);
        vertices.put(value, vertex);
    }

    @Override
    public void connectDirected(T value, T neighbor) {
        Vertex<T> v = vertices.get(value);
        Vertex<T> n  = vertices.get(neighbor);
        v.addNeighbor(n);
    }

    @Override
    public void connectDirected(T value, T... neighbors) {
        for (T neighbor: neighbors){
            connectDirected(value, neighbor);
        }
     }

    @Override
    public void connectUndirected(T value, T neighbor) {
        connectDirected(value, neighbor);
        connectDirected(neighbor, value);
    }

    @Override
    public void connectUndirected(T value, T... neighbors) {
        for (T neighbor: neighbors){
            connectUndirected(value, neighbor);
        }
    }

    @Override
    public boolean breadthFirstSearch(T start, T end) {
        Vertex<T> startV = vertices.get(start);
        Vertex<T> endV = vertices.get(end);

        Queue<Vertex<T>> queue = new LinkedList<Vertex<T>>();
        Set<Vertex<T>> visited = new HashSet<>();

        queue.add(startV);
        visited.add(startV);

        while(queue.size() > 0){
            Vertex<T> next = queue.poll();
            if(next == endV){
                return true;
            }

            for (Vertex<T> neighbor: next.getNeighbors()){
                if(!visited.contains(neighbor)){
                    visited.add(neighbor);
                    queue.add(neighbor);
                }
            }
        }

        return false;
    }

    @Override
    public List<T> breadthFirstPath(T start, T end) {
        Vertex<T> startV = vertices.get(start);
        Vertex<T> endV = vertices.get(end);


        Stack<Vertex<T>> stack = new Stack<Vertex<T>>();
        Set<Vertex<T>> visited = new HashSet<>();

        stack.add(startV);
        visited.add(startV);

        while (stack.size()> 0){
            Vertex<T> next = stack.pop();
            if(next == endV){
                return (List<T>) stack;
            }
        }
        return null;
    }

    @Override
    public int size() {
        return vertices.size();
    }


    public static void main(String[] args) {
        AdjacencyGraph graphTest = new AdjacencyGraph();
        graphTest.add("A");
        graphTest.add("B");
        graphTest.add("C");
        graphTest.add("D");
        graphTest.add("E");
        graphTest.add("F");
        graphTest.add("G");


        graphTest.connectUndirected("A", "B");
        graphTest.connectDirected("B", "C");
        graphTest.connectUndirected("C", "D");
        graphTest.connectDirected("D", "A");


        graphTest.connectUndirected("E", "F", "G");
        graphTest.connectDirected("G", "F");

        System.out.println("Path from A to D :" + graphTest.breadthFirstSearch("A","D"));
        System.out.println("Path from A to E :" + graphTest.breadthFirstSearch("A","E"));


    }
}
