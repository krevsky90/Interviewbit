package two_pointers.counting_subarrays.java.fastest;

import java.util.ArrayList;

/**
 * the smartest solution!!!
 */
public class Solution {
    public int solve(ArrayList<Integer> A, int B) {
        int i = 0;
        int j = 0;
        int sum = A.get(0);
        int count = 0;
        while (j < A.size()) {
            if (sum < B) {
                j++;
                count += (j - i);
                sum += j < A.size() ? A.get(j) : 0;
            } else {
                sum -= A.get(i);
                i++;
            }
        }

        return count;
    }
}