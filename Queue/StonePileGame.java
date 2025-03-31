import java.util.*;

public class StonePileGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt(); 
        
        while (T-- > 0) {
            int N = sc.nextInt(); 
            Deque<Integer> pile = new LinkedList<>();
            
            for (int i = 0; i < N; i++) {
                pile.addLast(sc.nextInt());
            }
            
            boolean isAmanTurn = true;
            while (pile.size() > 1) {
                if (isAmanTurn) {
                    
                    pile.addLast(pile.pollFirst()); 
                    pile.pollFirst(); 
                } else {
                    
                    pile.addLast(pile.pollFirst()); 
                    pile.addLast(pile.pollFirst()); 
                    pile.pollFirst(); 
                }
                isAmanTurn = !isAmanTurn; 
            }
            
            
            System.out.println((isAmanTurn ? "0" : "1") + " " + pile.peek());
        }
        sc.close();
    }
}
