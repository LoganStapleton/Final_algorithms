package Final;

public class Vertex {
    private String key;
    private double weight;

    /**
     * This class creates the vertexes in the graph.
     * @param key
     * @param weight
     */

    public Vertex(String key, double weight) {
        this.key = key;
        this.weight = weight;
    }

    public Vertex(String key) {
        this.key = key;
        this.weight = 0D;
    }

    public String getKey() {
        return key;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double wt) {
        weight = wt;
    }

    @Override
    /**
     * This method overrides equals. It checks if two Vertexes are the same and returns a boolean.
     */
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Vertex other = (Vertex) obj;
        if (key == null) {
            if (other.key != null)
                return false;
        } else if (!key.equals(other.key)){
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return key;
    }
}