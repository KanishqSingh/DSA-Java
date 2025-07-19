import java.util.ArrayList;
import java.util.Scanner;

public class CreateSimpleGraph {
    static class Edge {

        int src;
        int nbr;
        int weight;

        Edge(int src, int nbr, int weight) {
            this.src = src;
            this.nbr = nbr;
            this.weight = weight;
        }
    }

    public static boolean hasPath(ArrayList<Edge>[] graph,int src,int
    des,boolean[] visited){

    if(src == des){
    return true;
    }
    visited[src] = true;
    for (Edge edge : graph[src]) {
    if(visited[edge.nbr] == false){
    boolean hasNbrPath = hasPath(graph, edge.nbr, des, visited);
    if(hasNbrPath == true){
    return true;
    }
    }

    }
    return false;
    }
    public static void printAllPath(ArrayList<Edge>[] graph, int src, int des, boolean[] printPathVisited, String psf) {
        if (src == des) {
            System.out.println(psf);
            return;
        }

        printPathVisited[src] = true;
        for (Edge edge : graph[src]) {
            if (printPathVisited[edge.nbr] == false) {
                printAllPath(graph, edge.nbr, des, printPathVisited, psf + "->" + edge.nbr);
            }

        }
        printPathVisited[src] = false;


    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // CreateSimpleGraph obj = new CreateSimpleGraph();

        System.out.println("Enter no Of Vertices");
        int vertices = 7;
        ArrayList<Edge>[] graph = new ArrayList[vertices];
        for (int i = 0; i < vertices; i++) {
            graph[i] = new ArrayList<Edge>();

        }

        graph[0].add(new Edge(0, 1, 10));
        graph[1].add(new Edge(1, 0, 10));

        graph[1].add(new Edge(1, 2, 10));
        graph[2].add(new Edge(2, 1, 10));

        graph[2].add(new Edge(2, 3, 10));
        graph[3].add(new Edge(3, 2, 10));

        graph[3].add(new Edge(3, 4, 10));
        graph[4].add(new Edge(4, 3, 10));

        graph[4].add(new Edge(4, 5, 10));
        graph[5].add(new Edge(5, 4, 10));

        graph[5].add(new Edge(5, 6, 10));
        graph[6].add(new Edge(6, 5, 10));

        graph[0].add(new Edge(0, 3, 20));
        graph[3].add(new Edge(3, 0, 20));

        graph[1].add(new Edge(1, 4, 30));
        graph[4].add(new Edge(4, 1, 30));

        boolean[] visited = new boolean[vertices];
        boolean[] printPathVisited = new boolean[vertices];

        int src = 0;
        int des = 6;

        String psf=" " + src;

        boolean res = hasPath(graph,src,des,visited);
        System.out.println("Graph has path :- "+ res);
        
        printAllPath(graph, src, des, printPathVisited,  psf);
        

    }
}
