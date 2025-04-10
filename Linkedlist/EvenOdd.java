package Linkedlist;

class Node{
    int data;
    Node next;

    Node(int data){
        this.data = data;
        this.next = null;
    }
}

public class EvenOdd {
    Node head;

    void add(int data){
        Node newnode = new Node(data);
        if(head == null){
            head = newnode;
            return ;

        }

        Node temp = head;
        while(temp.next!=null){
            temp = temp.next;
        }
        temp.next = newnode;
        
    }

    public Node evenodd(Node head){
        Node odd = head;
        Node even = head.next;
        Node evenstart = even;

        while(even != null && even.next != null){
            odd.next = even.next;
            odd = even.next;
            even.next = odd.next;
            even = even.next;


        }

        odd.next = evenstart;
        return head;

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
        EvenOdd list = new EvenOdd();
        // Node head;

        list.add(5);
        list.add(4);
        list.add(3);
        list.add(2);
        list.add(1);
        list.add(0);

        list.printList();

        System.out.println("After even odd rearrangements");
        list.head = list.evenodd(list.head);

        list.printList();

    }


    
}
