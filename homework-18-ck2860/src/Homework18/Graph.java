package Homework18;

import java.util.List;

public interface Graph <T> {
    /**
     * Adding a value to the graph
     * @param value values
     */
    // Add a value to the graph
    public void add(T value);

    /**
     * Connecting two values together as neighbors
     * @param value value
     * @param neighbors neighbors
     */
    // connect two values together directly
    public void connectDirected(T value, T neighbors);
    public void connectDirected(T value, T... neighbors);

    /**
     * connecting one value to other value undirectly..
     * @param value value
     * @param neighbors neighbor
     */
    // connect two values together Undirectly
    public void connectUndirected(T value, T neighbors);
    public void connectUndirected(T value, T... neighbors);

    /**
     * seeing if they are linked
     * @param start start
     * @param end end
     * @return
     */
    boolean breadthFirstSearch(T start, T end);

    /**
     *showing you the path of connections
     * @param start start
     * @param end end
     * @return
     */
    // showing you the path of connections
    List<T> breadthFirstPath(T start, T end);

    /**
     * size of the graph
     * @return
     */
    public int size();

    /**
     * the method to see if the path is found or not.
     * @param start value
     * @param end value
     * @return true if they are linked, false if they are not.
     */

    public boolean depthFirstSearch(T start, T end);

    /**
     * the list of the depth first path
     * @param start value
     * @param end value
     * @return a list of visited path.
     */
    public List<T> depthFirstPath(T start, T end);
}
