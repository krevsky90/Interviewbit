package arrays.spiral_order_matrix_ii.java.fastest;

import java.util.ArrayList;

public class Solution {
    public ArrayList<ArrayList<Integer>> generateMatrix(int A) {
        ArrayList<ArrayList<Integer>> a = new ArrayList<ArrayList<Integer>>();
        int i, j;
        for (i = 0; i < A; i++) {
            a.add(new ArrayList<Integer>());
        }
        for (i = 0; i < A; i++) {
            for (j = 0; j < A; j++) {
                a.get(i).add(0);
            }
        }
        a.get(0).set(0, 1);
        int row = 0, col = 0, layer = 0, dir = 0;
        for (i = 1; i < A * A; i++) {
            switch (dir) {
                case 0:
                    if (col == A - layer - 1) {
                        row++;
                        dir = 1;
                    } else
                        col++;
                    break;
                case 1:
                    if (row == A - layer - 1) {
                        col--;
                        dir = 2;
                    } else
                        row++;
                    break;
                case 2:
                    if (col == layer) {
                        row--;
                        dir = 3;
                    } else
                        col--;
                    break;
                case 3:
                    if (row == layer + 1) {
                        layer++;
                        dir = 0;
                        col++;
                    } else
                        row--;
                    break;
            }
            a.get(row).set(col, i + 1);
        }
        return a;
    }
}