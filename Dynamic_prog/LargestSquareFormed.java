package Dynamic_Prog;

import java.util.Scanner;

public class LargestSquareFormed {

    public static int solution(int[][] arr) {

        int ans = 0;
        int n = arr.length;
        int m = arr[0].length;
        int[][] dp = new int[n][m];
        for (int i = n-1; i >= 0; i--) {
            for (int j = m-1; j >= 0; j--) {
                if (arr[i][j] == 0) {
                    dp[i][j] = 0;
                } else if (i == n - 1 || j == m - 1) {

                    dp[i][j] = arr[i][j];

                } else {

                    dp[i][j] = Math.min(dp[i][j + 1], Math.min(dp[i + 1][j], dp[i + 1][j + 1])) + 1;

                }

                ans = Math.max(ans, dp[i][j]);

            }

        }

        return ans;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter rows");
        int n = sc.nextInt();

        System.out.println("Enter cols");
        int m = sc.nextInt();

        int[][] arr = new int[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {

                System.out.println("enter element number" + i + j);
                arr[i][j] = sc.nextInt();

            }

        }

        int result = solution(arr);
        System.out.println(result);
    }
}
