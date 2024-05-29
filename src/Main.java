import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        WeightedGraph<City> graph = new WeightedGraph<>();
        City city1 = new City("Astana");
        City city2 = new City("Almaty");
        City city3 = new City("Shymkent");
        City city4 = new City("Aktau");
        Vertex<City> vertex1 = new Vertex<>(city1);
        Vertex<City> vertex2 = new Vertex<>(city2);
        Vertex<City> vertex3 = new Vertex<>(city3);
        Vertex<City> vertex4 = new Vertex<>(city4);

        graph.addvertex(vertex1);
        graph.addvertex(vertex2);
        graph.addvertex(vertex3);
        graph.addvertex(vertex4);

        graph.addEdge(vertex1, vertex2, 950, false);
        graph.addEdge(vertex2, vertex3, 700, false);
        graph.addEdge(vertex3, vertex1, 1200, false);
        graph.addEdge(vertex1,vertex4,1700,true);
        graph.addEdge(vertex4,vertex2,2070,false);
        graph.addEdge(vertex4,vertex3,1400,true);
        //BFS examples
        BFS<City> bfs = new BFS<>(graph);
        List<City> visitedCities = bfs.bfs(vertex1);

        System.out.println("Cities visited in BFS order(BFS):");
        for (City city : visitedCities) {
            System.out.println(city.getCityName());
        }
        System.out.println("--------------------");
        // examples end

        //Dijkstra exmples

        Dijkstra<City> dijkstra = new Dijkstra<>(graph);
        Map<Vertex<City>, Double> shortest = dijkstra.shortest(vertex1);

        System.out.println("Shortest distances  from Astana (Dijkstra)");
        for (Vertex<City> vertex : shortest.keySet()){
            System.out.print(vertex.getData().getCityName());
            System.out.print(" - " + shortest.get(vertex));
            System.out.println();
        }




    }
}
