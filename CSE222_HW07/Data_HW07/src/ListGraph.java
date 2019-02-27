import java.util.*;
import java.io.*;

/** A ListGraph is an extension of the AbstractGraph abstract class
*   that uses an array of lists to represent the edges.
*   @author Koffman and Wolfgang
*/

public class ListGraph
    extends AbstractGraph {

  // Data Field
  /** An array of Lists to contain the edges that
      originate with each vertex. */
  private List < Edge > [] edges;

  /** Construct a graph with the specified number of
      vertices and directionality.
      @param numV The number of vertices
      @param directed The directionality flag
   */
  public ListGraph(int numV, boolean directed) {
    super(numV, directed);
    edges = new List[numV];
    for (int i = 0; i < numV; i++) {
      edges[i] = new LinkedList < Edge > ();
    }
  }

  /** Determine whether an edge exists.
      @param source The source vertex
      @param dest The destination vertex
      @return true if there is an edge from source to dest
   */
  public boolean isEdge(int source, int dest) {

    return edges[source].contains(new Edge(source, dest));
  }

  /** Insert a new edge into the graph.
      @param edge The new edge
   */
  public void insert(Edge edge) {
    edges[edge.getSource()].add(edge);
    if (!isDirected()) {
      edges[edge.getDest()].add(new Edge(edge.getDest(),
                                         edge.getSource(),
                                         edge.getWeight()));
    }
  }

  public Iterator < Edge > edgeIterator(int source) {
    return edges[source].iterator();
  }

  /** Get the edge between two vertices. If an
      edge does not exist, an Edge with a weight
      of Double.POSITIVE_INFINITY is returned.
      @param source The source
      @param dest The destination
      @return the edge between these two vertices
   */
  public Edge getEdge(int source, int dest) {
    Edge target =
        new Edge(source, dest, Double.POSITIVE_INFINITY);
    for (Edge edge : edges[source]) {
      if (edge.equals(target))
        return edge; // Desired edge found, return it.
    }
    // Assert: All edges for source checked.
    return target; // Desired edge not found.
  }

  /** Load the edges of a graph from the data in an input file.
        The file should contain a series of lines, each line
        with two or three data values. The first is the source
        the second is the destination, and the optional third
        is the weight
        @param bufferedReader The BufferedReader that is connected
                              to the file that contains the data
        @throws IOException - If an I/O error occurs
   */
  public void loadEdgesFromFile(BufferedReader bufferedReader) throws
      IOException {
    /**** BEGIN EXERCISE ****/
    String line;
    while ( (line = bufferedReader.readLine()) != null
           && line.length() != 0) {
      Scanner sc = new Scanner(line);
      int source = sc.nextInt();
      int dest = sc.nextInt();
      double weight = 1.0;
      if (sc.hasNextDouble())
        weight = sc.nextDouble();
      insert(new Edge(source, dest, weight));
    }
    /**** END EXERCISE ****/
  }

    /**
     * ToString for print all graph
     * @return string for print
     */
    @Override
    public String toString() {
        String s;
        s = "";
        for(int i=0; i < getNumV(); ++i){
            s += edges[i];
            s += "\n";
        }


      return s;
    }

    /**
     * Graph üzerinde ki ehrhangi iki nokta arasinda ki
     * en kisa yolu bulur. Yolun uzunlugunu Edge'lerin weighti belirler.
     * @param v1 yola baslanacak nokta
     * @param v2 ulasilmak istenen nokta
     * @param edgeL yolu icinde barindiracak liste
     * @return yolu liste olarak dondurur.Bulamazsa null dondurur.
     */
    private List<Integer> shortest_path( int v1, int v2,List<Integer> edgeL){

       if (v1 <getNumV()) {
           if (edges[v1].get(0) == null) {
               return edgeL;
           }

           for (int i = 0; i < edges[v1].size(); ++i) {
               if ((edges[v1].get(i).getDest() == v2)) {
                   edgeL.add(v1);
                   edgeL.add(v2);
                   return edgeL;
               }
           }

           double min = edges[v1].get(0).getWeight();
           int point = 0;
           for (int i = 0; i < edges[v1].size(); ++i) {
               if (edges[v1].get(i).getWeight() < min) {
                   min = edges[v1].get(i).getWeight();
                   point = i;
               }

           }

           edgeL.add(v1);
           shortest_path(edges[v1].get(point).getDest(), v2, edgeL);

           return edgeL;
       }
       else{
           return null;
       }
    }

    /**
     * Wrapper metotdur.
     * Graph üzerinde ki ehrhangi iki nokta arasinda ki
     * en kisa yolu bulur. Yolun uzunlugunu Edge'lerin weighti belirler.
     * @param v1 yola baslanacak nokta
     * @param v2 ulasilmak istenen nokta
     * @return  yolu liste olarak dondurur. Bulamazsa null dondurur.
     */
    public List<Integer> shortest_path( int v1, int v2){
        List<Integer> edgeL = new LinkedList<>();
        shortest_path(v1,v2,edgeL);

        if(edgeL.get(edgeL.size()-1) == v2) {
            return edgeL;
        }
        else{
            return null;
        }
    }

    /**
     * iki noktanin birbirne bagli olup olmadigini kontrol eder.
     * @param v1 baglantinin basladigi nokta
     * @param v2 baglantinin sonlandigi nokta
     * @return baglanti varsa true yoksa false return eder.
     * @throws Exception v1 ve v2 noktasindan herhangi biri
     * graph yapisinda yoksa exception firlatir.
     */
    public boolean is_connected(int v1,int v2) throws Exception {
      if(v1 > getNumV() || v2 > getNumV() || v1<0 || v2 < 0){
          throw new Exception("v1 or v2 not in graph");
      }

      if(shortest_path(v1,v2) == null){
          return false;
      }
      else{
          return true;
      }

    }

    /**
     * graphin toStringini cagirarak graphi yazdiran public metot.
     */
    public void plot_graph(){
        System.out.println(this.toString());
    }

    /**
     * Graph yapisinin undirected olup olmadigini
     * graph yapisidna gezerek bulur.
     * @return undirected ise true directed ise false return eder.
     */
    public boolean is_undirected() {
        for (int i = 0; i < edges.length; ++i) {
            for (int k = 0; k < edges[i].size(); ++k) {
                for (int j = 0; j < edges.length; ++j) {
                    for (int a = 0; a < edges[j].size(); ++a) {
                        if (edges[i].get(k).getDest() == edges[j].get(a).getSource()) {
                            if (edges[j].get(a).getDest() == edges[i].get(k).getSource()) {
                                return true;
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    /**
     * Graph yapisinin acyclic olup olmadigini
     * graph yapisinda gezerek bulur.
     * @param v1 cycle icin baslangic noktasi
     * @param edgeL pathi icinde tutacak liste
     * @return acyclic ise true cyclic ise false return eder.
     */
    public boolean is_acyclic_graph(int v1,List<Integer> edgeL){
        if(v1 < getNumV()) {


            /*for (int i = 0; i < edgeL.size(); ++i) {
              if (edgeL.get(i) == v1) {
                  return false;
              }
             }*/

          edgeL.add(v1);
          if(edgeL.size()>getNumV())
                return false;

          for (int i = 0; i < edges[v1].size(); ++i) {
              is_acyclic_graph(edges[v1].get(i).getDest(), edgeL);
          }




              return true;

        }
        else{
          return false;
        }
    }

    /**
     * wrapper metotdur.
     * Graph yapisinin acyclic olup olmadigini
     * graph yapisinda gezerek bulur.
     * @return acyclic ise true cyclic ise false return eder.
     */
    public boolean is_acyclic_graph(){
      int k,v1=1;
      k = 0;
      /*while(k<getNumV()){
          if(edges[k] != null) {
              v1 = edges[k].get(k).getSource();
              break;
          }
          ++k;
      }*/

        List<Integer> edgeL = new LinkedList<>();
        boolean a = is_acyclic_graph(v1,edgeL);

       /* for(int i=0; i < edgeL.size();++i){
            System.out.println(edgeL.get(i));
        } */


        return a;
    }

    /**
     * Graph için BreadthFirstSearch Metotudur.
     * @param s baslangic noktasini belirler.
     */
    void BFS(int s)
    {

        // Mark all the vertices as not visited(By default
        // set as false)
        LinkedList<Integer> adj[]; //Adjacency Lists
        adj = new LinkedList[getNumV()];
        for (int i=0; i<getNumV(); ++i){
            adj[i] = new LinkedList();
        }

        for(int i=0; i<getNumV(); ++i) {
            for(int k=0; k<edges[i].size(); ++k) {
                adj[i].add(edges[i].get(k).getDest());
            }
        }


        boolean visited[] = new boolean[getNumV()];

        // Create a queue for BFS
        LinkedList<Integer> queue = new LinkedList<Integer>();

        // Mark the current node as visited and enqueue it
        visited[s]=true;
        queue.add(s);

        while (queue.size() != 0)
        {
            // Dequeue a vertex from queue and print it
            s = queue.poll();
            System.out.print(s+" ");

            // Get all adjacent vertices of the dequeued vertex s
            // If a adjacent has not been visited, then mark it
            // visited and enqueue it
            Iterator<Integer> i = adj[s].listIterator();
            while (i.hasNext())
            {
                int n = i.next();
                if (!visited[n])
                {
                    visited[n] = true;
                    queue.add(n);
                }
            }
        }
    }

    /**
     *
     * Graph için DepthFirstSearch Metotudur.
     * @param v baslangic noktasini belirler
     * @param visited ayni noktaya tekrar gelip gelmedigine
     * bakan boolean listesi
     */
    void DFSUtil(int v,boolean visited[])
    {


        LinkedList<Integer> adj[]; //Adjacency Lists
        adj = new LinkedList[getNumV()];
        for (int i=0; i<getNumV(); ++i){
            adj[i] = new LinkedList();
        }

        for(int i=0; i<getNumV(); ++i) {
            for(int k=0; k<edges[i].size(); ++k) {
                adj[i].add(edges[i].get(k).getDest());
            }
        }
        // Mark the current node as visited and print it
        visited[v] = true;
        System.out.print(v+" ");

        // Recur for all the vertices adjacent to this vertex
        Iterator<Integer> i = adj[v].listIterator();
        while (i.hasNext())
        {
            int n = i.next();
            if (!visited[n])
                DFSUtil(n, visited);
        }
    }

    /**
     *  wrapper metod.
     *  Graph için DepthFirstSearch Metotudur.
     * @param v baslangic noktasini belirler
     */
    // The function to do DFS traversal. It uses recursive DFSUtil()
    void DFS(int v)
    {
        // Mark all the vertices as not visited(set as
        // false by default in java)
        boolean visited[] = new boolean[getNumV()];

        // Call the recursive helper function to print DFS traversal
        DFSUtil(v, visited);
    }


}














