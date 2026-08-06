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
    public void reorderList(ListNode head) {
        int size=0;
        ListNode temp=head;
        Stack<ListNode> st=new Stack<>();
         Stack<ListNode> st2=new Stack<>();
        while(temp!=null){
            size++;
            temp=temp.next;
        }
        temp=head;
        if(size%2==0){
            size=size/2;
        }
        if(size%2!=0){
            size=size/2;
            size++;
        }
        for (int i=1;i<=size;i++){
            st.push(temp);
            temp=temp.next;
        }
        while(st.size()>0){
            st2.push(st.pop());
        }
        while(temp!=null){
            st.push(temp);
            temp=temp.next;
        }
        ListNode dummy= new ListNode(0);
        temp=dummy;
        while(st.size()>0&&st2.size()>0){
            temp.next=st2.pop();
            temp=temp.next;
            temp.next=st.pop();
            temp=temp.next;
        }
       // temp.next=null;
        while(st2.size()>0){
            temp.next=st2.pop();
            temp=temp.next;
        }
        temp.next=null;
                                           
       head= dummy.next;
    }
}