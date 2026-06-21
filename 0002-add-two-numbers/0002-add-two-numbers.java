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
 import java.math.BigInteger;
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        List<Integer> l=new LinkedList<>();
        StringBuilder s1=new StringBuilder();
        StringBuilder s2=new StringBuilder();
        ListNode dl1=l1;
        ListNode dl2=l2;
        while(dl1!=null){
            s1.append(dl1.val);
            dl1=dl1.next;
        }
        while(dl2!=null){
            s2.append(dl2.val);
            dl2=dl2.next;
        }
        BigInteger num1 = new BigInteger(s1.reverse().toString());
        BigInteger num2 = new BigInteger(s2.reverse().toString());
        BigInteger num = num1.add(num2);
        if(num.equals(BigInteger.ZERO)) return new ListNode(0);
        ListNode ll=new ListNode(0);
        ListNode fake=ll;
        while(num.compareTo(BigInteger.ZERO) > 0){
            fake.next=new ListNode(num.mod(BigInteger.TEN).intValue());
            fake=fake.next;
            num=num.divide(BigInteger.TEN);
        }return ll.next;
    }
}