package Dynamic_Prog;

import java.util.Scanner;

public class ZeroOneKnapsack {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter total number of items");
        int n = sc.nextInt();

        int[] val = new int[n];
        int[] weight = new int[n];

        System.out.println("Enter weights of items");
        for (int i = 0; i < n; i++) {
            weight[i] = sc.nextInt();
        }

        System.out.println("Enter values of items");
        for (int i = 0; i < n; i++) {
            val[i] = sc.nextInt();
        }

        System.out.println("Enter capacity of knapsack");
        int capacity = sc.nextInt();

        int[][] dp = new int[n + 1][capacity + 1];

        
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j <= capacity; j++) {
                if (j >= weight[i - 1]) {
                    dp[i][j] = Math.max(dp[i - 1][j], val[i - 1] + dp[i - 1][j - weight[i - 1]]);
                } else {
                    dp[i][j] = dp[i - 1][j];
                }
            }
        }

        System.out.println("Maximum value in knapsack: " + dp[n][capacity]);
    }
}
