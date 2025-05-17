import java.util.Stack;

public class NextGreaterElementLinear {
    public int[] nextGreaterElements(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];
        Stack<Integer> stack = new Stack<>();

    
        for (int i = n - 1; i >= 0; i--) {

            while(!stack.isEmpty() && stack.peek() <= nums[i]){
                stack.pop();
            }

            result[i] = stack.isEmpty() ? -1 : stack.peek();

            stack.push(nums[i]);
          

        }

        return result;
    }

    public static void main(String[] args) {
        NextGreaterElementLinear solution = new NextGreaterElementLinear();
        int[] nums1 = {1, 2, 1};
        int[] result1 = solution.nextGreaterElements(nums1);
        System.out.println(java.util.Arrays.toString(result1));  // Output: [2, -1, -1]

        int[] nums2 = {1, 2, 3, 4, 3};
        int[] result2 = solution.nextGreaterElements(nums2);
        System.out.println(java.util.Arrays.toString(result2));  // Output: [2, 3, 4, -1, -1]
    }
}
