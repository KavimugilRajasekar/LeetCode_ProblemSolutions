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
    public ListNode middleNode(ListNode head) {
     int count = 0;
     ListNode temp = head ;
     while(temp != null){
        count++;
        temp = temp.next;
     }   
    if( count % 2 == 0){
        count = count / 2 + 1;
        temp = head;
        while(temp != null && count != 1){
            temp = temp.next;
            count--;
        }
        return temp;
    }else{
        count = (int) count / 2 + 1 ;
        temp = head;
        while(temp != null && count != 1){
            temp = temp.next;
            count--;
        }
        return temp;
    }
     
    }
}