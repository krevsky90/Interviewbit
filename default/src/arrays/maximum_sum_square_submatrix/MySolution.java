package arrays.maximum_sum_square_submatrix;

import java.util.ArrayList;

/**
 * My solution is BAD since takes O(n^4)
 *
 * Good solution look here:
 * arrays/maximum_sum_square_submatrix/java/fastest/Solution.java
 */
public class MySolution {
    public int solve(ArrayList<ArrayList<Integer>> A, int B) {
        int N = A.size();
        int max_sum = Integer.MIN_VALUE;

        for (int i = 0; i <= N - B; i++) {
            for (int j = 0; j <= N - B; j++) {
                max_sum = Math.max(max_sum, getSumSubmatrix(i, j, B, A));
            }
        }

        return max_sum;
    }

    public int getSumSubmatrix(int i0, int j0, int B, ArrayList<ArrayList<Integer>> A) {
        int result = 0;
        for (int i = i0; i < i0 + B; i++) {
            for (int j = j0; j < j0 + B; j++) {
                result += A.get(i).get(j);
            }
        }

        return result;
    }
}
