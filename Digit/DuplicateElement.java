package Digit;

import java.util.HashMap;

public class DuplicateElement {
    public static void main(String[] args) {
        int[] arr = {1,1,2,5,5,8,9,9,8,4,1,2,9,9};
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int num : arr){
            map.put(num, map.getOrDefault(num, 0)+1);
        }
        for(Integer num : map.keySet()){
            System.out.println(num + "->" + map.get(num));
        }
    }
}
