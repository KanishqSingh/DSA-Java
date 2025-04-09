package Linkedlist;

public class MiddleLL2 {
    class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
        }
    }

        Node head;

        void add(int data){
            Node newnode = new Node(data);
            if(head == null){
                head  = newnode;
                return ;
            }
            Node temp = head;
                while (temp.next != null) {
                    temp = temp.next;

                    
                }
                temp.next = newnode;
            }

            int LLmid(){
                Node slow = head;
                Node fast = head;

                while(fast != null && fast.next != null){
                    slow = slow.next;
                    fast = fast.next.next;
                }
                return slow.data;
            }
            public static void main(String[] args) {
                MiddleLL2 list = new MiddleLL2();
                list.add(7);
                list.add(4);
                list.add(3);
                list.add(1);
                list.add(0);
                System.out.println("middle element :- " + list.LLmid());

            }
        }
    

    

