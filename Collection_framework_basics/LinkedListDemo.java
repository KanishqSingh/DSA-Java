package Collection_framework_basics;

import java.util.*;

public class LinkedListDemo {  
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>(); 

       
        list.add("Apple");
        list.add("Banana");
        list.add("Mango");

        list.addFirst("Pineapple");
        list.addLast("Grapes");

        System.out.println("First: " + list.getFirst());
        System.out.println("Last: " + list.getLast());

       
        list.removeFirst();
        list.removeLast();

        
        System.out.println("Contains Banana? " + list.contains("Banana"));

       
        Collections.sort(list);
        System.out.println("Sorted List: " + list);

        
        System.out.println("Iterating using for-each loop:");
        for (String fruit : list) {
            System.out.println(fruit);
        }

       
        String[] arr = list.toArray(new String[0]);
        System.out.println("Array: " + Arrays.toString(arr));
    }
}
