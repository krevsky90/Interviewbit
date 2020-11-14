package two_pointers.pair_with_given_difference.java.editorial;

import java.util.ArrayList;
import java.util.HashSet;

public class Solution {
    public int solve(ArrayList<Integer> A, int B) {
        HashSet<Integer> numbers = new HashSet<Integer>(A);
        if (B == 0) {
            if (numbers.size() == A.size()) {
                return 0;
            }
            return 1;
        }
        for (Integer i : A) {
            if (numbers.contains(B + i) || numbers.contains(i - B)) {
                return 1;
            }
        }
        return 0;
    }
}