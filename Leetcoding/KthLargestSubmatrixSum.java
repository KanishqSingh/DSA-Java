package Leetcoding;
import java.util.*;

public class KthLargestSubmatrixSum {

    public static int kthLargestSum(int[][] matrix, int k) {
        int m = matrix.length;
        int n = matrix[0].length;

       
        int[][] prefix = new int[m + 1][n + 1];
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                prefix[i][j] = matrix[i - 1][j - 1]
                             + prefix[i - 1][j]
                             + prefix[i][j - 1]
                             - prefix[i - 1][j - 1];
            }
        }

        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        // Step 3: Iterate all submatrices
        for (int r1 = 1; r1 <= m; r1++) {
            for (int r2 = r1; r2 <= m; r2++) {
                for (int c1 = 1; c1 <= n; c1++) {
                    for (int c2 = c1; c2 <= n; c2++) {
                        int sum = prefix[r2][c2]
                                - prefix[r1 - 1][c2]
                                - prefix[r2][c1 - 1]
                                + prefix[r1 - 1][c1 - 1];

                        minHeap.offer(sum);
                        if (minHeap.size() > k) {
                            minHeap.poll();
                        }
                    }
                }
            }
        }

   
        return minHeap.peek();
    }

    public static void main(String[] args) {
        int[][] matrix = {
            {1, -2},
            {3, 4}
        };
        int k = 3;

        int result = kthLargestSum(matrix, k);
        System.out.println("Kth largest submatrix sum is: " + result);
    }
}
