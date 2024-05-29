import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BFS<V> {
    private WeightedGraph<V> weightedGraph;
    public BFS(WeightedGraph<V>graph){

        this.weightedGraph = graph;
    }



    public List<V> bfs(Vertex<V> rootVertex){
        List<V> visitedList = new ArrayList<>();
        Queue<Vertex<V>> queue = new LinkedList<>();
        queue.add(rootVertex);
        visitedList.add(rootVertex.getData());

        while (!queue.isEmpty()){
            Vertex<V> vertex = queue.poll();
            for (Edge<Vertex<V>> edge :  weightedGraph.getEdges(vertex)){
                Vertex<V> neighbour = edge.getDest();
                if(!visitedList.contains(neighbour.getData())){
                    visitedList.add(neighbour.getData());
                    queue.add(neighbour);
                }
            }
        }
        return visitedList;

    }
}
