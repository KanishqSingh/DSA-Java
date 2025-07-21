import java.util.Scanner;

public class NoOfIsland {

    public static void drawTreeForComponents(int[][] islands, int i, int j, boolean[][] visited) {
        if (i < 0 || j < 0 || i >= islands.length || j >= islands[0].length || islands[i][j] == 1
                || visited[i][j] == true) {
            return;
        }
        visited[i][j] = true;
        drawTreeForComponents(islands,i-1,j,visited);
        drawTreeForComponents(islands,i,j+1,visited);
        drawTreeForComponents(islands,i,j-1,visited);
        drawTreeForComponents(islands,i+1,j,visited);


    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rows");
        int n = sc.nextInt();
        System.out.println("Enter no of cols");
        int m = sc.nextInt();

        int[][] islands = new int[n][m];
        System.out.println("Enter the island");
        for (int i = 0; i < islands.length; i++) {
            for (int j = 0; j < islands[0].length; j++) {
                islands[i][j] = sc.nextInt();
            }

        }

        boolean[][] visited = new boolean[n][m];
        int count = 0;
        for (int i = 0; i < visited.length; i++) {
            for (int j = 0; j < visited[0].length; j++) {
                if (islands[i][j] == 0 && visited[i][j] == false) {
                    drawTreeForComponents(islands, i, j, visited);
                    count++;

                }

            }

        }
        System.out.println("count = "+count);

    }

}
