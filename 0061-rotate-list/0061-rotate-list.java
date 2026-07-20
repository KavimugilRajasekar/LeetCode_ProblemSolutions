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
    public ListNode rotateRight(ListNode head, int k) {
        // Empty/1-Node Head Or Rotation(K) == 0 then return the Head as it is ! 
        if (head == null || head.next == null || k == 0) {
            return head;
        }

        int length = 1;
        ListNode tail = head;
        while (tail.next != null) {
            length++;
            tail = tail.next;
        }

        k = k % length;
        if (k == 0) {
            return head; // Even it says No rotation !! 
        }

        // Step 3: Find the new tail (node at position length - k - 1)
        // Just Remember that New Tail can be Find by 'Length - K' Logic !! 
        ListNode newTail = head;
        for (int i = 0; i < length - k - 1; i++) {
            newTail = newTail.next;
        }

        // Step 4: Rotate the list
        ListNode newHead = newTail.next;
        newTail.next = null;
        tail.next = head;

        return newHead;
    }
}