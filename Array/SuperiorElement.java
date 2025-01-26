package Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SuperiorElement {



    public static List<Integer> findSuperiorElements(int[] a, int n) {
        List<Integer> result = new ArrayList<>();
        int maxFromRight = Integer.MIN_VALUE; 


        for (int i = n - 1; i >= 0; i--) {
            if (a[i] > maxFromRight) {
                result.add(a[i]); 
                maxFromRight = a[i]; 
            }
        }

       
        Collections.sort(result);
        return result;
    }

    public static void main(String[] args) {
        
        int[] a1 = {1, 2, 3, 2};
        int n1 = 4;
        System.out.println("Output: " + findSuperiorElements(a1, n1)); 

        
        int[] a2 = {1, 2, 2, 1};
        int n2 = 4;
        System.out.println("Output: " + findSuperiorElements(a2, n2)); 

        int[] a3 = {5, 4, 3};
        int n3 = 3;
        System.out.println("Output: " + findSuperiorElements(a3, n3)); 
    }
}

    