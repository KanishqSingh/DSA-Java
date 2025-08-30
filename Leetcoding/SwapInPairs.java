package Leetcoding;

public class SwapInPairs {
    public ListNode swapPairs(ListNode head) {

    
        if(head == null){
            return null;
        }

        ListNode dummy = new ListNode(-1);
        ListNode current = dummy;

        dummy.next = head;

        while(current.next != null && current.next.next != null){
            ListNode first = current.next;
            ListNode second = current.next.next;

            first.next = second.next;
            second.next = first;
            current.next = second;

            current = first;
        }

        return dummy.next;


        
    }
    
}


    