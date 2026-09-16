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
    public ListNode removeNthFromEnd(ListNode head, int n) {
       ListNode faltu = new ListNode();
        faltu.next=head;
          ListNode t2=faltu;
        ListNode t1=faltu;
        for(int i=0;i<=n;i++){
            t1=t1.next;
        }
        while(t1!=null){
            t2=t2.next;
            t1=t1.next;
        }
        t2.next=t2.next.next;
    return faltu.next;
    }
   
}