package Dynamic_Prog;

import java.util.*;

public class PaintHouse {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number of houses");
        int n = sc.nextInt();

        int[][] colors = new int[n][3];

        System.out.println("Enter cost of colors");
        for (int i = 0; i < colors.length; i++) {
            for (int j = 0; j < colors[0].length; j++) {
                colors[i][j] = sc.nextInt();

            }
        }

        int[][] dp = new int[n][3];
        dp[0][0] = colors[0][0];
        dp[0][1] = colors[0][1];
        dp[0][2] = colors[0][2];

        for (int i = 1; i < colors.length; i++) {

            dp[i][0] = colors[i][0] + Math.min(dp[i - 1][1], dp[i - 1][2]);
            dp[i][1] = colors[i][1] + Math.min(dp[i - 1][0], dp[i - 1][2]);
            dp[i][2] = colors[i][2] + Math.min(dp[i - 1][0], dp[i - 1][1]);

        }


        int result = Math.min(dp[n-1][0], Math.min(dp[n-1][1], dp[n-1][2]));

        System.out.println("result"+result);
    }
}
