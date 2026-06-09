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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode cur=head,curr=head;
        int c=0;
        while(curr!=null){
            curr=curr.next;
            c++;
        }
        if(c==n)
        return head.next;
        n=c-n;
        for(int i=0;i<n-1;i++){
            cur=cur.next;
        }
        cur.next=cur.next.next;
        return head;
    }
}