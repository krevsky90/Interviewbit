package linked_lists.reverse_linked_list;

/**
 * Definition for singly-linked list.
 * class ListNode {
 * public int val;
 * public ListNode next;
 * ListNode(int x) { val = x; next = null; }
 * }
 */

class ListNode {
    public int val;
    public ListNode next;

    ListNode(int x) {
        val = x;
        next = null;
    }
}

public class MySolution {
    public ListNode reverseList(ListNode A) {
        ListNode current = A;
        ListNode prev = null;
        ListNode next = null;
        while (current != null) {
            next = current.next;
            current.next = prev;
            //traverse throw the LinkedList
            prev = current;
            current = next;
        }

        return prev;    //since head = prev
    }
}
