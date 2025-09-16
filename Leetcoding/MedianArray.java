package Leetcoding;
import java.util.ArrayList;
import java.util.Collections;

class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        ArrayList<Integer> arr = new ArrayList<>();

        for (int i = 0; i < nums1.length; i++) {
            arr.add(nums1[i]);
        }

        for (int i = 0; i < nums2.length; i++) {
            arr.add(nums2[i]);
        }

        Collections.sort(arr);

        int n = arr.size();
        if (n % 2 == 0) {
            int mid1 = n / 2;
            int mid2 = mid1 - 1;
            return (arr.get(mid1) + arr.get(mid2)) / 2.0;
        } else {
            return arr.get(n / 2);
        }
    }
    public static void main(String[] args) {
        Solution obj = new Solution();
        int[] nums1 = {1, 3};
        int[] nums2 = {2};

        System.out.println(obj.findMedianSortedArrays(nums1, nums2)); 
    }
}

