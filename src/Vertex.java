import java.util.Map;

public class Vertex<V> {
    private  V data;
    private Map<Vertex<V>, Double > adjVertices;
    public Vertex(V data){
        setData(data);
    }


    public void addAdjacentVertex(Vertex<V> dest , double weight){
        adjVertices.put(dest,weight);
    }
    public void setData(V data) {
        this.data = data;
    }

    public V getData() {
        return data;
    }

    public Map<Vertex<V>, Double> getAdjVertices() {
        return adjVertices;
    }

}
