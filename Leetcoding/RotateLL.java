package Leetcoding;

class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
        this.next = null;
    }
}

public class RotateLL {
    public ListNode rotateRight(ListNode head, int k) {
        if (head == null || head.next == null || k == 0) return head;

        ListNode temp = head;
        int length = 1;
        while (temp.next != null) {
            temp = temp.next;
            length++;
        }

        k = k % length;
        if (k == 0) return head;

        temp.next = head;
        int stop = length - k;
        temp = head;
        for (int i = 1; i < stop; i++) {
            temp = temp.next;
        }

        head = temp.next;
        temp.next = null;
        return head;
    }

    public static void printList(ListNode head) {
        ListNode temp = head;
        while (temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        RotateLL solution = new RotateLL();
        ListNode rotatedHead = solution.rotateRight(head, 2);

        System.out.println("Rotated List:");
        printList(rotatedHead);
    }

    
}



   