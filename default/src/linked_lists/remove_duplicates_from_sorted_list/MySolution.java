package linked_lists.remove_duplicates_from_sorted_list;

import linked_lists.ListNode;

/**
 * 1 -> 2 -> 3 -> 3 -> 3 -> 4 -> 5
 **/
public class MySolution {
    public ListNode deleteDuplicates(ListNode A) {
        ListNode current = A;
        ListNode next1 = current.next != null ? current.next : null;
        while (next1 != null) {
            if (current.val != next1.val) {
                //this row doesn't change anything in case if current and next1 are neighbour nodes
                //but creates proper link if there are duplicated nodes between current and next1
                current.next = next1;

                //jump to next1 node
                current = next1;
                //update next1 var to look at the next of next node
                next1 = current.next;
            } else {
                //just go to the next node to check whether it is duplicate or not
                next1 = next1.next;
            }
        }

        //for case if the last N elements have the same values. i.e. 1-2-3-3-3. last current node is 3 (with index = 2)
        current.next = null;

        return A;
    }
}