public class AddTwoNumbers {
    public static void main(String[] args) {
    
        ListNode num1 = new ListNode(2);
        num1.next = new ListNode(4);
        num1.next.next = new ListNode(3);
        

        ListNode num2 = new ListNode(5);
        num2.next = new ListNode(6);
        num2.next.next = new ListNode(4);

        ListNode result = Solution.addTwoNumbers(num1, num2);
        
        while (result != null) {
            System.out.print(result.val);
            result = result.next; 
        }
    }
}

class ListNode{
    int val;
    
    //This Store the next Reference Value!!

    ListNode next; //By Default its Null !!
    
    //Which tells about head Pointer !!
    //A Default Contructure with no Arguments !!
    ListNode() {};
    ListNode(int val){
        this.val = val;
    }
    ListNode(int val , ListNode next){
        this .val=val;
        this.next=next;
    }

}


class Solution {
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(0);
        ListNode current = dummy;
        int carry = 0;
        
        while (l1 != null || l2 != null || carry != 0) {
            int n1 = (l1 != null) ? l1.val : 0;
            int n2 = (l2 != null) ? l2.val : 0;
            
            int sum = n1 + n2 + carry;
            carry = sum / 10;
            current.next = new ListNode(sum % 10);
            current = current.next;
            
            if (l1 != null) l1 = l1.next;
            if (l2 != null) l2 = l2.next;
        }
        
        return dummy.next; 
    }
}

