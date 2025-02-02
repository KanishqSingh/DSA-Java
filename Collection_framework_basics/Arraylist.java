package Collection_framework_basics;
import java.util.*;

public class Arraylist {
    public static void main(String[] args) {
        ArrayList <Integer> num = new ArrayList<>();

        num.add(1);
        num.add(2);
        num.add(3);
        num.add(4);
        num.add(5);

        System.out.println(num);

        System.out.println(num.size());

        System.out.println(num.remove(2));

        System.out.println(num.get(2));

        for(int i : num){
            System.out.print(" " + i);
            System.out.println();

        }

        num.forEach(n -> System.out.println(n));

        Collections.sort(num);

    }

    public static void cloneandcopy(String[] args) { // clone an arrray list and add two array list
        ArrayList<String> list1 = new ArrayList<>(Arrays.asList("Apple", "Banana", "Mango"));
        ArrayList<String> list2 = new ArrayList<>(Arrays.asList("Orange", "Grapes", "Pineapple"));

        
        ArrayList<String> joinedList = new ArrayList<>(list1);
        joinedList.addAll(list2);
        System.out.println("Joined ArrayList: " + joinedList);

        
        ArrayList<String> clonedList = (ArrayList<String>) joinedList.clone();
        System.out.println("Cloned ArrayList: " + clonedList);
        
    }

    
}
