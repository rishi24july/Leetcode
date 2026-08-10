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
        ListNode curr=head;
        ListNode prev=null;
        ListNode next=null;
        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        return prev;
    }
    public int size(ListNode head){
         int size=0;
         ListNode temp=head;
        while(temp!=null){
            size++;
            temp=temp.next;
        }
        return size;
    }
    public void rotate(ListNode head,int k){
        int n=size(head);
        if(k>n) return;
        ListNode temp=head;
        ListNode t2=head;
        for(int i=1;i<k;i++){
            temp=temp.next;
        }
        ListNode t1=temp.next;
        temp.next=null;
       t2= reverse(t2);
      while(temp.next!=null) temp=temp.next;
      temp.next=t1;
      rotate(t1,k);
    }
    public ListNode reverseKGroup(ListNode head, int k) {
      
       ListNode temp = head;
       int count = 0;
       while (temp != null && count < k) {
           temp = temp.next;
           count++;
       }
       if (count < k) return head;  // leftover, don't reverse

       ListNode prev = reverseKGroup(temp, k);  // recursively process rest first
       ListNode curr = head;
       ListNode next = null;
       count = 0;
       while (count < k) {
           next = curr.next;
           curr.next = prev;
           prev = curr;
           curr = next;
           count++;
       }
       return prev;
       
        
    }
}