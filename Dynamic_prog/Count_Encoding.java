package Dynamic_Prog;

import java.util.Scanner;

public class Count_Encoding {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        if (str.length() == 0 || str.charAt(0) == '0') {
            System.out.println(0);
            return;
        }

        int[] dp = new int[str.length()];
        dp[0] = 1;

        for (int i = 1; i < dp.length; i++) {
            char curr = str.charAt(i);
            char prev = str.charAt(i - 1);

            if (curr == '0' && prev == '0') {
                dp[i] = 0;
            } else if (curr != '0' && prev == '0') {
                dp[i] = dp[i - 1];
            } else if (curr == '0' && prev != '0') {
                if (prev == '1' || prev == '2') {
                    dp[i] = i >= 2 ? dp[i - 2] : 1;
                } else {
                    dp[i] = 0;
                }
            } else {
                int val = Integer.parseInt(str.substring(i - 1, i + 1));
                if (val <= 26) {
                    dp[i] = dp[i - 1] + (i >= 2 ? dp[i - 2] : 1);
                } else {
                    dp[i] = dp[i - 1];
                }
            }
        }

        System.out.println(dp[str.length() - 1]);
    }
}
