
    import java.util.*;

public class FrogJumpK {
    public static int minimizeEnergy(int[] heights, int n, int k) {
        int[] dp = new int[n];
        Arrays.fill(dp, Integer.MAX_VALUE);
        dp[0] = 0;

        for (int i = 1; i < n; i++) {
            for (int j = 1; j <= k; j++) {
                if (i - j >= 0) {
                    int jump = dp[i - j] + Math.abs(heights[i] - heights[i - j]);
                    dp[i] = Math.min(dp[i], jump);
                }
            }
        }
        return dp[n - 1];
    }

    public static void main(String[] args) {
        int[] heights = {10, 30, 40, 50, 20};
        int n = heights.length;
        int k = 3;

        System.out.println("Minimum energy required: " + minimizeEnergy(heights, n, k));
    }


}
