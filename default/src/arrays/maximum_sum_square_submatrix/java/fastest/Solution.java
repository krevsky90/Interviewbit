package arrays.maximum_sum_square_submatrix.java.fastest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    public static void main(String[] args) {
        List<List<Integer>> A = new ArrayList<>();
        A.add(Arrays.asList(1, 1, 1, 1, 1));
        A.add(Arrays.asList(2, 2, 2, 2, 2));
        A.add(Arrays.asList(3, 8, 6, 7, 3));
        A.add(Arrays.asList(4, 4, 4, 4, 4));
        A.add(Arrays.asList(5, 5, 5, 5, 5));
        int B = 3;

        int result = solve(A, B);
        System.out.println(result);
    }

    public static int solve(List<List<Integer>> A, int B) {
        //create new matrix where each element is sum of sub-matrix A starting from (0,0) ending by (i, j)
        //Example:
        //  matrix A:
        //  [1, 1, 1, 1, 1]
        //  [2, 2, 2, 2, 2]
        //  [3, 8, 6, 7, 3]
        //  [4, 4, 4, 4, 4]
        //  [5, 5, 5, 5, 5]
        //matrix sum:
        //  0 0  0  0  0  0
        //  0 1  2  3  4  5
        //  0 3  6  9  12 15
        //  0 6  17 26 36 42
        //  0 10 25 38 52 62
        //  0 15 35 53 72 87

        int n = A.size();
        int sum[][] = new int[n + 1][n + 1];
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                sum[i][j] = A.get(i - 1).get(j - 1) + sum[i][j - 1] + sum[i - 1][j] - sum[i - 1][j - 1];
            }
        }

        int maxSum = Integer.MIN_VALUE;
        if (B > n) return -1;

        //to calculate sum of sub-matrix size BxB we can use matrix sum by the following way:
        //we can get some sub-matrix A by adding and reducing of sub-matrix 'sum'
        //the same logic works for sum of element of such sub-matrix (like calculating of square)
        for (int i = 1; i <= n - B + 1; i++) {
            for (int j = 1; j <= n - B + 1; j++) {
                int currSum = sum[i + B - 1][j + B - 1] - sum[i - 1][j + B - 1] - sum[i + B - 1][j - 1] + sum[i - 1][j - 1];
                maxSum = Math.max(currSum, maxSum);
            }
        }

        return maxSum;

    }
}