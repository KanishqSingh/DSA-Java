import java.util.Arrays;

public class RowSort2DArray {
    public static void main(String[] args) {
        int[][] arr = {
            {3, 5, 1},
            {8, 2, 4},
            {7, 6, 9}
        };

        // Sorting each row
        for (int i = 0; i < arr.length; i++) {
            Arrays.sort(arr[i]);
        }

        // Printing the sorted 2D array
        System.out.println("2D Array with sorted rows:");
        for (int[] row : arr) {
            System.out.println(Arrays.toString(row));
        }
    }
}
