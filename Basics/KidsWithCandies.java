
import java.util.*;

public class KidsWithCandies {
    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> result = new ArrayList<>();
        int maxCandies = 0;
        
        
        for (int candy : candies) {
            maxCandies = Math.max(maxCandies, candy);
        }
        
        
        for (int candy : candies) {
            result.add(candy + extraCandies >= maxCandies);
        }
        
        return result;
    }

    public static void main(String[] args) {
        
        System.out.println(kidsWithCandies(new int[]{2,3,5,1,3}, 3)); // [true, true, true, false, true]
        System.out.println(kidsWithCandies(new int[]{4,2,1,1,2}, 1)); // [true, false, false, false, false]
        System.out.println(kidsWithCandies(new int[]{12,1,12}, 10)); // [true, false, true]
    }
}
