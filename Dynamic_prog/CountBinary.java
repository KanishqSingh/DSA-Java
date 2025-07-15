package Dynamic_Prog;

import java.util.Scanner;

public class CountBinary {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] zeros = new int[ n +1 ];
        int[] ones = new int[ n +1 ];

        zeros[1] = 1;
        ones[1] = 1;

        for (int i = 2; i <= n; i++) {

            ones[i] = ones[i-1] + zeros[i-1];
            zeros[i] = ones[i-1];
            
        }

        System.out.println(ones[n] + zeros[n]);
    }
    
}
