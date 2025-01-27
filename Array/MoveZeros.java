
public class MoveZeros {
    public static void moveZerosToEnd(int[] arr) {
        int nonZeroIndex = 0; 
        
        
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
              
                int temp = arr[nonZeroIndex];
                arr[nonZeroIndex] = arr[i];
                arr[i] = temp;
                nonZeroIndex++;
            }
        }
    }
    
    public static void main(String[] args) {
        int[] arr = {0, 0 ,0 , 1 , 2};
        moveZerosToEnd(arr);
        
        System.out.print("Array after moving zeros to end: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
