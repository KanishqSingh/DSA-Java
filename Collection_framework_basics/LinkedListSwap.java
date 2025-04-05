package Collection_framework_basics;
import java.util.LinkedList;
public class LinkedListSwap {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);

        int first = list.getFirst();
        int last = list.getLast();

        list.removeFirst();
        list.removeLast();

        list.addFirst(last);
        list.addLast(first);

        System.out.println(list);

    }
    
}
