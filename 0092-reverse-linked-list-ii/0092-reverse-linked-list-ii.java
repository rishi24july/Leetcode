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
     public ListNode reverse(ListNode head) {
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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if(head==null|| head.next==null||left==right) return head;
     ListNode dummy = new ListNode(0);
    dummy.next = head;
    ListNode temp = dummy;

    for(int i=1;i<left;i++){
        temp = temp.next;   // temp ab kabhi null nahi hoga, kyunki dummy se start kiya
    }

    ListNode t1 = temp.next;
    ListNode t2 = t1;
    for(int i=left;i<right;i++){
        t2 = t2.next;
    }

    ListNode temp2 = t2.next;
    t2.next = null;

    t1 = reverse(t1);

    temp.next = t1;              // dummy/prev node se naya head jodo
    while(t1.next != null) t1 = t1.next;
    t1.next = temp2;
    return dummy.next;
    }
   
}