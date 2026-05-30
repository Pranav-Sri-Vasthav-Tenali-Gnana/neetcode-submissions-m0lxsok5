public class Solution {
    public Node copyRandomList(Node head) {
        if (head == null) return null;
        
        // Step 1
        Node curr = head;
        while (curr != null) {
            Node new_node = new Node(curr.val);
            new_node.next = curr.next;
            curr.next = new_node;
            curr = new_node.next;
        }
        
        // step 2
        curr = head;
        while (curr != null) {
            if (curr.random != null) {
                curr.next.random = curr.random.next;
            }
            curr = curr.next != null ? curr.next.next : null;
        }
        
        // Step 3
        Node old_head = head;
        Node new_head = head.next;
        Node curr_old = old_head;
        Node curr_new = new_head;
        
        while (curr_old != null) {
            curr_old.next = curr_old.next.next;
            curr_new.next = curr_new.next != null ? curr_new.next.next : null;
            curr_old = curr_old.next;
            curr_new = curr_new.next;
        }
        
        return new_head;
    }
}