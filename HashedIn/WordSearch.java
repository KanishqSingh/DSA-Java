public class WordSearch {
   

    public boolean dfs(char[][] board, int i, int j, String word, int idx, boolean[][] vis) {

        // Base case: whole word found
        if (idx == word.length()) {
            return true;
        }

        // Boundary & invalid checks
        if (i < 0 || i >= board.length ||
            j < 0 || j >= board[0].length ||
            vis[i][j] ||
            board[i][j] != word.charAt(idx)) {
            return false;
        }

        // Mark visited
        vis[i][j] = true;

        // Explore all 4 directions
        boolean found =
                dfs(board, i - 1, j, word, idx + 1, vis) ||
                dfs(board, i + 1, j, word, idx + 1, vis) ||
                dfs(board, i, j - 1, word, idx + 1, vis) ||
                dfs(board, i, j + 1, word, idx + 1, vis);

        // Backtrack
        vis[i][j] = false;

        return found;
    }

    public boolean exist(char[][] board, String word) {

        boolean[][] vis = new boolean[board.length][board[0].length];

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (dfs(board, i, j, word, 0, vis)) {
                    return true;
                }
            }
        }
        return false;
    }
}


