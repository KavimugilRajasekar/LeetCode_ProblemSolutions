/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        // Detect Only hasCycle or Not !! 
        while(fast != null && fast.next != null){
            slow = slow.next ;
            fast = fast.next.next;

            if(slow == fast){
             // Step 2: Find the beginning of the cycle
                ListNode p = head;

                while (p != slow) {
                    p = p.next;
                    slow = slow.next;
                }

                return p;
            }
        }
        return  null;
    }
}