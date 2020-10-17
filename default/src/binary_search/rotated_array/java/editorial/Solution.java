package binary_search.rotated_array.java.editorial;

import java.util.List;

public class Solution {
    // DO NOT MODIFY THE LIST
    public int findMin(final List<Integer> a) {
        int n = a.size();
        if (n == 0) {
            return -1;
        }

        int left = 0;
        int right = n - 1;
        while (left < right) {
            int mid = (right + left) / 2;
            if (a.get(mid) < a.get(right)) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }
        return a.get(left);
    }
}