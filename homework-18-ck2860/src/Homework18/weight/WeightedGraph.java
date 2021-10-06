package Homework18.weight;

import java.util.List;

public interface WeightedGraph<T> {
    /**
     * The method is to add value
     * @param value value
     */
    void add(T value);

    /**
     * the connect method
     * @param value value
     * @param neighbor value's neighbors
     * @param weight the edge between the value and neighbor
     */
    void connect(T value, T neighbor, int weight);

    /**
     * the shortest path would be returned with using dijkstra's method
     * @param start value
     * @param end value
     * @return the shortest path
     */
    List<T> dijkstrasShortestPath(T start, T end);

}
