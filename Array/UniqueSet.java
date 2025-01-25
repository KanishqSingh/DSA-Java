package Array;
public class UniqueSet{
    public static int removeDuplicates(int[] arr, int n) {
        if (n == 0) return 0; 
        
        int d = 0; 
        
        for (int i = 1; i < n; i++) {
            if(arr[i] != arr[d]){
                d++;
                arr[d] = arr[i];
                
            }
        }
        
    
        return d +1;
    }
    
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 2, 3};
        int n = arr.length;
        int newLength = removeDuplicates(arr, n);
        
        System.out.println("New length: " + newLength);
        System.out.print("Modified array: ");
        for (int i = 0; i < newLength; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
