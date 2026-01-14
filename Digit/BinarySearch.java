package Digit;
import java.util.Arrays;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {5,8,5,9,1,2,5,7,3}; //1,2,3,5,5,5,7,8,9
        int target = 3;
        Arrays.sort(arr);
        int low = 0;
        int high = arr.length - 1;
        
        while(low <= high){
            int mid = (low+high)/2;
            if(arr[mid] == target){
                System.out.println(mid);
                break;
            }else if (arr[mid] < target) {
                low = mid + 1;
            } else{
                high = mid - 1;
            }
        }
    }
    
}
