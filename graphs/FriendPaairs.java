import java.util.ArrayList;
import java.lang.reflect.Array;
import java.util.*;

public class FriendPaairs {
    public static class Edge {
        int i;
        int nbr;

        Edge(int i, int nbr) {
            this.i = i;
            this.nbr = nbr;
        }

    }

    public static void drawTreeForComponents(ArrayList<Edge>[] graph, int src, ArrayList<Integer> comp,
            boolean[] visited) {
        visited[src] = true;
        comp.add(src);

        for (Edge edge : graph[src]) {
            if (visited[edge.nbr] == false) {
                drawTreeForComponents(graph, edge.nbr, comp, visited);
            }
        }

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of vertices");
        int vertices = 7;
        ArrayList<Edge>[] graph = new ArrayList[vertices];

        for (int i = 0; i < vertices; i++) {
            graph[i] = new ArrayList<>();

        }
        graph[0].add(new Edge(0, 1));
        graph[1].add(new Edge(1, 0));

        graph[2].add(new Edge(2, 3));
        graph[3].add(new Edge(3, 2));

        graph[4].add(new Edge(4, 5));
        graph[5].add(new Edge(5, 6));
        graph[6].add(new Edge(6, 4));

        boolean[] visited = new boolean[vertices];
        ArrayList<ArrayList<Integer>> comps = new ArrayList<>();
        for (int i = 0; i < vertices; i++) {
            if (visited[i] == false) {
                ArrayList<Integer> comp = new ArrayList<>();
                drawTreeForComponents(graph, i, comp, visited);
                comps.add(comp);

            }

        }

        int pair = 0;
        for (int i = 0; i < comps.size(); i++) {
            for (int j = i + 1; j < comps.size(); j++) {
                int count = comps.get(i).size() * comps.get(j).size();
                pair += count;
            }

        }

        System.out.println("Pairs= " + pair);

    }

}
