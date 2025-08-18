
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

public class RemoveNthFromLast {

     public ListNode removeNthFromEnd(ListNode head, int n) {

        ListNode temp = head;
        ListNode temp1 = head;
        int count =0;
        while(temp != null){
            count++;
            temp = temp.next;
        }

          if (n == count) {
            return head.next;
        }

        int realDigit = count - n;
        int i;
        for(i=1;i<realDigit;i++){
            temp1 = temp1.next;
        }

        temp1.next = temp1.next.next;


        return head;

     }
}

