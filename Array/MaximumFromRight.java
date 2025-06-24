import java.util.Arrays;

public class MaximumFromRight {

    public static int[] MaximumFromRight(int[] arr){
        int length = arr.length;
        int[] arr2 = new int[length];
        for (int i = 0; i < arr.length; i++) {
            int max  = Integer.MIN_VALUE;
            for (int j = i+1; j < arr.length; j++) {
                 max = Math.max(arr[j], max);
            }

            arr2[i] = max;

            
        }

        return arr2;
    }
    public static void main(String[] args) {
        
    int[] arr1 = {4,11,12,55,0,5,6};
    int[] newarr = MaximumFromRight(arr1);
    System.out.println(Arrays.toString(newarr));

    }
}
//optimal solution
// import java.util.Arrays;

// public class MaximumFromRight {

//     public static int[] maximumFromRight(int[] arr) {
//         int n = arr.length;
//         int[] result = new int[n];
//         int max = Integer.MIN_VALUE;

//         // Traverse from right to left
//         for (int i = n - 1; i >= 0; i--) {
//             result[i] = max;            // store max seen so far to the right
//             max = Math.max(max, arr[i]); // update max with current element
//         }

//         return result;
//     }

//     public static void main(String[] args) {
//         int[] arr1 = {4, 11, 12, 55, 0, 5, 6};
//         int[] newarr = maximumFromRight(arr1);
//         System.out.println(Arrays.toString(newarr));
//     }
// }
