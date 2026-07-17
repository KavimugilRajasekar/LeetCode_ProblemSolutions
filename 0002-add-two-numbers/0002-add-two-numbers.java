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
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(0);
        ListNode current = dummy;
        int carry = 0;

        while(l1 != null || l2 != null || carry != 0){
            int n1 = (l1 != null)?l1.val : 0 ; // If a Iteration have a L1 as Null then it doesnt have a Val so Error will happens !!
            int n2 = (l2 != null)?l2.val : 0 ; // Same Logic Goes Here !!!! 

            int sum = n1 + n2 + carry;
            carry = sum / 10;

            current.next = new ListNode(sum % 10); // Only Takes the Even Position of the Sum !!
            current = current.next;

            if(l1 != null) l1 = l1.next ;
            if(l2 != null) l2 = l2.next ;
        }

        return dummy.next;
    }
}