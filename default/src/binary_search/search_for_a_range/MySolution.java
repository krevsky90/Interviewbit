package binary_search.search_for_a_range;

import java.util.ArrayList;
import java.util.List;

/**
 * the idea is to re-use solution of Interviewbit\default\src\binary_search\count_element_occurence\Solution.java
 */
public class MySolution {
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public ArrayList<Integer> searchRange(final List<Integer> A, int B) {
        ArrayList<Integer> result = new ArrayList<Integer>();

        int first = searchFirst(A, B, true);
        if (first < 0) {
            result.add(-1);
            result.add(-1);
            return result;
        }

        int last = searchFirst(A, B, false);

        result.add(first);
        result.add(last);

        return result;
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
}
