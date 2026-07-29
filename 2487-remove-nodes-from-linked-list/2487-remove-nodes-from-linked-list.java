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
    public ListNode reverse(ListNode head){
         if(head==null||head.next==null) return head;
        ListNode prev=null;
        ListNode curr=head;
        ListNode next=null;
        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        head=prev;
        return head;
    }
    public ListNode removeNodes(ListNode head) {
     ListNode temp=reverse(head);
     ListNode i=temp;
     ListNode j=null;
     if(i.next!=null)  j=i.next;
     while(j!=null){
        if(j.val<i.val){
            j=j.next;
        }else if(j.val>=i.val){
            i.next=j;
            j=j.next;
            i=i.next;
        }
     }
     i.next=j;
     head=reverse(temp);
     return head;
    }
}