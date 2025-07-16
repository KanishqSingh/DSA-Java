package Dynamic_Prog;

import java.util.Scanner;

public class PaintHouseManyColors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter number of houses");
        int houses = sc.nextInt();
        System.out.println("Enter number of colors");
        int colors = sc.nextInt();
        
        int[][] arr = new int[houses][colors];
        
        System.out.println("Enter the houses and colors");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                arr[i][j] = sc.nextInt();
                
            }
            
        }

        int[][] dp = new int[houses][colors];

        for (int i = 0; i < arr[0].length; i++) {
            dp[0][i] = arr[0][i];
            
        }

        for (int i = 1; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {

                int min = Integer.MAX_VALUE;

                for (int k = 0; k < arr[0].length; k++) {

                    if(k !=j){
                        if(dp[i-1][k] < min) {
                            min =dp[i - 1][k];
                        }
                    }
                    
                }
                dp[i][j] = arr[i][j] + min;
                
            }
            
        }
        
        int min = Integer.MAX_VALUE;
        for(int j = 0; j <colors;j++){

            if(dp[houses-1][j] < min){
                min = dp[houses - 1][j];
            }

        }
        System.out.println("result"+min);
    }
}
