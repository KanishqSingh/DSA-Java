package Leetcoding;

import java.util.*;
public class MaximizeHeight {
    public int maximumSum(List<Integer> maximumHeights) {
        Collections.sort(maximumHeights, Collections.reverseOrder());
        int n = maximumHeights.size();
        int prevHeight = Integer.MAX_VALUE;
        long total = 0;

        for (int h : maximumHeights) {
            int heightToAssign = Math.min(h, prevHeight - 1);
            if (heightToAssign <= 0) return -1;
            total += heightToAssign;
            prevHeight = heightToAssign;
        }

        return (int) total;
    }
}
