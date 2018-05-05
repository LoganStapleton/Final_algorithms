//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package Final;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;

public class WeightedGraph {
    private Map<String, LinkedList<Edge>> graphMap;

    public WeightedGraph(Map<String, LinkedList<Edge>> graphMap) {
        this.graphMap = graphMap;
    }

    public Map<String, LinkedList<Edge>> getGraphMap() {
        return this.graphMap;
    }

    public void addEdge(Node w1, Node w2) {
        LinkedList<Edge> edgeList = (LinkedList)this.graphMap.get(w1.getWord());
        boolean found = false;
        Iterator var6 = edgeList.iterator();

        while(true) {
            Edge edge;
            do {
                if (!var6.hasNext()) {
                    if (!found) {
                        edge = new Edge(w1, w2);
                        edgeList.add(edge);
                    }

                    return;
                }

                edge = (Edge)var6.next();
            } while(!edge.getvA().getWord().equals(w2.getWord()) && !edge.getvB().getWord().equals(w2.getWord()));

            edge.setWeight(edge.getWeight() + 1.0D);
            found = true;
        }
    }
}