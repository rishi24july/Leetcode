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
    public ListNode reverseList(ListNode head) {
        if(head==null||head.next==null) return head;
                ListNode t1=null;
        ListNode t2=head;
       ListNode t3=head.next;
      while(t2!=null){
          t2.next=t1;
        t1=t2;
        t2=t3;
       if(t3!=null) t3=t3.next;
      } 
      return t1;
    }
    
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        // l1=reverseList(l1);
        //  l2=reverseList(l2);
         
         ListNode t1=l1;
         ListNode t2=l2;
        ListNode dummy = new ListNode(0);
ListNode curr = dummy;
int carry = 0;

while (t1 != null || t2 != null || carry != 0) {
    int sum = carry;
    if (t1 != null) {
        sum += t1.val;
        t1 = t1.next;
    }
    if (t2 != null) {
        sum += t2.val;
        t2 = t2.next;
    }
    carry = sum / 10;
    curr.next = new ListNode(sum % 10);
    curr = curr.next;
}

       return dummy.next;  
    }
} 