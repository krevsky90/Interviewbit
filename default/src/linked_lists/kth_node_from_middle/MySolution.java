package linked_lists.kth_node_from_middle;

import linked_lists.ListNode;

/**
 * A = 3 -> 4 -> 7 -> 5 -> 6 -> 1 6 -> 15 -> 61 -> 16
 * B = 3
 * Answer: 4
 * <p>
 * A = 1 -> 14 -> 6 -> 16 -> 4 -> 10
 * B = 10
 * Answer: 14
 * <p>
 * A = 1 -> 14 -> 6 -> 16 -> 4 -> 10
 * B = 2
 * Answer: -1
 **/

/**
 * = java.fastest
 */
public class MySolution {
    public int solve(ListNode A, int B) {
        int len = 0;
        ListNode current = A;

        while (current != null) {
            len++;
            current = current.next;
        }

        int mid = len / 2 + 1;
        int len2 = mid - B - 1;
        if (len2 < 0) {
            return -1;
        }

        current = A;
        while (len2 > 0) {
            len2--;
            current = current.next;
        }

        return current.val;
    }
}
