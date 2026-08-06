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
    public ListNode mergeNodes(ListNode head) {
        if(head==null||head.next==null||head.next.next==null) return null;
        ListNode temp=head;
        while(temp!=null){
            if(temp.next.val!=0){
                temp.val=temp.val+temp.next.val;
                temp.next=temp.next.next;
            }else if(temp.next.val==0){
                temp=temp.next.next;
                //  temp=temp.next;
            }
            
        }
        temp=head;
        if(temp.next!=null){
        while (temp!=null){
            if(temp.next.val==0){
                temp.next=temp.next.next;
            }
            temp=temp.next;
        }
       }
        return head;
    }
}