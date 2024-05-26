

public class Edge<Vertex> {
    private Vertex source;
    private Vertex dest;
    private double weight;

    public Edge(Vertex source, Vertex dest, Double weight) {
        this.source = source;
        this.dest = dest;
        this.weight =  weight;
    }
    //getter and setters

    public void setDest(Vertex dest) {
        this.dest = dest;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setSource(Vertex source) {
        this.source = source;
    }

    public double getWeight() {
        return weight;
    }

    public Vertex getDest() {
        return dest;
    }

    public Vertex getSource() {
        return source;
    }












}
