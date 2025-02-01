package Sorting;

import java.util.Scanner;

public class MergeSort {

    public static void merge(int[] arr, int lb, int mid, int ub) {
        int i = lb;
        int j = mid + 1;
        int k = 0;

        int size = ub - lb + 1;
        int[] b = new int[size];

        while (i <= mid && j <= ub) {
            if (arr[i] <= arr[j]) {
                b[k] = arr[i];
                k++;
                i++;
            } else {
                b[k] = arr[j];
                k++;
                j++;
            }
        }

        while (i <= mid) {
            b[k] = arr[i];
            k++;
            i++;
        }

        while (j <= ub) {
            b[k++] = arr[j];
        }

        for (i = lb, k = 0; i <= ub; i++, k++) {
            arr[i] = b[k];
        }
    }

    public static void mergesort(int[] arr, int lb, int ub) {
        if (lb < ub) {
            int mid = lb + (ub - lb) / 2;
            mergesort(arr, lb, mid);
            mergesort(arr, mid + 1, ub);
            merge(arr, lb, mid, ub);
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

        mergesort(arr, 0, size - 1);

        System.out.println("Sorted array:");
        for (int i : arr) {
            System.out.print(i + " ");
        }

        scanner.close();
    }
}
