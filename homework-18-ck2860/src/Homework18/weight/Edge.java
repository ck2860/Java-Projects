package Homework18.weight;

public class Edge<T> {
    /**
     * the private fields for vertex to, vertex from, and its weight.
     */
    private Vertex<T> to;
    private Vertex<T> from;
    private int weight;

    /**
     * the edge would be formed: from, to and the weight
     * @param from vertex
     * @param to vertex
     * @param weight the edge
     */
    public Edge(Vertex<T> from, Vertex<T> to, int weight){
        this.from = from;
        this.to = to;
        this.weight = weight;
    }

    /**
     *  the getter for the weight
     * @return weight
     */

    public int getWeight() {
        return weight;
    }

    /**
     *  getter for the to vertex
     * @return to vertex
     */

    public Vertex<T> getTo() {
        return to;
    }

    /**
     * the getter for the from vertex
     * @return from vertex
     */

    public Vertex<T> getFrom() {
        return from;
    }


}
