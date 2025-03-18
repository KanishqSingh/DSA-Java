
import java.util.*;

public class BlackJack {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        
        while (T-- > 0) {
            int A = sc.nextInt();
            int B = sc.nextInt();
            
            int required = 21 - (A + B);
            
            if (required >= 1 && required <= 10) {
                System.out.println(required);
            } else {
                System.out.println(-1);
            }
        }
        sc.close();
    }
}
