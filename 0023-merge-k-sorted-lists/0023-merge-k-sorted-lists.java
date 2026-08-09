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
    public ListNode merge(ListNode list1,ListNode list2){
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
    public ListNode mergeKLists(ListNode[] lists) {
        if(lists.length==0) return null;
        int n=lists.length;
        ArrayList<ListNode> arr=new ArrayList<>();
        for(int i=0;i<n;i++){
            arr.add(lists[i]);
        }
        
        
        while(arr.size()>1){
            ListNode i=arr.get(arr.size()-1);
            arr.remove(arr.size()-1);
            ListNode j=arr.get(arr.size()-1);
             arr.remove(arr.size()-1);
            ListNode k=merge(i,j);
            arr.add(k);

        }
        return arr.get(0);
    }
}