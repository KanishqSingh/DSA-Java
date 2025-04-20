import java.util.HashSet;
import java.util.Set;

public class Union {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 5, 5, 8, 6, 9, 2, 0};
        int[] arr2 = {9, 5, 6, 1, 7, 3, 3};

        Set<Integer> union = new HashSet<>();

        for(Integer num : arr1){
            union.add(num);
        }

        for(Integer num : arr2){
            union.add(num);
        }

        for(Integer num : union){
            System.out.print(num + " ");
        }


    }
}

