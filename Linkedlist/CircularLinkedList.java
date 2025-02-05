package Linkedlist;
class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class CircularLinkedList {
    private Node head;

    public void insert(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            newNode.next = head;
        } else {
            Node temp = head;
            while (temp.next != head) {
                temp = temp.next;
            }
            temp.next = newNode;
            newNode.next = head;
        }
    }

    public void delete(int key) {
        if (head == null) return;

        Node temp = head, prev = null;

        if (temp.data == key) {
            if (temp.next == head) {
                head = null;
            } else {
                prev = head;
                while (prev.next != head) {
                    prev = prev.next;
                }
                head = temp.next;
                prev.next = head;
            }
            return;
        }

        while (temp != head && temp.data != key) {
            prev = temp;
            temp = temp.next;
        }

        if (temp == head) return;

        prev.next = temp.next;
    }

    public int length() {
        if (head == null) return 0;

        int count = 1;
        Node temp = head.next;
        while (temp != head) {
            count++;
            temp = temp.next;
        }
        return count;
    }

    public boolean find(int key) {
        if (head == null) return false;

        Node temp = head;
        do {
            if (temp.data == key) {
                return true;
            }
            temp = temp.next;
        } while (temp != head);
        return false;
    }

    public void printList() {
        if (head == null) return;

        Node temp = head;
        do {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        } while (temp != head);
        System.out.println("(head)");
    }

    public static void main(String[] args) {
        CircularLinkedList list = new CircularLinkedList();

        list.insert(10);
        list.insert(20);
        list.insert(30);
        list.printList(); 

        System.out.println("Length: " + list.length());  

        list.delete(20);
        list.printList();  

        System.out.println("Find 30: " + list.find(30));  
        System.out.println("Find 40: " + list.find(40));  

        list.delete(10);
        list.delete(30);
        list.printList();  
    }
}
