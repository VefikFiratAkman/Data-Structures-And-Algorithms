import java.util.LinkedList;
import java.util.List;

public class DFSMainTest {
    public void test(){
        ListGraph graph = new ListGraph(7,true);

        Edge edge1 = new Edge(1,2);
        Edge edge2 = new Edge(1,4);
        Edge edge3 = new Edge(1,5);
        Edge edge4 = new Edge(4,2);
        Edge edge5 = new Edge(4,3);
        Edge edge6 = new Edge(4,5);
        Edge edge7 = new Edge(2,3);
        Edge edge8 = new Edge(5,3);


        graph.insert(edge1);
        graph.insert(edge2);
        graph.insert(edge3);
        graph.insert(edge4);
        graph.insert(edge5);
        graph.insert(edge6);
        graph.insert(edge7);
        graph.insert(edge8);



        System.out.println("DFS: ");
        graph.DFS(1);


    }
}
