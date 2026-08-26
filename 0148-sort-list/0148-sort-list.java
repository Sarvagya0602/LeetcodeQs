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
    //merge 2 lists
    static ListNode mergeList(ListNode lefthead,ListNode righthead){
        if(righthead==null) return lefthead;
        if(lefthead==null) return righthead;
        if(lefthead.val<righthead.val){
            lefthead.next=mergeList(lefthead.next,righthead);
            return lefthead;
        } else {
            righthead.next=mergeList(lefthead,righthead.next);
            return righthead;
        }
    }
    public ListNode sortList(ListNode head) {
        if(head==null || head.next==null) return head;
        ListNode sp=head,fp=head.next;
        while(fp!=null && fp.next!=null){
            sp=sp.next;
            fp=fp.next.next;
        }
        ListNode rightNode=sortList(sp.next);
        sp.next=null;
        ListNode leftNode=sortList(head);
        return mergeList(leftNode,rightNode);
    }
}