package Dynamic_Prog;

import java.util.Scanner;

public class BuyAndSell {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] prices = new int[n];
        for (int i = 0; i < n; i++) {
            prices[i] = sc.nextInt();
            
        }

        int lsf = Integer.MAX_VALUE;
        int op = 0;
        int profit_today = 0;

        for (int i = 0; i < prices.length; i++) {

            if(prices[i] < lsf){
                lsf = prices[i];
            }
            profit_today = prices[i] - lsf;

            if(profit_today > op){
                op = profit_today;

            }
        }
        System.out.println(op);
        

    }

    


    
}
