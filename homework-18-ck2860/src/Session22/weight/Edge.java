package Session22.weight;


public class Edge<T> {
    private Vertex<T> to;
    private Vertex<T> from;
    private int weight;

    public Edge(Vertex<T> from, Vertex<T> to, int weight){
        this.from = from;
        this.to = to;
        this.weight = weight;
    }

    public int getWeight() {
        return weight;
    }

    public Vertex<T> getTo() {
        return to;
    }

    public Vertex<T> getFrom() {
        return from;
    }
}
