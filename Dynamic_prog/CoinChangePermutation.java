package Dynamic_Prog;

import java.util.Scanner;

public class CoinChangePermutation {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size for coins");
        int size = sc.nextInt();
        int[] coins = new int[size];
        for (int i = 0; i < size; i++) {
            coins[i] = sc.nextInt();
        }

        System.out.println("Enter amount to find");
        int targetAmt = sc.nextInt();
        int[] dp = new int[targetAmt + 1];
        dp[0] = 1;

        for (int i = 1; i < dp.length; i++) {
            for (int j = 0; j < coins.length; j++) {

                if (coins[j] <= i) {

                    dp[i] = dp[i] + dp[i - coins[j]];
                    
                }

                
            }
            
        }

        System.out.println(dp[targetAmt]);

    }

}
