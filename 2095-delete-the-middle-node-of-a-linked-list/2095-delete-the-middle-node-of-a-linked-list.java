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
    public ListNode deleteMiddle(ListNode head) {
        if(head.next==null) return null;
        ListNode top=head;
        int count=0;
        while(top!=null){
            count++;
            top=top.next;
        }
        int mid=(count/2);
        top=head;
        for(int i=0;i<mid-1;i++){
            top=top.next;
        }
        top.next=top.next.next;
        return head;
    }
}