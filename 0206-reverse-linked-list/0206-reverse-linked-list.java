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
}