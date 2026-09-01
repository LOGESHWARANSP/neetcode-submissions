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
    public Node copyRandomList(Node head) {
        
        Node curr=head;
        Node prev=null;
        Node res=null;
        Map<Node,Node>nodemap=new HashMap<>();
        while(curr!=null){
            Node newnode=new Node(curr.val);
            nodemap.put(curr,newnode);
            if(prev==null) res=newnode;
            else prev.next=newnode;

            prev=newnode;
            curr=curr.next;
        }
        Node temp=res;
        curr=head;
        while(curr!=null){
            temp.random=nodemap.get(curr.random);
            temp=temp.next;
            curr=curr.next;
        }
        return res;
        
    }
}
