/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copy(Node head){
          Node dummy=new Node (54);
        Node t1=head;
        Node t2=dummy;
        while(t1!=null){
            Node temp=new Node(t1.val);
            t2.next=temp;
            t2=t2.next;
            t1=t1.next;
        }
        return dummy.next;

    }
    public void merge(Node head1,Node head2){
         Node t=head1;
         Node t1=head1;
         Node t2=head2;
        
        while(t2!=null){
            t1=t1.next;
            t.next=t2;
            t=t.next;
            t2=t2.next;
            t.next=t1;
            t=t.next;
        }
    }
    public void connect(Node head1){
        Node t1 =head1;
       
        while(t1!=null){
            if(t1.random==null) t1.next.random=null;
            else t1.next.random=t1.random.next;
            t1=t1.next.next;
        }

    }
    public void split(Node head1,Node head2){
        Node t1=head1;
        Node t2=head2;
        while(t1!=null&&t2!=null){
            if(t2.next==null) {
                t1.next=null;
                break;
            }else{
            t1.next=t1.next.next;
            t2.next=t2.next.next;
            t1=t1.next;
            t2=t2.next;
            }
        }
    }
    public Node copyRandomList(Node head1) {
         Node head2=copy(head1);
          merge(head1,head2);
          connect(head1);
          split(head1,head2);
      
       return head2;
    }
}