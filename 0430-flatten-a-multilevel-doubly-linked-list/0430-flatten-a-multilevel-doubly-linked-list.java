/*
// Definition for a Node.
class Node {
    public int val;
    public Node prev;
    public Node next;
    public Node child;
};
*/

class Solution {
    public Node flatten(Node head) {
        Node t=head;
        while (t!=null){
            if(t.child==null){
                t=t.next;
            }else{
                Node c=t.next;
                t.next=t.child;
                t.child.prev=t;
                t.child=null;
                t=t.next;
               t= flatten(t);
               Node temp=t;
               while(t.next!=null) t=t.next;
                 t.next=c;
           if(c!=null) c.prev=t;
            t=t.next;
            }
           

        }
         return head;
    }
}