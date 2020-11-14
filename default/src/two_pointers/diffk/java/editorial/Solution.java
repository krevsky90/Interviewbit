package two_pointers.diffk.java.editorial;

import java.util.ArrayList;

public class Solution {
    public int diffPossible(ArrayList<Integer> A, int B) {
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