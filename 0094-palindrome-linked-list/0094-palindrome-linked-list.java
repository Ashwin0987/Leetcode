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
    public boolean isPalindrome(ListNode head) {
        if(head.next==null)
        return true;
        ListNode fast=head,slow=head,sh=null,fh=head;
        while(fast.next!=null&&fast.next.next!=null){
        slow=slow.next;
           fast=fast.next.next;
       }sh=slow.next;
        ListNode prev=null,curr=sh,next=null;
        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }sh=prev;
        while(fh!=null&&sh!=null){
            if(fh.val!=sh.val)
            return false;
            fh=fh.next;
            sh=sh.next;
        }return true;
    }
}