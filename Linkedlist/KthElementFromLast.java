package Linkedlist;

import java.util.Scanner;

class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class KthElementFromLast {

    private Node head;

    public void insert(int data) {
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

    public int FindKthElementFromLast(int k) {

        Node slow = head;
        Node fast = head;
        int index = 0;

        for (int i = 0; i < k; i++) {
            if (fast == null) {
                throw new IllegalArgumentException("k is greater than the length of the list");
            }
            fast = fast.next;
        }

        while (fast != null) {

            slow = slow.next;
            fast = fast.next;

        }
        return slow.data;
    }

    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {

        KthElementFromLast list = new KthElementFromLast();
        Scanner sc = new Scanner(System.in);

        list.insert(10);
        list.insert(20);
        list.insert(30);

        // list.insert(40);
        // list.insert(50);
        // list.insert(60);

        // list.insert(70);
        // list.insert(80);
        // list.insert(90);

        // list.insert(100);
        // list.insert(110);
        // list.insert(120);
        list.printList();

        System.out.println("Enter kth element to be found from last");
        int k = sc.nextInt();
        int result = list.FindKthElementFromLast(k);

        System.out.println("Kth element is :-" + result);

    }

}
