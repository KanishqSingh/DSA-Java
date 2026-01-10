package Digit;

public class Seclargest {
        public static void main(String[] args) {
        int[] arr = {5,8,3,5,9,1,4,3,2,0};
        int max = arr[0];
        int secmax = Integer.MIN_VALUE;
        for(int i = 0;i<arr.length;i++){
            if(arr[i] > max){
                secmax = max;
                max = arr[i];
            }else if (secmax < arr[i] && arr[i] < max) {
                secmax = arr[i];
                
            }

        }
        System.out.println(secmax);
    }
}
