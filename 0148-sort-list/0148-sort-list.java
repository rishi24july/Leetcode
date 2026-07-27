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
    public ListNode  merge(ListNode head1,ListNode head2){
       ListNode dummy=new ListNode (52);
       ListNode t1=head1;
       ListNode t2=head2;
       ListNode t=dummy;
       while (t1!=null&&t2!=null){
        if(t1.val>t2.val){
            t.next=t2;
            t2=t2.next;
        }else{
            t.next=t1;
            t1=t1.next;
        }
        t=t.next;
       }
       if(t1==null){
        t.next=t2;
       }else{
        t.next=t1;
       }
       return dummy.next;
    } 
    public ListNode sortList(ListNode head) {
         if(head==null||head.next==null) return head;
        ListNode slow=head;
        ListNode fast=head;
        while(fast.next!=null&&fast.next.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        ListNode head2=slow.next;
        slow.next=null;
        
        head=sortList(head);
       head2= sortList(head2);
        return merge(head,head2);
    }
}