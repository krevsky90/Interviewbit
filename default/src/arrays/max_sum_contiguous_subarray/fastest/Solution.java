package arrays.max_sum_contiguous_subarray.fastest;

/**
 *
 * ATTENTION!
 *
 * Kadane's Algorithm
 * https://www.youtube.com/watch?v=ohHWQf1HDfU&t=776s
 *
 */
public class Solution {
    // DO NOT MODIFY THE ARGUMENTS WITH "final" PREFIX. IT IS READ ONLY

    public int maxSubArray(final int[] A) {
        int endsum = 0, lsum = 0;
        for (int i = 0; i < A.length; i++) {
            lsum += A[i];
            if (lsum < 0)
                lsum = 0;
            if (lsum > endsum)
                endsum = lsum;
        }

        //if all elements are negative
        if (endsum == 0) {
            int min = Integer.MIN_VALUE;
            for (int i = 0; i < A.length; i++)
                if (A[i] > min)
                    min = A[i];
            return min;
        }
        return endsum;
    }
}
