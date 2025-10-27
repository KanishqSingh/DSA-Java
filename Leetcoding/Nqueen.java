package Leetcoding;
public class Nqueen {
    
    private static void printSolution(int[][] board) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                System.out.print(board[i][j] == 1 ? "Q " : ". ");
            }
            System.out.println();
        }
    }

    private static boolean isSafe(int[][] board, int row, int col) {
        // Check the column
        for (int i = 0; i < row; i++) {
            if (board[i][col] == 1) {
                return false;
            }
        }

        // Check the left diagonal
        for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j] == 1) {
                return false;
            }
        }

        // Check the right diagonal
        for (int i = row - 1, j = col + 1; i >= 0 && j < board.length; i--, j++) {
            if (board[i][j] == 1) {
                return false;
            }
        }

        return true;
    }

    private static boolean solveNQueens(int[][] board, int row) {
        if (row == board.length) {
            printSolution(board);
            System.out.println();
            return true;  // Return true when a solution is found
        }

        boolean res = false;
        for (int col = 0; col < board.length; col++) {
            if (isSafe(board, row, col)) {
                // Place the queen on the board
                board[row][col] = 1;

                // Recursively place queens in the next row
                res = solveNQueens(board, row + 1) || res;

                
                board[row][col] = 0;
            }
        }

        return res;
    }

    public static void main(String[] args) {
        int N = 8;
        int[][] board = new int[N][N];

        if (!solveNQueens(board, 0)) {
            System.out.println("No solution exists for N = " + N);
        }
    }


}
