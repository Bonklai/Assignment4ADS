import java.util.*;

public class Dijkstra<V> {
    private WeightedGraph<V>  weightedGraph;

    public Dijkstra(WeightedGraph<V> weightedGraph) {
        this.weightedGraph = weightedGraph;
    }

    public Map<Vertex<V>,Double> shortest(Vertex<V> source){
        HashMap<Vertex<V>,Double> distances = new HashMap<>();
        HashSet<Vertex<V>> visited = new HashSet<>();
        HashMap<Vertex<V>,Vertex<V>> prev = new HashMap<>();

        for (Vertex<V> vertex : weightedGraph.map.keySet()){
            distances.put(vertex,Double.POSITIVE_INFINITY);
            }
        distances.put(source,0.0);
        while (visited.size() < weightedGraph.map.size()){
            Vertex<V> current = findUnvisitedVertex(distances,visited);
            visited.add(current);

            for (Edge<Vertex<V>> edge:weightedGraph.getEdges(current)){
                Vertex<V> neighbor = edge.getDest();
                if(!visited.contains(neighbor)){
                    double newDistance = distances.get(current) + edge.getWeight();
                    if(newDistance<distances.get(neighbor)){
                        distances.put(neighbor,newDistance);
                        prev.put(neighbor,current);
                    }
                }


            }
        }
        return distances;
    }

    private Vertex<V> findUnvisitedVertex(Map<Vertex<V>, Double> distances, Set<Vertex<V>> visited) {
        Vertex<V> minVertex = null;
        double minDistance = Double.POSITIVE_INFINITY;

        for (Vertex<V> vertex : distances.keySet()) {
            if (!visited.contains(vertex) && distances.get(vertex) < minDistance) {
                minVertex = vertex;
                minDistance = distances.get(vertex);
            }
        }

        return minVertex;
    }
}
