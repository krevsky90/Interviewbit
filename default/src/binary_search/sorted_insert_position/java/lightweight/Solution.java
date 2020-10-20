package binary_search.sorted_insert_position.java.lightweight;

import java.util.Arrays;
import java.util.List;

public class Solution {
    public static void main(String[] args) {
        List<Integer> a = Arrays.asList(0, 1, 3, 5);
        int b = 40;
        int result = searchInsert(a, b);
        System.out.println(result);
    }

    public static int searchInsert(List<Integer> a, int b) {
        int start = 0, mid = -1, end = a.size() - 1;
        while (start <= end) {
            mid = (start + end) / 2;
            if (a.get(mid) == b) {
                return mid;
            } else if (a.get(mid) < b) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        if (a.get(mid) < b) {
            return mid + 1;
        }

        return mid;
    }
}
