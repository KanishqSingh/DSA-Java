import java.util.*;

public class SingleUseAttack {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        
        while (T-- > 0) {
            int H = sc.nextInt();
            int X = sc.nextInt();
            int Y = sc.nextInt();
            
            int minAttacks = Integer.MAX_VALUE;
            
          
            minAttacks = Math.min(minAttacks, (H + X - 1) / X); 
            
            
            if (H - Y > 0) {
                int remainingHealth = H - Y;
                int normalAttacks = (remainingHealth + X - 1) / X;
                minAttacks = Math.min(minAttacks, 1 + normalAttacks);
            } else {
                
                minAttacks = 1;
            }
            
            System.out.println(minAttacks);
        }
        sc.close();
    }
}