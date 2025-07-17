package Dynamic_Prog;

import java.util.Scanner;

public class TilingWithDominoes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the value of n in 2*n floor");
        int n = sc.nextInt();

        int[] dp = new int[n+1];
        dp[1] = 1;
        dp[2] = 2;

        for (int i = 0; i < dp.length; i++) {

            dp[i] = dp[i-1] + dp[i-2];
            
        }

        System.out.println(dp[n]);
    }
}
