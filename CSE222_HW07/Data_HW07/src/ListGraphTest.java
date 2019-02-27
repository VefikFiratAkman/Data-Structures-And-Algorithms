import java.util.LinkedList;
import java.util.List;

import static org.junit.Assert.*;

public class ListGraphTest {

    @org.junit.Test
    public void shortest_path() {
        int v1 = 1, v2 = 2, getNumV = 3;

        LinkedList<Integer> edgeL = new LinkedList<>();
        LinkedList<Edge> edges = new LinkedList<>();
        Edge edge1 = new Edge(0,2,4);
        edges.add(edge1);
        if (v1 <getNumV) {


            for (int i = 0; i < edges.size(); ++i) {
                if ((edges.get(i) != null)){
                    edgeL.add(v1);
                    edgeL.add(v2);
                    return ;
                }
            }

            double min = edges.get(0).getWeight();
            int point = 0;
            for (int i = 0; i < edges.size(); ++i) {
                if (edges.get(i).getWeight() < min) {
                    min = edges.get(i).getWeight();
                    point = i;
                }

            }

            edgeL.add(v1);


            return ;
        }
        else{
            return ;
        }
    }

    @org.junit.Test
    public void is_connected() throws Exception {
        int v1 = 1, v2 = 2, getNumV = 3;
        if(v1 > getNumV || v2 > getNumV || v1<0 || v2 < 0){
            throw new Exception("v1 or v2 not in graph");
        }


            return;

    }

    @org.junit.Test
    public void plot_graph() {
        ListGraph graph = new ListGraph(0,true);
        System.out.println(graph);
    }

    @org.junit.Test
    public void is_undirected() {

        LinkedList<Edge> edges = new LinkedList<>();
        for (int i = 0; i < edges.size(); ++i) {
            for (int k = 0; k < edges.size(); ++k) {
                for (int j = 0; j < edges.size(); ++j) {
                    for (int a = 0; a < edges.size(); ++a) {
                        if (edges.get(k).getDest() == edges.get(a).getSource()) {
                            if (edges.get(a).getDest() == edges.get(k).getSource()) {
                                return;
                            }
                        }
                    }
                }
            }
        }
        return;

    }

    @org.junit.Test
    public void is_acyclic_graph() {
        is_acyclic_graph1();
    }

    @org.junit.Test
    public void is_acyclic_graph1() {
        int v1 = 1;
        int getNumV = 7;
        if(v1 < getNumV) {
            LinkedList<Integer> edgeL = new LinkedList<>();
            LinkedList<Edge> edges = new LinkedList<>();

            /*for (int i = 0; i < edgeL.size(); ++i) {
              if (edgeL.get(i) == v1) {
                  return false;
              }
             }*/

            edgeL.add(v1);
            if(edgeL.size()>getNumV)
                return;

            for (int i = 0; i < edges.size(); ++i) {
                is_acyclic_graph( );
            }




            return;

        }
        else{
            return;
        }
    }
}