package binary_search.rotated_array.java.lightweight;

import java.util.List;

/*
 * This is NOT binary search!
 */
public class Solution {
    // DO NOT MODIFY THE LIST
    public int findMin(final List<Integer> a) {
        int size = a.size();
        if (a.get(0) <= a.get(size - 1))
            return a.get(0);
        if (size == 1)
            return a.get(0);
        int count = 1;
        for (int i = 0; i < size; i++) {
            if (a.get(i) < a.get(i + 1))
                count++;
            else
                break;
        }
        return a.get(count);
    }
}