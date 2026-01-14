package Digit;

public class TransferZero {
    public static void main(String[] args) {
        int left = 0;
        int[] arr = {1,2,0,0};

        for (int right = 0; right < arr.length; right++) {
            if (arr[right] != 0) {
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
            }
        }

        for(int num : arr){
            System.out.print(num);
        }

    }
}
