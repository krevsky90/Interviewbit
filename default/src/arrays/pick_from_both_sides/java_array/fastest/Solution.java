package arrays.pick_from_both_sides.java_array.fastest;

public class Solution {
    public int solve(int[] A, int B) {
        int ret = 0;
        B = Math.min(A.length, B);
        int e = A.length - B;
        for (int i = e; i < A.length; ++i) {
            ret += A[i];
        }
        int sum = ret;
        for (int i = 0; i < B; ++i) {
            sum = sum + A[i] - A[e++];
            ret = Math.max(sum, ret);
        }
        return ret;
    }
}
