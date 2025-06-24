public class LargestSumSubarray {

    public static int Solve(int[] arr){
        
        int maxsum = Integer.MIN_VALUE;
        int currentSum = 0;

        for(int val : arr){
            currentSum = currentSum + val;
            maxsum = Math.max(currentSum, maxsum);
            if(currentSum < 0){
                currentSum = 0;
            }
        }


        return maxsum;

    }
    public static void main(String[] args) {
        int[] arr1 = {1,2,3,4};
        int result = Solve(arr1);
        System.out.println(result);
    }
}
