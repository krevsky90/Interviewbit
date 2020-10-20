package binary_search.sorted_insert_position;

import java.util.ArrayList;

/**
 * can be improved:
 * 1) move the following cases out of while loop:
 *      if(a.get(low)>target) return low;
 *      if(a.get(high)<target) return high+1;
 *  2) it is not necessary to check whether b is between mid and mid + 1 or mid - 1 and mid
 *      it is sufficient to end loop when low = high and return, for example, low index (see java.editorial.Solution.java)
 */
public class MySolution {
    public int searchInsert(ArrayList<Integer> a, int b) {
        int low = 0;
        int high = a.size() - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (a.get(mid) == b) {
                return mid;
            } else if (a.get(mid) > b) {
                if (mid == 0) {
                    //b is less than each element of a -> b is not in a
                    //and would be inserted in 0 position
                    return 0;
                } else if (mid > 0 && a.get(mid - 1) < b) {
                    //it means that b would be inserted between mid-1 and mid
                    //then the answer is mid
                    return mid;
                }

                high = mid - 1;
            } else if (a.get(mid) < b) {
                if (mid == a.size() - 1) {
                    //b is greater than each element of a -> b is not in a
                    //and would be inserted in a.size() position
                    return a.size();
                } else if (mid < a.size() - 1 && a.get(mid + 1) > b) {
                    //it means that b would be inserted between mid and mid+1
                    //then the answer is mid+1
                    return mid + 1;
                }

                low = mid + 1;
            }
        }

        //this shouldn't happen
        return -1;
    }
}
