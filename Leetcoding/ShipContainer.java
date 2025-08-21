package Leetcoding;
public class ShipContainer {
    public int calculateDays(int[] weights, int capacity) {
        int days = 1;
        int load = 0;
        for (int i = 0; i < weights.length; i++) {
            if (weights[i] + load > capacity) {
                days++;
                load = weights[i];
            } else {
                load += weights[i];
            }
        }
        return days;
    }

    public int shipWithinDays(int[] weights, int days) {
        int sum = 0, max = 0;
        for (int w : weights) {
            sum += w;
            max = Math.max(max, w);
        }

        int left = max, right = sum, ans = sum;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            int daysReq = calculateDays(weights, mid);

            if (daysReq <= days) { 
                ans = mid; 
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return ans;
    }
}
