package Linkedlist;


class Node{
    int data;
    Node next;

    Node(int data){
        this.data = data;
        this.next = null;
    }
}


public class EvenOddPractice {

    Node head;

    void add(int data){
        Node newnode = new Node(data);

        if(head == null){
            head = newnode;
            return;
        }

        Node temp = head;
        while(temp.next != null){
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

    public void printlist(){
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "-->");
            temp = temp.next;
            
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        EvenOddPractice list = new EvenOddPractice();

        list.add(5);
        list.add(4);
        list.add(1);
        list.add(2);
        list.add(0);
        list.add(3);

        list.printlist();

        System.out.print("After rearrangements\n");

        list.head = list.evenodd(list.head);

        list.printlist();



    }




    

    
}
