package arrays.spiral_order_matrix_ii.java_array.editorial;

public class Solution {
    public int[][] generateMatrix(int n) {
        int a[][] = new int[n][n];
        int top = 0;
        int left = 0;
        int right = n - 1;
        int bottom = n - 1;
        int c = 1;
        while (c <= n * n) {
            for (int i = top; i <= right; i++) {
                a[top][i] = c;
                c++;
            }
            top++;
            for (int i = top; i <= bottom; i++) {
                a[i][right] = c;
                c++;
            }
            right--;
            for (int i = right; i >= left; i--) {
                a[bottom][i] = c;
                c++;
            }
            bottom--;
            for (int i = bottom; i >= top; i--) {
                a[i][left] = c;
                c++;
            }
            left++;
        }
        return a;
    }
}