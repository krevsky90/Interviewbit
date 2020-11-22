package linked_lists.kth_node_from_middle.java.editorial;

import linked_lists.ListNode;

public class Solution {
    public int solve(ListNode A, int B) {
        ListNode fast = A;
        ListNode slow = A;
        ListNode kth = A;
        // This pointer will start moving when the slow pointer has moved k steps forward.
        // Then when the slow is in the middle. kth node's position will be the answer.
        int k = 0;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            k = k + 1;
            if (k > B) {
                kth = kth.next;
            }
        }
        if (k < B) {
            return -1;
        }
        return kth.val;
    }
}
