import java.util.*;
public class FirstNonRepeating {
   

    public static int firstNonRepeating(int[] arr) {
        Map<Integer, Integer> freq = new HashMap<>();

        for (int num : arr) {
            freq.put(num,freq.getOrDefault(num, 0)+1);
        }

        for (int num : freq.keySet()) {
            if (freq.get(num) == 1) {
                return num;
            }
        }

        return -1; 
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 2, 1, 4};
        System.out.println(firstNonRepeating(arr)); 
    }


}
