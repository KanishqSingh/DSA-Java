public class MaxCard {
    
    public static int maxScoreOptimal(int[] cardScore, int k) {
        int n = cardScore.length;
        int sum = 0;
        
        for (int i = 0; i < k; i++) {
            sum += cardScore[i];
        }

        int maxScore = sum;
      
        for (int i = 0; i < k; i++) {
            sum -= cardScore[k - 1 - i];    // Remove the last card from the current window
            sum += cardScore[n - 1 - i];    // Add a card from the end
            maxScore = Math.max(maxScore, sum); // Track the maximum score
        }

        return maxScore;
    }

    public static void main(String[] args) {
        int[] cardScore = {1, 2, 3, 4, 5, 6, 1};
        int k = 3;
        System.out.println("Max Score (Optimal): " + maxScoreOptimal(cardScore, k));
    }


}
