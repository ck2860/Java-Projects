package Session21;

import java.util.HashSet;
import java.util.Set;

class Vertex <T> {
    private  T value;
    private Set<Vertex<T>> neighbors;

    Vertex(T value){
        this.value = value;
        neighbors = new HashSet<>();
    }

    void addNeighbor(Vertex<T> neighbor){
        neighbors.add(neighbor);
    }

    T getValue(){
        return value;
    }

    Set<Vertex<T>> getNeighbors(){
        return neighbors;
    }
}
