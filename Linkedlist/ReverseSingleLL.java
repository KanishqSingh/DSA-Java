package Linkedlist;

public class ReverseSingleLL {
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
        Node prev = null, current = head, next = null;
        while (current != null) {
            next = current.next; 
            current.next = prev; 
            prev = current; 
            current = next; 
        }
        head = prev; 
    }

   
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

    
    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        ReverseSingleLL list = new ReverseSingleLL();
        list.insert(1);
        list.insert(2);
        list.insert(3);
        list.insert(4);

        System.out.println("Original Singly Linked List:");
        list.printList();

        list.reverse();
        System.out.println("Reversed Singly Linked List:");
        list.printList();
    }

    
}

