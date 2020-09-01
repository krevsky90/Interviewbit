package arrays.pick_from_both_sides.java.lightweight;

import java.util.*;

public class Solution {
    public int solve(List<Integer> A, int B) {

        int n = A.size();
        int suffix[] = new int[B];
        int prefix[] = new int[B];
        int max = Integer.MIN_VALUE, prefix_sum = 0, suffix_sum = 0, sum;
        if (B > n) {
            return -1;
        }
        sum = 0;
        // Collections.sort(A);
        for (int i = 0; i < B; i++) {
            prefix[i] = A.get(i);
            prefix_sum = prefix_sum + prefix[i];
            suffix[i] = A.get(n - i - 1);
            suffix_sum = suffix_sum + suffix[i];
        }
        max = Math.max(prefix_sum, suffix_sum);
        for (int i = 0; i < B - 1; i++) {
            sum = 0;
            for (int j = 0; j <= i; j++) {
                sum += prefix[j];
            }
            for (int j = 0; j < B - i - 1; j++) {
                sum += suffix[j];
            }
            if (sum > max) {
                max = sum;
            }
        }
        return max;

    }
}