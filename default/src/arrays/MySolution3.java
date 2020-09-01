package arrays;

import java.util.ArrayList;
import java.util.List;

public class MySolution3 {
    public static void main(String[] args) {
        int[] A = new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4};
        maxSubArray(A);
    }

    // DO NOT MODIFY THE ARGUMENTS WITH "final" PREFIX. IT IS READ ONLY
    public static int maxSubArray(final int[] A) {
        long maxsum;
        Integer maxElement = Integer.MIN_VALUE;

        int positiveStart = -1;
        int maxPositiveStart = -1;
        int positiveLength = -1;
        int maxPositiveLength = -1;
        long positiveSum = 0;
        long maxPositiveSum = 0;

        for (int i = 0; i < A.length; i++) {
            maxElement = Math.max(maxElement, A[i]);

            if (A[i] >= 0) {
                positiveSum += A[i];
                positiveLength++;
            } else {
                positiveStart = i + 1;
                positiveLength = 0;
                positiveSum = 0;
            }

            if (positiveSum > maxPositiveSum) {
                maxPositiveStart = positiveStart;
                maxPositiveLength = positiveLength;
                maxPositiveSum = positiveSum;
            }
        }

        if (maxElement < 0) {
            return maxElement;
        }

        int maxPositiveEnd = maxPositiveStart + maxPositiveLength - 1;

        List<Integer> leftarr = new ArrayList<Integer>(maxPositiveStart);
        long leftsum = 0;
        int left = 0;
        while (left < maxPositiveStart) {
            leftarr.add(A[left]);
            leftsum += A[left];
            left++;
            if (leftsum < 0) {
                leftsum = 0;
                leftarr.clear();
            }
        }

        //go from A.length - 1 to maxPositiveEnd (i.e. right side)
        List<Integer> rightarr = new ArrayList<Integer>(A.length - 1 - maxPositiveEnd);
        long rightsum = 0;
        int right = A.length - 1;
        while (right > maxPositiveEnd) {
            rightarr.add(A[right]);
            rightsum += A[right];
            right--;
            if (rightsum < 0) {
                rightsum = 0;
                rightarr.clear();
            }
        }

        maxsum = leftsum + maxPositiveSum + rightsum;

        return (int) maxsum;
    }
}
