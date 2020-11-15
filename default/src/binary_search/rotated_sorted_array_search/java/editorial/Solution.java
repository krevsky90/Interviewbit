package binary_search.rotated_sorted_array_search.java.editorial;

import java.util.List;

public class Solution {
    // DO NOT MODIFY THE LIST
    public int search(final List<Integer> a, int b) {
        int i = 0;
        int j = a.size() - 1;

        while (i <= j) {
            int mid = (i + j) / 2;

            if (a.get(mid) == b)
                return mid;
            if (a.get(mid) >= a.get(i)) {
                if (b >= a.get(i) && b < a.get(mid)) {
                    j = mid - 1;
                } else {
                    i = mid + 1;
                }
            } else {
                if (b > a.get(mid) && b <= a.get(j)) {
                    i = mid + 1;
                } else {
                    j = mid - 1;
                }
            }
        }

        return -1;
    }
}