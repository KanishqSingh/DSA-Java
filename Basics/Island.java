
class Island {
    public int numIslands(char[][] grid) {
        if (grid == null || grid.length == 0) return 0;

        int numIslands = 0;
        int rows = grid.length, cols = grid[0].length;

        for (int r = 0; r < rows; r++) {
            for (int c = 0; c < cols; c++) {
                if (grid[r][c] == '1') { 
                    numIslands++;  // Found a new island
                    dfs(grid, r, c); 
                }
            }
        }
        return numIslands;
    }

    private void dfs(char[][] grid, int r, int c) {
        int rows = grid.length, cols = grid[0].length;

        if (r < 0 || c < 0 || r >= rows || c >= cols || grid[r][c] == '0') {
            return; // Stop if out of bounds or water
        }

        grid[r][c] = '0'; 

        
        dfs(grid, r + 1, c); 
        dfs(grid, r - 1, c); 
        dfs(grid, r, c + 1); 
        dfs(grid, r, c - 1);     }
}
