import java.util.*;

public class DP1 {
    public static void main(String[] args) {
        Scanner SC = new Scanner(System.in);
        int n = SC.nextInt();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - (i + 1); j++) {
                System.out.print(" ");

            }
            for (int j2 = 0; j2 <= i; j2++) {
                System.out.print("*");

            }
            System.out.println();
        }
        for (int i = n - 2; i >= 0; i--) {
            for (int j = 0; j < n-i-1; j++) {
                System.out.print(" ");

            }
            for (int j2 = 0; j2 <=i; j2++) {
                System.out.print("*");

            }
            System.out.println();
        }

    }

}
