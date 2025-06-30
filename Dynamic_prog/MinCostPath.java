package Dynamic_Prog;
public class MinCostPath {

    public static int minCost(int[][] matrix) {
        int n = matrix.length;
        int[][] dp = new int[n][n];

        dp[0][0] = matrix[0][0];

 
        for (int j = 1; j < n; j++) {
            dp[0][j] = dp[0][j - 1] + matrix[0][j];
        }

        for (int i = 1; i < n; i++) {
            dp[i][0] = dp[i - 1][0] + matrix[i][0];
        }

        for (int i = 1; i < n; i++) {
            for (int j = 1; j < n; j++) {
                dp[i][j] = matrix[i][j] + Math.min(dp[i - 1][j], dp[i][j - 1]);
            }
        }

        return dp[n - 1][n - 1];
    }

    public static void main(String[] args) {
        int[][] matrix = {
            {1, 3, 5},
            {2, 1, 2},
            {4, 3, 1}
        };

        int result = minCost(matrix);
        System.out.println("Minimum cost to reach end: " + result);
    }
}

// public class GreedyMinCost {

//     public static int greedyMinCost(int[][] matrix) {
//         int n = matrix.length;
//         int i = 0, j = 0;
//         int cost = matrix[0][0];

//         while (i < n - 1 || j < n - 1) {
//             if (i == n - 1) {
//                 // Can only move right
//                 j++;
//             } else if (j == n - 1) {
//                 // Can only move down
//                 i++;
//             } else {
//                 // Compare right and down
//                 if (matrix[i + 1][j] < matrix[i][j + 1]) {
//                     i++;
//                 } else {
//                     j++;
//                 }
//             }
//             cost += matrix[i][j];
//         }

//         return cost;
//     }

//     public static void main(String[] args) {
//         int[][] matrix = {
//             {1, 3, 5},
//             {2, 1, 2},
//             {4, 3, 1}
//         };

//         int result = greedyMinCost(matrix);
//         System.out.println("Greedy cost path: " + result);
//     }
// }
