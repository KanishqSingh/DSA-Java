package Linkedlist;

class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
    }
}

public class ModifyLinkedList {


    private static ListNode reverse(ListNode head) {

        ListNode prev = null;
        while (head != null) {
            ListNode nextNode = head.next;
            head.next = prev;
            prev = head;
            head = nextNode;
        }
        return prev;

    }


    
    public static void modifyHalf(ListNode head){
        if(head == null || head.next == null) return;

        ListNode slow = head , fast = head;

        while(fast != null && fast.next !=null && fast.next.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        // System.out.println(slow.val);
        ListNode secondhalf = reverse(slow.next);
        ListNode revhead = secondhalf;
        ListNode first = head;

        while (secondhalf != null) {
            first.val = secondhalf.val - first.val;
            first = first.next;
            secondhalf = secondhalf.next;
        }
        slow.next = reverse(revhead);

    }

    public static void printList(ListNode head) {
        while (head != null) {
            System.out.print(head.val + " ");
            head = head.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(10);
        head.next = new ListNode(4);
        head.next.next = new ListNode(5);
        head.next.next.next = new ListNode(3);
        head.next.next.next.next = new ListNode(3);
        head.next.next.next.next.next = new ListNode(2);
        // head.next.next.next.next.next.next = new ListNode(1);

        System.out.print("Original List: ");
        printList(head);

        modifyHalf(head);

        System.out.print("Modified List: ");
        printList(head);
    }
}
