package recursion;


import java.util.ArrayList;
import java.util.List;

public class PowerSet {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3}; 
        List<List<Integer>> result = generatePowerSet(nums, 0);
        

        System.out.println(result);
    }

    public static List<List<Integer>> generatePowerSet(int[] nums, int index) {
        if (index == nums.length) {
            List<List<Integer>> baseResult = new ArrayList<>();
            baseResult.add(new ArrayList<>()); 
            return baseResult;
        }

        int currentElement = nums[index];
        List<List<Integer>> subsets = generatePowerSet(nums, index + 1);
        List<List<Integer>> newSubsets = new ArrayList<>();

        for (List<Integer> subset : subsets) {
            List<Integer> newSubset = new ArrayList<>(subset);
            newSubset.add(currentElement);
            newSubsets.add(newSubset);
        }

        subsets.addAll(newSubsets);
        return subsets;
    }
}
