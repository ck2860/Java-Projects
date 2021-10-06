package Homework18.weight;

import java.util.*;

public class WeightAdjacencyGraph<T> implements WeightedGraph<T> {
    /**
     * a private field as a map vertices.
     */
    private Map<T, Vertex<T>> vertices;

    /**
     * implement a parameterless constructor to create the empty map.
     */
    public WeightAdjacencyGraph() {
        vertices = new HashMap<>();
    }

    /**
     * implement the add method.
     * to add a value into the map
     * @param value add a value
     */
    @Override
    public void add(T value) {
        Vertex<T> vertex = new Vertex<>(value);
        vertices.put(value, vertex);
    }

    /**
     * Implement the connect method to create undirected connection.
     * The connect method is to make both vertexes are connected.
     * @param value first value
     * @param neighbor its neighbor
     * @param weight the edge 's weight
     */
    @Override
    public void connect(T value, T neighbor, int weight) {
        Vertex<T> vertex = vertices.get(value);
        Vertex<T> neighborV = vertices.get(neighbor);
        vertex.addNeighbor(neighborV, weight);
        neighborV.addNeighbor(vertex, weight); //undirected
    }

    /**
     * implement dijkstraShortestPath...
     * The dijkstra shortest path would be returned within the lowest cost.
     * so all of the vertices would be added into the map.
     * So it would visit those vertices and set each of them its weight.
     * Then the priority queue would be used in order to reorder them if the weight is lower, etc..
     * the weight would be allocated and printed in the end.
     * Then the path is created.
     *
     * @param start starting of the path
     * @param end   ending of the path
     * @return the list of path.
     */

    @Override
    public List<T> dijkstrasShortestPath(T start, T end) {
        Vertex<T> startV = vertices.get(start);
        Vertex<T> endV = vertices.get(end);
        Map<T, Tuple> pathTuple = new HashMap<T, Tuple>();
        // add all vertexes to the map; key is vertex name (Ex: 'A'), value is an integer.
        for (T vertex : vertices.keySet()) {
            Tuple myTuple = new Tuple(null, -1);
            pathTuple.put(vertex, myTuple);
        }
        pathTuple.put(start, new Tuple(null, 0));
        LinkedList<T> priorityQueue = new LinkedList<>();
        LinkedList<Vertex<T>> visited = new LinkedList<>();  // priority queue
        Vertex<T> currentV = startV;
        int totalWeight = 0;
        while (visited.size() < vertices.size()) {
            totalWeight = pathTuple.get(currentV.getValue()).getWeight();
            visited.add(currentV);

            for (Edge<T> edge : currentV.getNeighbors()) {


                // if we've already visited the vertex, skip it
                if(visited.contains(edge.getTo())){
                    continue;
                }
                // if we haven't reached the neighbor vertex, set its weight value
                if(!priorityQueue.contains(edge.getTo().getValue())){
                    pathTuple.put(edge.getTo().getValue(), new Tuple(currentV, totalWeight + edge.getWeight()));
                    priorityQueue.add(edge.getTo().getValue());
                }
                // if neighbor vertex exists in priority queue, it means we've been here before. We will now compare it's old weight and its new weight
                else{
                    if(pathTuple.get(edge.getTo().getValue()).getWeight() > totalWeight + edge.getWeight()){
                        pathTuple.put(edge.getTo().getValue(), new Tuple(currentV, totalWeight + edge.getWeight()));
                    }
                }
            }

            // need to assign next current vertex here
            ListIterator<T> iterator = priorityQueue.listIterator();
            T lightestVertex = null;
            if(iterator.hasNext()) {
                lightestVertex = iterator.next();
                while(iterator.hasNext()){
                    T currVertex = iterator.next();
                    if(pathTuple.get(currVertex).getWeight() < pathTuple.get(lightestVertex).getWeight()){
                        lightestVertex = currVertex;
                    }
                }
            }
            currentV = vertices.get(lightestVertex);
            priorityQueue.remove(lightestVertex);
        }
        int finalWeight = 0;
        // making a path
        T currVertex = end;
        List<T> path = new LinkedList<>();
        path.add(currVertex);
        finalWeight = pathTuple.get(currVertex).getWeight();
        while(currVertex != null){
            Tuple currTuple = pathTuple.get(currVertex);
            Vertex currentVertexObject = (Vertex)currTuple.value;
            if(currentVertexObject == null){
                break;
            }
            currVertex = (T)currentVertexObject.getValue();
            path.add(currVertex);
        }
        System.out.println((finalWeight*10) + " Dollars");
        Collections.reverse(path);
        return path;
    }
}

