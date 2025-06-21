package Linkedlist;

import java.util.HashSet;

class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null; 
    }
}

public class RemoveDuplicates {

    private Node head;

   
    public void removeDuplicates() {
        HashSet<Integer> seen = new HashSet<>();
        Node current = head;
        Node prev = null;

        while (current != null) {
            if (seen.contains(current.data)) {
                prev.next = current.next; 
            } else {
                seen.add(current.data);
                prev = current;
            }
            current = current.next;
        }
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
        RemoveDuplicates list = new RemoveDuplicates(); 
        
        list.insert(3);
        list.insert(2);
        list.insert(3);
        list.insert(4);
        list.insert(2);
        list.insert(3);

        System.out.println("Original list:");
        list.printList();

        list.removeDuplicates(); 

        System.out.println("List after removing duplicates:");
        list.printList();
    }
}
