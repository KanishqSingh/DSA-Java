package Linkedlist;

class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class SingleLinkedList {
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

   
    public void delete(int key) {
        Node temp = head, prev = null;

        
        if (temp != null && temp.data == key) {
            head = temp.next;
            return;
        }

       
        while (temp != null && temp.data != key) {
            prev = temp;
            temp = temp.next;
        }

        
        if (temp == null) return;

        prev.next = temp.next;
    }

    public int length() {
        int count = 0;
        Node temp = head;
        while (temp != null) {
            count++;
            temp = temp.next;
        }
        return count;
    }

    
    public boolean find(int key) {
        Node temp = head;
        while (temp != null) {
            if (temp.data == key) {
                return true;
            }
            temp = temp.next;
        }
        return false;
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
        SingleLinkedList list = new SingleLinkedList();
        
        list.insert(10);
        list.insert(20);
        list.insert(30);
        list.printList(); 

        System.out.println("Length: " + list.length()); 
        
        list.delete(20);
        list.printList(); 

        System.out.println("Find 30: " + list.find(30)); 
        System.out.println("Find 40: " + list.find(40)); 
    }
}
