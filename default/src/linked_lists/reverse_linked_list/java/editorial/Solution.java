package linked_lists.reverse_linked_list.java.editorial;

class ListNode {
    public int val;
    public ListNode next;

    ListNode(int x) {
        val = x;
        next = null;
    }
}

public class Solution {
    public ListNode reverseList(ListNode A) {
        ListNode rev = null;
        ListNode temp = A;
        while (A != null) {
            temp = A;
            A = A.next;
            temp.next = rev;
            rev = temp;
            //System.out.print(rev.val);
        }
        return rev;
    }
}