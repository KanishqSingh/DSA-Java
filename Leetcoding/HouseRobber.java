 import java.util.*;
public class HouseRobber {
   

    
    // Recursive function with memoization
    private int maxRec(int n, int[] arr, int[] memo) {
        if (memo[n] != -1) {
            return memo[n];
        }
        
        if (n == 1) {
            memo[n] = arr[0];
        } 
        else if (n == 2) {
            memo[n] = Math.max(arr[0], arr[1]);
        } 
        else {
            memo[n] = Math.max(arr[n-1] + maxRec(n-2, arr, memo), 
                               maxRec(n-1, arr, memo));
        }
        
        return memo[n];
    }
    
    public int findMaxSum(int[] arr) {
        int n = arr.length;
        int[] memo = new int[n+1];
        Arrays.fill(memo, -1);
        
        return maxRec(n, arr, memo);
    }
    
    
    // Driver code
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test_cases = sc.nextInt();
        sc.nextLine(); // consume newline
        
        while (test_cases-- > 0) {
            String[] tokens = sc.nextLine().trim().split(" ");
            int[] a = new int[tokens.length];
            for (int i = 0; i < tokens.length; i++) {
                a[i] = Integer.parseInt(tokens[i]);
            }
            
            Solution ob = new Solution();
            System.out.println(ob.findMaxSum(a));
            System.out.println("~");
        }
        sc.close();
    }


}
