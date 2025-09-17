public class Josephus {
    
    public int findTheWinner(int n, int k) {
        int winner = 0;  // Base case for n = 1
        for (int i = 2; i <= n; i++) {
            winner = (winner + k) % i;
        }
        return winner + 1; // Convert from 0-based to 1-based
    }
}


