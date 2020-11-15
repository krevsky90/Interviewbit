package binary_search.rotated_sorted_array_search.java.fastest;

import java.util.List;

/**
 * = lightweight
 */
public class Solution {
    // DO NOT MODIFY THE LIST
    public int search(final List<Integer> a, int b) {
        return findRec(a, b, 0, a.size() - 1);
    }

    private int findRec(final List<Integer> a, int n, int low, int high) {
        if (low > high)
            return -1;

        int mid = low + (high - low) / 2;

        if (a.get(mid) == n) {
            return mid;
        } else if ((a.get(low) < a.get(mid) && (a.get(mid) > n && a.get(low) <= n))
                || (a.get(low) > a.get(mid) && (n < a.get(mid) || n >= a.get(low))) //not obvious
        ) {
            return findRec(a, n, low, mid - 1);
        } else if (((a.get(mid) < n && n <= a.get(high)) && a.get(high) > a.get(mid))
                || (a.get(high) < a.get(mid) && (n > a.get(mid) || n <= a.get(high)))   //not obvious
        ) {
            return findRec(a, n, mid + 1, high);
        } else {
            return -1;
        }

    }
}