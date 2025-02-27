import java.util.Scanner;

public class RatFood {

    public static int solve(int r, int unit, int[] arr, int n) {
        if (arr == null || n == 0) {
            return -1; 
        }

        int requiredFood = r * unit; 
        int sum = 0;
        int count = 0;

        for (int i = 0; i < n; i++) {
            sum += arr[i]; 
            count++;       

            if (sum >= requiredFood) { 
                return count;
            }
        }

        return 0; 
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int unit = sc.nextInt(); 
        int n = sc.nextInt(); 

        int arr[] = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt(); 

        System.out.println(solve(r, unit, arr, n)); 
        sc.close();
    }
}
