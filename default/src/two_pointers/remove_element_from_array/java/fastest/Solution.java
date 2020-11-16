package two_pointers.remove_element_from_array.java.fastest;

import java.util.ArrayList;

/**
 * current solution is clearer than java.editorial since all extra elements are removed
 */
public class Solution {
    public int removeElement(ArrayList<Integer> a, int b) {
        int n = a.size();
        int i, j;

        for (i = 0, j = 0; j < n; j++) {
            if (a.get(j) != b) {
                a.set(i, a.get(j));
                i++;
            }
        }
        int k = i;
        while (k < a.size()) {
            a.remove(k);
        }

        return i;
    }
}
