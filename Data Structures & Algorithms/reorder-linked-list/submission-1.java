class Solution {
    public void reorderList(ListNode head) {

        ListNode midnode=midNode(head);
        ListNode nexttomid=midnode.next;
        midnode.next=null;
        ListNode p1=head;
        ListNode p2=reverseList(nexttomid);
        ListNode p1next;
        while(p1!=null && p2!=null){
            p1next=p1.next;
            p1.next=p2;
            p1=p2;
            p2=p1next;
        }
        
    }
    public ListNode midNode(ListNode head){
        ListNode fast=head;
        ListNode slow=head;
        while(fast.next!=null && fast.next.next!=null){
            fast=fast.next.next;
            slow=slow.next;
        }
        return slow;
    }
    public ListNode reverseList(ListNode head){
        ListNode curr=head;
        ListNode prev=null;
        while(curr!=null){
            ListNode next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next; 
        }
        return prev;
    }

}
