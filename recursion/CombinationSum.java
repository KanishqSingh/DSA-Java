package recursion;
import java.util.*;

class CombinationSum {
    public void findCombinations(int index, int target, int[] arr, List<List<Integer>> ans, List<Integer> current) {
        if (target == 0) {
            ans.add(new ArrayList<>(current));
            return;
        }
        if (index >= arr.length) return;

        if (arr[index] <= target) {
            current.add(arr[index]);
            findCombinations(index, target - arr[index], arr, ans, current);
            current.remove(current.size() - 1);
        }
        
        findCombinations(index + 1, target, arr, ans, current);
    }

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        findCombinations(0, target, candidates, ans, new ArrayList<>());
        return ans;
    }

    public static void main(String[] args) {
        CombinationSum solution = new CombinationSum();
        System.out.println(solution.combinationSum(new int[]{2, 3, 6, 7}, 7));
        System.out.println(solution.combinationSum(new int[]{2}, 1));
    }

}