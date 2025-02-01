
package Sorting;
import java.util.Scanner;

public class QuickSort {

    
    public static void swap(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

    
    public static int partition(int[] arr, int lb, int ub) {
        int pivot = arr[lb];  
        int start = lb;
        int end = ub;

        while (start < end) {
            
            while (arr[start] <= pivot && start < ub)
                start++;

           
            while (arr[end] > pivot)
                end--;

            
            if (start < end) {
                swap(arr, start, end);
                start++;
                end--;
            }
        }

      
        swap(arr, lb, end);
        return end; 
    }

    
    public static void quicksort(int[] arr, int lb, int ub) {
        if (lb < ub) {
            int p = partition(arr, lb, ub); 
            quicksort(arr, lb, p - 1); 
            quicksort(arr, p + 1, ub);  
        }
    }

 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter size of array: ");
        int size = scanner.nextInt();

        int[] arr = new int[size];


        System.out.println("Enter elements in array:");
        for (int i = 0; i < size; i++) {
            System.out.printf("Enter element number %d: ", (i + 1));
            arr[i] = scanner.nextInt();
        }

        
        quicksort(arr, 0, size - 1);

       
        System.out.println("Sorted array:");
        for (int i : arr) {
            System.out.print(i + " ");
        }

        scanner.close();
    }
}
