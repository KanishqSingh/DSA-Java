package Sorting;
import java.util.ArrayList;
import java.util.PriorityQueue;

public class SortKsorted {

    public static ArrayList<Integer> sortKSorted(int[] arr1, int k) {
        ArrayList<Integer> result = new ArrayList<>();
        PriorityQueue<Integer> minheap = new PriorityQueue<>();
        int n = arr1.length;

   
        for (int i = 0; i <= k && i < n; i++) {
            minheap.add(arr1[i]);
        }

       
        for (int i = k + 1; i < n; i++) {
            result.add(minheap.poll());
            minheap.add(arr1[i]);
        }

       
        while (!minheap.isEmpty()) {
            result.add(minheap.poll());
        }

        return result;
    }

    public static void main(String[] args) {
        int[] arr1 = {6, 5, 2, 3, 8, 9, 10};
        int k = 3;
        ArrayList<Integer> result = sortKSorted(arr1, k);
        System.out.println(result);
    }
}
