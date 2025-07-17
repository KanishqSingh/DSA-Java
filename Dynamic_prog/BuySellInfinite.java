package Dynamic_Prog;

import java.util.Scanner;

public class BuySellInfinite {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        int i = 0;
        int profit = 0;
        while (i < arr.length-1) {

            if (arr[i + 1] < arr[i]) {
                i++;

            }else{
                profit += arr[i+1] - arr[i];
                i++;
            }

            

        }

        System.out.println(profit);

    }
}
