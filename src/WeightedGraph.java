import java.util.*;

public class WeightedGraph<V> implements Graph<V> {
    Map<Vertex<V>, List<Edge<Vertex<V>>>> map = new HashMap<>();



    public void addvertex(Vertex<V> vertex) {
        map.putIfAbsent(vertex,new ArrayList<>());
    }

    public void addEdge(Vertex<V> source, Vertex<V> dest, double weight,boolean directed) {
        if(!map.containsKey(source)) addvertex(source);
        if(!map.containsKey(dest)) addvertex(dest);
        map.get(source).add(new DirectedEdge<>(source,dest,weight));
        if(!directed) map.get(dest).add(new UndirectedEdge<>(dest,source,weight));
    }



    public List<Edge<Vertex<V>>> getEdges(Vertex<V> vertex){
        return map.getOrDefault(vertex,Collections.emptyList());
    }


}
