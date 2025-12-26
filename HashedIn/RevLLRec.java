
    class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class RevLLRec {

    public static Node reverse(Node current) {

        // Base case
        if (current == null || current.next == null) {
            return current;
        }

        // Recursive call
        Node newHead = reverse(current.next);

        // Reverse the link
        Node next = current.next;
        next.next = current;
        current.next = null;

        return newHead;
    }

    public static void printList(Node head) {
        while (head != null) {
            System.out.print(head.data + " -> ");
            head = head.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);

        printList(head);
        head = reverse(head);
        printList(head);
    }


}
