package linked_lists.remove_duplicates_from_sorted_list.java.editorial;

import linked_lists.ListNode;

public class Solution {
    public ListNode deleteDuplicates(ListNode a) {
        ListNode current = a;
        while (current.next != null) {
            if (current.val == current.next.val) {
                //make link over the current.next element (which is duplicate)
                current.next = current.next.next;
            } else {
                //jump to the next element
                current = current.next;
            }
        }

        return a;
    }
}