package arrays.spiral_order_matrix_i.java_array.fastest;

public class Solution {
    // DO NOT MODIFY THE ARGUMENTS WITH "final" PREFIX. IT IS READ ONLY
    public int[] spiralOrder(final int[][] A) {
        int matrixSize = (A.length) * (A[0].length);
        int[] outArr = new int[matrixSize];
        int t, b, l, r;
        t = 0;
        b = A.length - 1;
        l = 0;
        r = A[0].length - 1;
        int dir = 0;
        int k = 0;
        while (t <= b && l <= r) {
            if (dir == 0) {
                for (int i = l; i <= r; i++) {
                    outArr[k] = A[t][i];
                    k++;
                }
                t++;
            } else if (dir == 1) {
                for (int i = t; i <= b; i++) {
                    outArr[k] = A[i][r];
                    k++;
                }
                r--;
            } else if (dir == 2) {
                for (int i = r; i >= l; i--) {
                    outArr[k] = A[b][i];
                    k++;
                }
                b--;
            } else if (dir == 3) {
                for (int i = b; i >= t; i--) {
                    outArr[k] = A[i][l];
                    k++;
                }
                l++;
            }
            dir = (dir + 1) % 4;
        }
        return outArr;
    }
}


