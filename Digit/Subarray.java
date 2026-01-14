public class Subarray {
    

    public static int smallestSubarray(int[] arr, int x) {
        int n = arr.length;
        int minLength = Integer.MAX_VALUE;

        int sum = 0;
        int start = 0;

        for (int end = 0; end < n; end++) {
            sum += arr[end];

            // Shrink window while sum > x
            while (sum > x) {
                minLength = Math.min(minLength, end - start + 1);
                sum -= arr[start];
                start++;
            }
        }

        return (minLength == Integer.MAX_VALUE) ? 0 : minLength;
    }

    public static void main(String[] args) {
        int[] arr = {1, 4, 45, 6, 10, 19};
        int x = 51;

        System.out.println(smallestSubarray(arr, x)); // Output: 3
    }
}


