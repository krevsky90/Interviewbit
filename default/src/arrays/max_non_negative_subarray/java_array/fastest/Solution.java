package arrays.max_non_negative_subarray.java_array.fastest;

public class Solution {
    public int[] maxset(int[] A) {
        long currsum = 0, sum = -1;
        int st = 0, l = 0, r = 0, ind = 0;
        for (int i = 0; i < A.length; i++) {
            if ((i == 0 || A[i - 1] < 0) && A[i] >= 0) {
                ind = i;
                currsum = 0;
            }
            currsum += A[i];

            if (A[i] >= 0) {
                if (currsum > sum) {
                    l = ind;
                    r = i;
                    sum = currsum;
                } else if (currsum == sum) {
                    if (r - l < i - ind) {
                        l = ind;
                        r = i;
                    }
                }
            }
        }
        int[] C = new int[r - l + 1];
        int k = 0;
        for (int j = l; j <= r; j++) {
            if (A[j] < 0) {
                int[] a = new int[0];
                return a;
            }
            C[k] = A[j];
            k++;
        }

        return C;
    }
}
