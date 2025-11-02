public class NQueen {

    // Function to print the board
    static void printBoard(int[][] board, int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    // Check if a queen can be placed safely
    static boolean isSafe(int[][] board, int row, int col, int n) {
        // Check this column on upper side
        for (int i = 0; i < row; i++) {
            if (board[i][col] == 1)
                return false;
        }

        // Check upper-left diagonal
        for (int i = row, j = col; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j] == 1)
                return false;
        }

        // Check upper-right diagonal
        for (int i = row, j = col; i >= 0 && j < n; i--, j++) {
            if (board[i][j] == 1)
                return false;
        }

        return true;
    }

    // Solve using backtracking
    static boolean solveNQueen(int[][] board, int row, int n) {
        // Base case: If all queens are placed
        if (row == n) {
            printBoard(board, n);
            return true;
        }

        boolean res = false;

        // Try placing this queen in all columns
        for (int col = 0; col < n; col++) {
            if (isSafe(board, row, col, n)) {
                board[row][col] = 1; // Place queen

                // Recur to place rest of the queens
                res = solveNQueen(board, row + 1, n) || res;

                // Backtrack
                board[row][col] = 0;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int n = 4;
        int[][] board = new int[n][n];

        if (!solveNQueen(board, 0, n)) {
            System.out.println("No solution exists");
        }
    }
}

