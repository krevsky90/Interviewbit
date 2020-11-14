package two_pointers.intersection_of_sorted_arrays;

import java.util.ArrayList;
import java.util.List;

/**
 * my solution = java.editorial = java.lightweight
 */
public class MySolution {
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public ArrayList<Integer> intersect(final List<Integer> A, final List<Integer> B) {
        ArrayList<Integer> result = new ArrayList<Integer>();
        int i = 0;
        int j = 0;
        while (i < A.size() && j < B.size()) {
            if (A.get(i).equals(B.get(j))) {
                result.add(A.get(i));
                i++;
                j++;
            } else if (A.get(i) > B.get(j)) {
                j++;
            } else {
                i++;
            }
        }

        return result;
    }
}
