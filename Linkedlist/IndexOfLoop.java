package Linkedlist;

public class IndexOfLoop {
    class Node {
        int data;
        Node next;
        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    Node head;

    void add(int data) {
        Node newnode = new Node(data);
        if (head == null) {
            head = newnode;
            return;
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newnode;
    }

   
    void createLoop(int index) {
        Node temp = head;
        Node loopNode = null;
        int count = 0;

        while (temp.next != null) {
            if (count == index)
                loopNode = temp;
            temp = temp.next;
            count++;
        }
        temp.next = loopNode;
    }

    int indexOfLoop() {
        Node slow = head, fast = head;

        
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {

                int index = 0;
                slow = head;
                while (slow != fast) {
                    slow = slow.next;
                    fast = fast.next;
                    index++;
                }
                return index;
            }
        }

        return -1; 
    }

    public static void main(String[] args) {
        IndexOfLoop list = new IndexOfLoop();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        list.createLoop(2); 

        int loopIndex = list.indexOfLoop();
        if (loopIndex == -1) {
            System.out.println("No loop in the linked list.");
        } else {
            System.out.println("Loop starts at index: " + loopIndex);
        }
    }
}
