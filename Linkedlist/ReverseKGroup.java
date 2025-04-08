package Linkedlist;

class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}

public class ReverseKGroup {
    
    public static ListNode reverseKGroup(ListNode head, int k) {
        // Count the number of nodes
        int count = 0;
        ListNode ptr = head;
        while (ptr != null) {
            count++;
            ptr = ptr.next;
        }

       
        ListNode dummy = new ListNode(0);
        dummy.next = head;

        ListNode prevGroupEnd = dummy;

        while (count >= k) {
            ListNode groupStart = prevGroupEnd.next;
            ListNode curr = groupStart.next;

            for (int i = 1; i < k; i++) {
                groupStart.next = curr.next;
                curr.next = prevGroupEnd.next;
                prevGroupEnd.next = curr;
                curr = groupStart.next;
            }

            prevGroupEnd = groupStart;
            count -= k;
        }

        return dummy.next;
    }

  
    public static void printList(ListNode head) {
        while (head != null) {
            System.out.print(head.val + " → ");
            head = head.next;
        }
        System.out.println("null");
    }

    
    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);
        head.next.next.next.next.next = new ListNode(6);

        int k = 3;
        ListNode result = reverseKGroup(head, k);
        printList(result);  
    }
}
