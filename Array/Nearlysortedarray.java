import java.util.*;
 class NearlySortedArray {
    public static List<Integer> sortNearlySortedArray(int[] arr, int k) {
        List<Integer> result = new ArrayList<>();
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        for (int i = 0; i <= k && i < arr.length; i++) {
            minHeap.add(arr[i]);
        }

        for (int i = k + 1; i < arr.length; i++) {
            result.add(minHeap.poll());
            minHeap.add(arr[i]);
        }

        while (!minHeap.isEmpty()) {
            result.add(minHeap.poll());
        }

        return result;
    }

    public static void main(String[] args) {
        int[] arr1 = { 6, 5, 3, 2, 8, 10, 9 };
        int k1 = 3;
        System.out.println("Sorted Array: " + sortNearlySortedArray(arr1, k1));

        int[] arr2 = { 1, 4, 5, 2, 3, 6, 7, 8, 9, 10 };
        int k2 = 2;
        System.out.println("Sorted Array: " + sortNearlySortedArray(arr2, k2));
    }
}
