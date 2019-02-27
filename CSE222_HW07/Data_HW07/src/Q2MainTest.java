import java.util.LinkedList;
import java.util.List;
/**
 * Maintest class for Queistion2 in Homework7
 */
public class Q2MainTest {

    public void test(){

        ListGraph graph = new ListGraph(10,true);

        Edge edge1 = new Edge(0,2,4);
        Edge edge2 = new Edge(2,1,9);
        Edge edge3 = new Edge(2,4,5);

        Edge edge4 = new Edge(1,3,3);


        Edge edge5 = new Edge(4,5,2);
        Edge edge6 = new Edge(4,9,4);
        Edge edge7 = new Edge(4,6,4);

        Edge edge8 = new Edge(3,5,2);
        Edge edge9 = new Edge(3,9,5);

        Edge edge10 = new Edge(5,9,5);

        Edge edge11 = new Edge(6,7,7);
        Edge edge12 = new Edge(7,8,2);
        Edge edge13 = new Edge(8,9,2);

        Edge edge14 = new Edge(9,10,7);


        Edge edge15 = new Edge(10,11,9);
        Edge edge16 = new Edge(10,12,5);
        Edge edge17 = new Edge(11,13,3);
        Edge edge18 = new Edge(12,14,2);
        Edge edge19 = new Edge(13,14,2);
        Edge edge20 = new Edge(14,15,7);


        graph.insert(edge1);
        graph.insert(edge2);
        graph.insert(edge3);
        graph.insert(edge4);
        graph.insert(edge5);
        graph.insert(edge6);
        graph.insert(edge7);
        graph.insert(edge8);
        graph.insert(edge9);
        graph.insert(edge10);
        graph.insert(edge11);
        graph.insert(edge12);
        graph.insert(edge13);
        graph.insert(edge14);

        graph.plot_graph();
        System.out.println("Graph undirected: " + graph.is_undirected());
        System.out.println("Graph acyclic: "+ graph.is_acyclic_graph());
        List<Integer> path = new LinkedList<>();
        try {
            System.out.println("0 ve 1 bağlı mı? ");
            System.out.println("is_connected fonksiyonu:  " + graph.is_connected(0, 1));

            System.out.println("4 ve 10 bağlı mı? ");
            System.out.println("is_connected fonksiyonu:  " + graph.is_connected(4, 10));

            System.out.println("5 ve 8 bağlı mı? ");
            System.out.println("is_connected fonksiyonu:  " + graph.is_connected(5, 8));
            System.out.println("");
        }
        catch (Exception e){
            System.out.println("v1 or v2 not in graph");
        }

    }
}
