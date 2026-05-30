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
    public void reorderList(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }

        ListNode node = null;
        ListNode secondStart = slow.next;
        slow.next = null;
        while(secondStart != null){
            ListNode temp = secondStart.next;
            secondStart.next = node;
            node = secondStart;
            secondStart = temp;
        }

        ListNode temp = null;
        while(head!=null && node!=null){
            temp = head.next;
            ListNode nextNode = node.next;
            head.next = node;
            node.next = temp;
            head = temp;
            node = nextNode;
        }

    }
}