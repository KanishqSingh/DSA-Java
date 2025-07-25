package Dynamic_Prog;

import java.util.Scanner;

public class PartitionOfPlayers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n =sc.nextInt();
        int k = sc.nextInt();

        if(n == 0 || k == 0 || n < k){
            System.out.println(0);
            return;
        }

        int[][] dp = new int[k+1][n+1];
        for (int i = 1; i <= k; i++) {
            for (int j = 1; j <= n; j++) {

                if(j<i){
                    dp[i][j] = 0;
                }
                else if(i == j){
                    dp[i][j] = 1;
                } else{
                    dp[i][j] = dp[i-1][j-1] + dp[i][j-1]*i;
                }
                
            }
            
        }
        System.out.println(dp[k][n]);
    }
}
