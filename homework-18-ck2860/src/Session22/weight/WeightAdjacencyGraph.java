package Session22.weight;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class WeightAdjacencyGraph<T> implements WeightedGraph<T> {
    private Map<T, Vertex<T>> vertices;

    public WeightAdjacencyGraph(){
        vertices = new HashMap<>();
    }


    @Override
    public void add(T value) {
        Vertex<T> vertex = new Vertex<>(value);
        vertices.put(value, vertex);
    }

    @Override
    public void connect(T value, T neighbor, int weight) {
        Vertex<T> vertex = vertices.get(value);
        Vertex<T> neighborV = vertices.get(neighbor);
        vertex.addNeighbor(neighborV,weight);
    }

    @Override
    public List<T> dijkstrasShortestPath(T start, T end) {
        return null;
    }
}
