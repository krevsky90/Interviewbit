package two_pointers.pair_with_given_difference;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Collections.sort() + solution of two_pointers.diffk (used java.editorial)
 */
public class MySolution {
    public int solve(ArrayList<Integer> A, int B) {
        Collections.sort(A);

        int i = 0;
        int j = 1;
        while (j < A.size() && i < A.size()) {
            int diff = A.get(j) - A.get(i);
            if (diff == B && i != j)
                return 1;
            if (A.get(j) - A.get(i) < B) {
                j++;
            } else {
                i++;
            }
        }
        return 0;
    }
}
