package Homework18.weight;

import java.util.HashSet;
import java.util.Set;

public class Vertex<T> {
    /**
     * each vertex has a value of generic type
     * value and neighbors are the fields
     */
    private  T value;
    private Set<Edge<T>> neighbors;
    private Edge<T> edges;

    /**
     * Each vertex would have a set of neighbors.
     * @param value value
     */
    public Vertex(T value){
        this.value = value;
        neighbors = new HashSet<>();
    }

    /**
     * adding neighbors
     * @param neighbor neighbor
     */
    public void addNeighbor(Vertex<T> neighbor, int weight){
//        Edge<T> edge = new Edge<T>(this, neighbor, weight);
        this.edges = new Edge<T>(this, neighbor, weight);
        neighbors.add(edges);
    }
    /**
     * getting a value
     * @return value
     */

    public T getValue(){
        return value;
    }

    /**
     * setter for neighbors
     * @return
     */

    public Set<Edge<T>> getNeighbors(){
        Set<Edge<T>> copy = new HashSet<>();
        for (Edge<T> neighbors: neighbors){
            copy.add(neighbors);
        }
        return copy;
    }

    /**
     * the getter for edge
     * @return edge
     */
    public Edge<T> getEdges() {
        return edges;
    }
}
