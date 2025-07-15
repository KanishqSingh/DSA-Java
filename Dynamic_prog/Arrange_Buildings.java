package Dynamic_Prog;

import java.util.Scanner;

public class Arrange_Buildings {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long n = sc.nextInt();

        long[] Building = new long[(int)n + 1];
        long[] Space = new long[(int)n + 1];

        Building[1] = 1;
        Space[1] = 1;

        for (int i = 2; i <= n; i++) {
            Space[i] = Space[i - 1] + Building[i - 1];
            Building[i] = Space[i - 1];
        }

        long total = Space[(int)n] + Building[(int)n];
        System.out.println(total * total);
    }

}
