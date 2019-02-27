import java.util.LinkedList;
import java.util.List;

/**
 * Maintest class for Queistion1 in Homework7
 */
public class Q1MainTest {

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

        List<Integer> path = new LinkedList<>();

        path = graph.shortest_path(0,5);

        System.out.println("Graph undirected: " + graph.is_undirected());
        System.out.println("Graph acyclic: "+ graph.is_acyclic_graph());
        System.out.println();
        System.out.println("0'dan 5'e shortest_path: ");
        if(path != null) {

            for (int i = 0; i < path.size(); ++i) {
                System.out.print(path.get(i));
                if(i != path.size()-1){
                    System.out.print("->");
                }
            }
            System.out.println("\n");
        }
        else{
            System.out.println("path bulunamadı.");
        }

        System.out.println("2'den 6'a shortest_path: ");
        path = graph.shortest_path(2,6);
        if(path != null) {

            for (int i = 0; i < path.size(); ++i) {
                System.out.print(path.get(i));
                if(i != path.size()-1)
                    System.out.print("->");
            }
            System.out.println("\n");
        }
        else{
            System.out.println("path bulunamadı.");
        }

        System.out.println("6'dan 2'e shortest_path: ");
        path = graph.shortest_path(6,2);
        if(path != null) {

            for (int i = 0; i < path.size(); ++i) {
                System.out.print(path.get(i));
                if(i != path.size()-1) {
                    System.out.print("->");
                }
            }
            System.out.println("\n");
        }
        else
            System.out.println("path bulunamadı.");


    }

}
