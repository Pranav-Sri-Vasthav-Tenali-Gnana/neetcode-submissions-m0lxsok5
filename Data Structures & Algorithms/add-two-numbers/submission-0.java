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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode curr = new ListNode();
        ListNode dummy = curr;

        int carry = 0;
        while(l1 != null && l2 != null){
            int sum = l1.val + l2.val + carry;
            int digit = sum % 10;
            carry = sum / 10;
            curr.next = new ListNode(digit);
            curr = curr.next;
            l1 = l1.next; l2 = l2.next;
        }

        ListNode remaining = (l1!=null) ? l1 : l2;

        while(remaining!=null){
            int sum = remaining.val + carry;
            int digit = sum % 10;
            carry = sum / 10;
            curr.next = new ListNode(digit);
            curr = curr.next;
            remaining = remaining.next;
        }

        if(carry > 0){
            curr.next = new ListNode(carry);
        }

        return dummy.next;
    }
}