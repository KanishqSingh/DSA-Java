
package Linkedlist;
public class MiddleLL {
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
            Node newNode = new Node(data);
            if (head == null) {
                head = newNode;
                return;
            }
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
    
        int findMiddle() {
            Node slow = head, fast = head;
            while (fast != null && fast.next != null) {
                slow = slow.next;
                fast = fast.next.next;
            }
            return slow.data;
        }
    
        public static void main(String[] args) {
            MiddleLL list = new MiddleLL();
            list.add(1);
            list.add(2);
            list.add(3);
            list.add(4);
            list.add(5);
            System.out.println("Middle Element: " + list.findMiddle());
        }
    
    
    
}
