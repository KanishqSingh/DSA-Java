public class MaxProfitTriplet {

    public static int maxProfit(int[] prices, int[] profits) {
        int n = prices.length;
        int maxProfit = -1, totalProfit = 0;
        for (int i = 0; i < n - 2; i++) {
            for (int j = i + 1; j < n - 1; j++) {
                if (prices[i] >= prices[j]) {
                    for (int j2 = j + 1; j2 < n; j2++) {
                        if (prices[j] >= prices[j2]) {
                            totalProfit = profits[i] + profits[j] + profits[j2];
                            maxProfit = Math.max(totalProfit, maxProfit);

                        }

                    }

                }

            }

        }
        return maxProfit;
    }

    public static void main(String[] args) {
        int[] prices = { 5, 4, 3, 2, 1 };
        int[] profits = { 6, 4, 3, 5, 1 };

        int result = maxProfit(prices, profits);
        System.out.println("Max Profit: " + result);
    }
}
