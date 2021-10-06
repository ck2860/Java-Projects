package Session22.weight;

import java.util.List;

public interface WeightedGraph<T> {
    void add(T value);
    void connect(T value, T neighbor, int weight);
    List<T> dijkstrasShortestPath(T start, T end);

}
