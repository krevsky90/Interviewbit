package arrays.max_distance.java_array.fastest;

public class Solution {
    // DO NOT MODIFY THE ARGUMENTS WITH "final" PREFIX. IT IS READ ONLY
    public int maximumGap(final int[] A) {
        if (A == null || A.length == 0) {
            return 0;
        }
        int[] rmax = new int[A.length];
        int n = A.length;
        int[] lmax = new int[n];
        rmax[n - 1] = A[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            rmax[i] = Math.max(rmax[i + 1], A[i]);
        }
        lmax[0] = A[0];
        for (int i = 1; i < n; i++) {
            lmax[i] = Math.min(lmax[i - 1], A[i]);
        }
        int i = 0, j = 0, max = 0;
        while (i < n && j < n) {
            if (lmax[i] <= rmax[j]) {
                max = Math.max(max, Math.abs(j - i));
                j++;
            } else {
                i++;
            }
        }
        return max;
    }
}