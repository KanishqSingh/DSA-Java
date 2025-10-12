public class MissingNumber {
   
    public static int findMissing(int[] arr) {
        int n = arr.length + 1;  // because one number is missing
        int total = n * (n + 1) / 2;  // expected sum
        int sum = 0;

        for (int num : arr) {
            sum += num;  // actual sum
        }

        return total - sum;  // missing number
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 5, 6};
        System.out.println("Missing number is: " + findMissing(arr));
    }


}
