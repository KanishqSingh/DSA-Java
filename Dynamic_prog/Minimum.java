package Dynamic_Prog;

import java.util.Scanner;

public class Minimum {

    public static Integer solution(int[] arr){
        int ans;
        int n =arr.length;
        Integer[] dp = new Integer[n];
        dp[n-1] = 0;
        for (int i = n-2; i >= 0; i--) {
            int steps = arr[i];
            int min = Integer.MAX_VALUE;
            for (int j = 1; j <= steps && i + j < n; j++) {
                if(dp[i+j] != null && dp[i+j] < min){
                    min = dp[i+j];
                }

                
            }
            if(min != Integer.MAX_VALUE){
                dp[i] = min+1;
            }
            
        }
        return dp[0];
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        

        System.out.println("enter number of jump");
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < arr.length; i++) {
            System.out.println("enter number"+i);;
            arr[i] = sc.nextInt();
            
        }

        int res = solution(arr);
        System.out.println(res);
    }
}
