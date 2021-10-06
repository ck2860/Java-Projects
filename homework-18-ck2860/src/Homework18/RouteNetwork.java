package Homework18;

import Homework18.weight.Vertex;
import Homework18.weight.WeightAdjacencyGraph;

import java.util.List;
import java.util.Scanner;

public class RouteNetwork {
    /**
     * The route network is implemented by using the weight adjacency graph class.
     * then each airport code is added to the route network's map/vertices.
     * ROC, ORD, PDX< SFO, LAX, DCA, ATL, MCO are in the system.
     * Each connection between those airports are created with its weight.
     * The user would be asked to enter two airport codes to see the path and the cost.
     * If the user doesn't enter the airport codes in the list then the path wouldnt be returned.
     * @param args
     */
    public static void main(String[] args) {
        WeightAdjacencyGraph routeNetwork = new WeightAdjacencyGraph();
        routeNetwork.add("ROC");
        routeNetwork.add("ORD");
        routeNetwork.add("PDX");
        routeNetwork.add("SFO");
        routeNetwork.add("LAX");
        routeNetwork.add("DCA");
        routeNetwork.add("ATL");
        routeNetwork.add("MCO");

        routeNetwork.connect("ROC", "ORD", 15);
        routeNetwork.connect("ROC", "DCA", 10);
        routeNetwork.connect("ROC", "MCO", 24);
        routeNetwork.connect("ROC", "ATL", 22);

        routeNetwork.connect("ORD", "PDX", 26);
        routeNetwork.connect("ORD", "SFO", 37);
        routeNetwork.connect("ORD", "LAX", 35);

        routeNetwork.connect("PDX", "LAX", 21);

        routeNetwork.connect("SFO", "DCA", 25);
        routeNetwork.connect("SFO", "LAX", 10);

        routeNetwork.connect("LAX", "DCA", 36);
        routeNetwork.connect("LAX", "ATL", 31);
        routeNetwork.connect("LAX", "MCO", 31);

//        System.out.println(routeNetwork.dijkstrasShortestPath("DCA", "ORD"));
        System.out.print("Please enter two airport codes: ");
        Scanner scanner = new Scanner(System.in);
        if(scanner.hasNext()) {
            String firstAirportCode = scanner.next();
            String secondAirportCode = scanner.next();
            if(firstAirportCode.equals("DCA") || firstAirportCode.equals("ORD") ||
                    firstAirportCode.equals("MCO") || firstAirportCode.equals("ATL") || firstAirportCode.equals("PDX")
                    || firstAirportCode.equals("SFO") || firstAirportCode.equals("ROC") || firstAirportCode.equals("LAX") && secondAirportCode.equals("DCA") || secondAirportCode.equals("ORD") ||
                    secondAirportCode.equals("MCO") || secondAirportCode.equals("ATL") || secondAirportCode.equals("PDX")
                    || secondAirportCode.equals("SFO") || secondAirportCode.equals("ROC") || secondAirportCode.equals("LAX")){
                List path = routeNetwork.dijkstrasShortestPath(firstAirportCode, secondAirportCode);
                for ( Object v : path){
                    System.out.print(v +" ");
                }
            }else{
                System.out.println("The path from " + firstAirportCode + " to " + secondAirportCode + " is not in the system right now.");
            }
        }
    }
}
