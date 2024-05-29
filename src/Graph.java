import java.util.List;

public interface Graph<V> {
    void addvertex(Vertex<V> vertex);
    void addEdge(Vertex<V> source, Vertex<V> dest, double weight,boolean directed);


}
