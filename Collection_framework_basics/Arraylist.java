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

    
}
