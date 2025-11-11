public class RatMazePath {

    static int n;

    public static void main(String[] args) {
        int[][] maze = {
            {1, 0, 0},
            {1, 1, 0},
            {0, 1, 1}
        };

        n = maze.length;
        boolean[][] visited = new boolean[n][n];

        System.out.println("Possible Paths:");
        solve(maze, 0, 0, "", visited);
    }

    static void solve(int[][] maze, int x, int y, String path, boolean[][] visited) {
        // If rat reaches destination, print path
        if (x == n-1 && y == n-1) {
            System.out.println(path);
            return;
        }

        // Mark current cell as visited
        visited[x][y] = true;

        // Move Down (D)
        if (isSafe(maze, x+1, y, visited)) {
            solve(maze, x+1, y, path + "D", visited);
        }

        // Move Right (R)
        if (isSafe(maze, x, y+1, visited)) {
            solve(maze, x, y+1, path + "R", visited);
        }

        // Move Up (U)
        if (isSafe(maze, x-1, y, visited)) {
            solve(maze, x-1, y, path + "U", visited);
        }

        // Move Left (L)
        if (isSafe(maze, x, y-1, visited)) {
            solve(maze, x, y-1, path + "L", visited);
        }

        // Backtrack (unmark cell)
        visited[x][y] = false;
    }

    static boolean isSafe(int[][] maze, int x, int y, boolean[][] visited) {
        return x >= 0 && x < n && y >= 0 && y < n && maze[x][y] == 1 && !visited[x][y];
    }
}
