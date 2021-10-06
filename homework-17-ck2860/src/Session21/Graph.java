package Session21;

import java.util.List;

public interface Graph <T> {

    // Add a value to the graph
    public void add(T value);

    // connect two values together
    public void connectDirected(T value, T neighbors);
    public void connectDirected(T value, T... neighbors);



    // connect two values together
    public void connectUndirected(T value, T neighbors);
    public void connectUndirected(T value, T... neighbors);


    boolean breadthFirstSearch(T start, T end);

    List<T> breadthFirstPath(T start, T end);

    //size
    public int size();

}
