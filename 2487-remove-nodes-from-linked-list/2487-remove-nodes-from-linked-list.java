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
    public ListNode removeNodes(ListNode head) {
        Stack<ListNode> st=new Stack<>();
        ListNode temp=head;
        while(temp!=null){
          
            while(!st.isEmpty() &&st.peek().val<temp.val){
           
            if(st.size()==0){
                break;
            }
             st.pop();
            
           
            }
            st.push(temp);
             temp=temp.next;
           
           }
           ListNode h2=null;
           while(st.size()!=0){
            ListNode n=st.pop();
            n.next=h2;
            h2=n;
        }
 return h2;
    }
}