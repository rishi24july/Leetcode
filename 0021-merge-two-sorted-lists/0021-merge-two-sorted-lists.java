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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode a=list1;
        ListNode b=list2;
        ListNode dummy=new ListNode(0);
        ListNode temp=dummy;
        while(a!=null&&b!=null){
            if(a.val>b.val){
                temp.next=b;
                b=b.next;
            }else{
                temp.next=a;
                a=a.next;
            }
            temp=temp.next;
        }
        if(a==null){
            temp.next=b;
        }else{
            temp.next=a;
        }
        return dummy.next;
    }
}