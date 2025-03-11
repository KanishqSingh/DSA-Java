
import java.util.*;

public class SpiralMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the matrix (n): ");
        int n = scanner.nextInt();
        scanner.close();
        
        int[][] matrix = generateSpiralMatrix(n);
        printMatrix(matrix);
    }

    public static int[][] generateSpiralMatrix(int n) {
        int[][] matrix = new int[n][n];
        int left = 0, right = n - 1, top = 0, bottom = n - 1;
        int num = 1;
        
        while (num <= n * n) {
            for (int i = left; i <= right; i++) {
                matrix[top][i] = num++;
            }
            top++;

            for (int i = top; i <= bottom; i++) { 
                matrix[i][right] = num++;
            }
            right--;

            for (int i = right; i >= left; i--) { 
                matrix[bottom][i] = num++;
            }
            bottom--;

            for (int i = bottom; i >= top; i--) { 
                matrix[i][left] = num++;
            }
            left++;
        }
        return matrix;
    }

    public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int num : row) {
                System.out.printf("%4d", num);
            }
            System.out.println();
        }
    }
}