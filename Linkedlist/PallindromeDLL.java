package Linkedlist;

class Node {
    int data;
    Node prev, next;

    public Node(int data) {
        this.data = data;
        this.prev = this.next = null;
    }
}

class PallindromeDLL {
    private Node head, tail;

    public void insert(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        newNode.prev = tail;
        tail = newNode;
    }

    public boolean checkPallindrome() {
        Node temp = head;
        Node temp2 = tail;

        while (temp != null && temp2 != null && temp != temp2 && temp.prev != temp2) {
            if (temp.data != temp2.data) {
                return false;
            }
            temp = temp.next;
            temp2 = temp2.prev;
        }

        return true;
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

    public static void main(String[] args) {
        PallindromeDLL list = new PallindromeDLL();

        list.insert(1);
        list.insert(2);
        list.insert(3);
        list.insert(2);
        list.insert(1);

     

        System.out.println("Length: " + list.length());

        System.out.println("Is Palindrome: " + (list.checkPallindrome() ? "true" : "false"));

      
    }
}
