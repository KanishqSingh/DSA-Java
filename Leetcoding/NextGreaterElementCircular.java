package Leetcoding;
import java.util.Stack;

public class NextGreaterElementCircular {
    public int[] nextGreaterElements(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < n; i++) {
            result[i] = -1;
        }

        for (int i = 2 * n - 1; i >= 0; i--) {
            int index = i % n;

            while (!stack.isEmpty() && stack.peek() <= nums[index]) {
                stack.pop();
            }

            if (i < n) {
                result[index] = stack.isEmpty() ? -1 : stack.peek();
            }

            stack.push(nums[index]);
        }

        return result;
    }

    public static void main(String[] args) {
        NextGreaterElementCircular solution = new NextGreaterElementCircular();
        int[] nums1 = {1, 2, 1};
        int[] result1 = solution.nextGreaterElements(nums1);
        System.out.println(java.util.Arrays.toString(result1));  

        int[] nums2 = {1, 2, 3, 4, 3};
        int[] result2 = solution.nextGreaterElements(nums2);
        System.out.println(java.util.Arrays.toString(result2)); 
    }
}
