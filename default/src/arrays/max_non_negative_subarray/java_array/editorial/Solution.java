package arrays.max_non_negative_subarray.java_array.editorial;

import java.util.Arrays;

public class Solution {
    public int[] maxset(int[] A) {
        long msum = 0;
        long sum = 0;
        int start = -1, end = 0, ms = 0, me = 0;
        boolean isNeg = true;
        while (end <= A.length) {
            if (end == A.length || A[end] < 0) {
                if (sum > msum) {
                    msum = sum;
                    ms = start + 1;
                    me = end - 1;
                } else if (sum == msum) {
                    if (me - ms < end - start - 2) {
                        ms = start + 1;
                        me = end - 1;
                    }
                }
                start = end++;
                sum = 0;
                continue;
            }

            sum += A[end++];
            isNeg = false;
        }

        return isNeg ? new int[0] : Arrays.copyOfRange(A, ms, me + 1);
    }
}
