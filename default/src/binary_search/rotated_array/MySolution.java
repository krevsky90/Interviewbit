package binary_search.rotated_array;

import java.util.List;

/**
 * Based on https://www.youtube.com/watch?v=4qjprDkJrjY&feature=emb_err_woyt
 * but incorrect (don't have an idea why...)
 */
public class MySolution {
    // DO NOT MODIFY THE LIST
    public int findMin(final List<Integer> a) {
        int len = a.size();
        int low = 0;
        int high = len - 1;
        while (low <= high) {
            if (a.get(low) <= a.get(high)) {
                return low;
            }

            int mid = (high + low) / 2;
            //check whether mid element is pivot (i.e. is the answer)
            int prevIndex = (mid + len - 1) % len;
            int nextIndex = (mid + 1) % len;

            if (a.get(prevIndex) >= a.get(mid) && a.get(nextIndex) >= a.get(mid)) {
                return mid;
            } else if (a.get(mid) >= a.get(low)) {
                low = mid + 1;
            } else if (a.get(mid) <= a.get(high)) {
                high = mid - 1;
            }
        }

        return -1;
    }
}
