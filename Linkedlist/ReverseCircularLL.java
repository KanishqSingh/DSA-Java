package Linkedlist;

public class ReverseCircularLL {
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    Node head;

    
    public void reverse() {
        if (head == null || head.next == head) return;

        Node prev = null, current = head, next;
        Node last = head; 

        do {
            last = last.next;
        } while (last.next != head); 

        do {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        } while (current != head);

        head.next = prev; 
        head = prev;
    }

    
    public void insert(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            head.next = head; 
            return;
        }
        Node temp = head;
        while (temp.next != head) {
            temp = temp.next;
        }
        temp.next = newNode;
        newNode.next = head;
    }

    
    public void printList() {
        if (head == null) return;
        Node temp = head;
        do {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        } while (temp != head);
        System.out.println("(Back to head)");
    }

    public static void main(String[] args) {
        ReverseCircularLL list = new ReverseCircularLL();
        list.insert(1);
        list.insert(2);
        list.insert(3);
        list.insert(4);

        System.out.println("Original Circular Linked List:");
        list.printList();

        list.reverse();
        System.out.println("Reversed Circular Linked List:");
        list.printList();
    }



    
}


    