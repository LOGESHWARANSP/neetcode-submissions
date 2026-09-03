class Solution {
    public ListNode reverseKGroup(ListNode head, int k) {

        ListNode dummy=new ListNode(0);
        ListNode prev=dummy;
        ListNode curr=head;
        ListNode tail=null;
        

        while(curr!=null){
            tail=curr;
            int index=0;
        while(curr!=null && index < k){
            curr=curr.next;
            index++;
        }
        if(index>=k){
            prev.next=reverseList(tail,k);
            prev=tail;
        }
        else{
            prev.next=tail;
        }
        }
        return dummy.next;
        
        
    }
    public ListNode reverseList(ListNode head,int k){

        ListNode curr=head;
        ListNode prev=null;
        while(curr!=null && k-->0){
            ListNode temp=curr.next;
            curr.next=prev;
            prev=curr;
            curr=temp;
        }
        return prev;

    }
}
