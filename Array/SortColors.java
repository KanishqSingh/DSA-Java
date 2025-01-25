//Dutch national flag problem
package Array;
public class SortColors {
    public static void sortColors(int[] nums) {
        
        int low = 0, mid = 0, high = nums.length - 1;

        
        while (mid <= high) {
            switch (nums[mid]) {
                case 0:
                    
                    swap(nums, low, mid);
                    low++;
                    mid++;
                    break;

                case 1:
                    
                    mid++;
                    break;

                case 2:
                    
                    swap(nums, mid, high);
                    high--;
                    break;
            }
        }
    }

   
    private static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    public static void main(String[] args) {
        int[] nums1 = {2, 0, 2, 1, 1, 0};
        sortColors(nums1);
        System.out.println("Sorted Array: " + java.util.Arrays.toString(nums1));

        int[] nums2 = {2, 0, 1};
        sortColors(nums2);
        System.out.println("Sorted Array: " + java.util.Arrays.toString(nums2));

        int[] nums3 = {0};
        sortColors(nums3);
        System.out.println("Sorted Array: " + java.util.Arrays.toString(nums3));
    }
}
