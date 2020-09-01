package arrays.max_sum_contiguous_subarray;

import java.util.ArrayList;
import java.util.List;

public class MySolution {
    // DO NOT MODIFY THE ARGUMENTS WITH "final" PREFIX. IT IS READ ONLY
    public int maxSubArray(final int[] A) {
        long tempsum = 0;
        long maxsum = Long.MIN_VALUE;
        Integer maxElement = Integer.MIN_VALUE;

        for (int i = 0; i < A.length; i++) {
            if (A[i] > 0) {
                //go from 0 to i (i.e. left side)
                List<Integer> leftarr = new ArrayList<>(i);
                long leftsum = 0;
                int left = 0;
                while (left < i) {
                    leftarr.add(A[left]);
                    leftsum += A[left];
                    left++;
                    if (leftsum < 0) {
                        leftsum = 0;
                        leftarr.clear();
                    }
                }

                //go from A.length - 1 to i (i.e. right side)
                List<Integer> rightarr = new ArrayList<>(A.length - 1 - i);
                long rightsum = 0;
                int right = A.length - 1;
                while (right > i) {
                    rightarr.add(A[right]);
                    rightsum += A[right];
                    right--;
                    if (rightsum < 0) {
                        rightsum = 0;
                        rightarr.clear();
                    }
                }

                tempsum = leftsum + A[i] + rightsum;
                maxsum = Math.max(tempsum, maxsum);
            }
            maxElement = Math.max(maxElement, A[i]);
        }

        //check whether all elements are negative
        //in this case return the largest element
        if (maxElement < 0) {
            return maxElement;
        } else {
            return (int) maxsum;
        }
    }
}

