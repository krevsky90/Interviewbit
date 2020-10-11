package binary_search.count_element_occurence;

import java.util.Arrays;
import java.util.List;

/**
 * {1, 1, 3, 3, 5, 5, 5, 5, 5, 9, 9, 11}
 *  0  1  2  3  4  5  6  7  8  9  10 11
 */

public class Solution {
    public static void main(String[] args) {
        List<Integer> A = Arrays.asList(1, 1, 3, 3, 5, 5, 5, 5, 5, 9, 9, 11);
        int B = 5;
        int res = findCount(A, B);
    }

    public static int searchFirst(final List<Integer> A, int B, boolean searchFirst) {
        int start = 0;
        int end = A.size() - 1;
        int result = -1;
        while (start <= end) {
            int mid = (end + start) / 2;
            if (A.get(mid) == B) {
                result = mid;
                if (searchFirst) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else if (A.get(mid) > B) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }

        return result;
    }

    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public static int findCount(final List<Integer> A, int B) {
        int left = searchFirst(A, B, true);
        int res = 0;
        if (left == -1) {
            return res;
        } else {
            int right = searchFirst(A, B, false);
            res = right - left + 1;
        }

        return res;
    }
}