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
    public ListNode removeElements(ListNode head, int val) {
        ListNode dummy=new ListNode(54);
       
        ListNode t=dummy;
        t.next=head;
        while (t!=null){
            if(t.next==null) break;
            if(t.next.val==val){
                t.next=t.next.next;
            }else{
                t=t.next;
            }
        }
        if(dummy.next==null) return null;
        return dummy.next;
    }
}