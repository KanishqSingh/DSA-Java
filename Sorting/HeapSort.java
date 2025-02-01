package Sorting;

import java.util.Scanner;

public class HeapSort {

    public static void heapify(int[] arr, int size, int i) {
        int largest = i;
        int l = 2 * i + 1;
        int r = 2 * i + 2;

        if (l < size && arr[l] > arr[largest]) {
            largest = l;
        }
        if (r < size && arr[r] > arr[largest]) {
            largest = r;
        }

        if (largest != i) {
            int temp = arr[i];
            arr[i] = arr[largest];
            arr[largest] = temp;
            heapify(arr, size, largest);
        }
    }

    public static void heapsort(int[] arr, int size) {
        for (int i = size / 2 - 1; i >= 0; i--) {
            heapify(arr, size, i);
        }
        for (int i = size - 1; i > 0; i--) {
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;
            heapify(arr, i, 0);
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

        heapsort(arr, size);

        System.out.println("Sorted array:");
        for (int i : arr) {
            System.out.print(i + " ");
        }

        scanner.close();
    }
}
