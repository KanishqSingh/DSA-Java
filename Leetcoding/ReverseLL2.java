package Leetcoding;

public class ReverseLL2 {

    public static void main(String[] args) {

        
     if (head == null || left == right) {
            return head; // No changes needed
        }

        // Step 1: Create a dummy node before head
        ListNode dummy = new ListNode(0);
        dummy.next = head;

        // Step 2: Move prev to node before 'left'
        ListNode prev = dummy;
        for (int i = 1; i < left; i++) {
            prev = prev.next;
        }

        // Step 3: Start reversing the sublist
        ListNode curr = prev.next;   // First node of sublist
        ListNode next = null;

        for (int i = 0; i < right - left; i++) {
            next = curr.next;
            curr.next = next.next;
            next.next = prev.next;
            prev.next = next;
        }

        return dummy.next;
    }
        
    } 
    

 


    

