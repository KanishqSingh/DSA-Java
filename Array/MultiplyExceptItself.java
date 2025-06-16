import java.util.Arrays;

public class MultiplyExceptItself {

    public static int[] foo(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];

        for (int i = 0; i < n; i++) {
            int mul1 = 1;
            int mul2 = 1;

           
            for (int j = i + 1; j < n; j++) {
                mul1 *= nums[j];
            }

          
            for (int j = i - 1; j >= 0; j--) {
                mul2 *= nums[j];
            }

            ans[i] = mul1 * mul2;
        }

        return ans;
    }

    public static void main(String[] args) {
        int[] arr1 = {-1,1,0,-3,3};
        int[] result = foo(arr1);
        System.out.println(Arrays.toString(result)); 
    }
}
