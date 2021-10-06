package Session22;

import java.util.HashSet;
import java.util.Set;

public class Vertex <T> {
    /**
     * each vertex has a value of generic type
     * value and neighbors are the fields
     */
    private  T value;
    private Set<Vertex<T>> neighbors;

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
    public void addNeighbor(Vertex<T> neighbor){
        neighbors.add(neighbor);
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

    public Set<Vertex<T>> getNeighbors(){
        return neighbors;
    }
}
