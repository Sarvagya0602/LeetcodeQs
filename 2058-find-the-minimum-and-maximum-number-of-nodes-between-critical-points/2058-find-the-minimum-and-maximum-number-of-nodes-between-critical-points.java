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
    public int[] nodesBetweenCriticalPoints(ListNode head) {
        int[] cpindex=new int[100000];
        int i=1,j=0;
        ListNode prev=head,curr=head.next,nxt=head.next.next;
        while(nxt!=null){
            if((prev.val<curr.val && curr.val>nxt.val) || (prev.val>curr.val && curr.val<nxt.val)) cpindex[j++]=i;

            nxt=nxt.next;
            curr=curr.next;
            prev=prev.next;
            i++;
        }
        int dif=Integer.MAX_VALUE;
        if (j<2) return new int[]{-1, -1};
        
                
        for(int k=1;k<j;k++){
            dif=Math.min(dif,cpindex[k]-cpindex[k-1]);
        }

        return new int[]{dif,cpindex[j-1]-cpindex[0]};
    }
}