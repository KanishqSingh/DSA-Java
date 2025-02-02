package Collection_framework_basics;

import java.util.*;

public class HashMapDemo {  
    public static void HashMap(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();  

        
        map.put("Apple", 10);
        map.put("Banana", 5);
        map.put("Mango", 15);

        
        System.out.println("Price of Mango: " + map.get("Mango"));

        
        System.out.println("Contains Apple? " + map.containsKey("Apple"));

        
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }

    public static void HashSet(String[] args) {
        HashSet<String> set = new HashSet<>();

        
        set.add("Apple");
        set.add("Banana");
        set.add("Mango");
        set.add("Apple");  

        
        System.out.println("Contains Mango? " + set.contains("Mango"));

        
        for (String fruit : set) {
            System.out.println(fruit);
        }
    }

    public static void LinkedHashMap(String[] args) {
        LinkedHashMap<Integer, String> map = new LinkedHashMap<>();

        map.put(1, "One");
        map.put(2, "Two");
        map.put(3, "Three");

        System.out.println("LinkedHashMap maintains order: " + map);
    }

    public static void TreeMap(String[] args) {
        TreeMap<String, Integer> map = new TreeMap<>();

        map.put("Banana", 5);
        map.put("Apple", 10);
        map.put("Mango", 15);

        System.out.println("TreeMap sorted order: " + map);
    }
}
