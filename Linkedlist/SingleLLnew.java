package Linkedlist;

import java.util.*;

class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class SingleLLnew {

    private Node head;

    public void insert(int data) {
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

    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "-->");
            temp = temp.next;

        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        SingleLLnew list = new SingleLLnew();
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i <= 5; i++) {
            int data = sc.nextInt();
            list.insert(data);

        }

        // list.insert(10);
        // list.insert(20);
        // list.insert(30);
        // list.insert(40);
        // list.insert(50);

        list.display();

    }

}
