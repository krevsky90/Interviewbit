package binary_search.sorted_insert_position.java.editorial;

import java.util.Arrays;
import java.util.List;

public class Solution {
    public static void main(String[] args) {
        List<Integer> a = Arrays.asList(1, 3);
        int b = 2;
        int result = searchInsert(a, b);
        System.out.println(result);
    }

    public static int searchInsert(List<Integer> a, int target) {
        int low = 0, high = a.size() - 1;
        if (a.get(low) > target) {
            return low;
        }
        if (a.get(high) < target) {
            return high + 1;
        }

        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (a.get(mid) == target) {
                return mid;
            }

            if (a.get(mid) < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return low;
    }
}