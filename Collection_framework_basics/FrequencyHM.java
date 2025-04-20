package Collection_framework_basics;

import java.util.HashMap;
import java.util.Map;

public class FrequencyHM {
    public static void main(String[] args) {
        int[] arr = {2, 5, 3, 2, 8, 5, 6, 8, 8, 2};

        Map<Integer, Integer> freqMap = new HashMap<>();

        for (int num : arr) {
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        }

        System.out.println("Element Frequencies:");
        for (Map.Entry<Integer, Integer> entry : freqMap.entrySet()) {
            System.out.println(entry.getKey() + " → " + entry.getValue());
        }
    }
}
