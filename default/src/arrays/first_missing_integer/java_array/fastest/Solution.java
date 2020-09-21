package arrays.first_missing_integer.java_array.fastest;

public class Solution {
    public int firstMissingPositive(int[] A) {
        int len = A.length;
        for (int i = 0; i < len; i++) {
            while (A[i] != (i + 1) || A[i] <= 0) {
                int num = A[i];
                int targetIndex = num - 1;
                if ((targetIndex < 0 || targetIndex >= len) || num == A[num - 1]) {
                    break;
                }

                A[i] = A[targetIndex];
                A[targetIndex] = num;
            }
        }
        // find the missing integer
        for (int i = 0; i < len; i++) {
            if (A[i] != i + 1) {
                // found missing
                return i + 1;
            }
        }
        // no missing number
        return len + 1;
    }
}