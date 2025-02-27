
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SubsetSumTarget {
    
    public static void findSubsets(int[] arr, int index, int target, List<Integer> current, List<List<Integer>> result) {
        if (target == 0) { 
            result.add(new ArrayList<>(current));
            return;
        }
        if (index >= arr.length || target < 0) return; 

        
        current.add(arr[index]);
        findSubsets(arr, index + 1, target - arr[index], current, result);
        current.remove(current.size() - 1); 

        
        findSubsets(arr, index + 1, target, current, result);
    }

    public static List<List<Integer>> findTargetSubsets(int[] arr, int target) {
        List<List<Integer>> result = new ArrayList<>();
        findSubsets(arr, 0, target, new ArrayList<>(), result);
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter array size: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter target sum: ");
        int target = sc.nextInt();

        List<List<Integer>> subsets = findTargetSubsets(arr, target);

        System.out.println("Subsets with sum " + target + ":");
        if (subsets.isEmpty()) {
            System.out.println("No subsets found.");
        } else {
            for (List<Integer> subset : subsets) {
                System.out.println(subset);
            }
        }
        
        sc.close();
    }
}
