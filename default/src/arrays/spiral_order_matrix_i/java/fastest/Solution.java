package arrays.spiral_order_matrix_i.java.fastest;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public ArrayList<Integer> spiralOrder(final List<ArrayList<Integer>> A) {

        ArrayList<Integer> result = new ArrayList<Integer>();
        int m, n;
        m = A.size();
        n = A.get(0).size();
        if (m == 0)
            return result;
        int dir = 0; // right
        int row, col, layer;
        row = col = layer = 0;
        result.add(A.get(0).get(0));
        for (int step = 1; step < m * n; step++) {
            switch (dir) {
                case 0:
                    if (col == n - layer - 1) {
                        dir = 1;
                        row++;
                    } else {
                        col++;
                    }
                    break;
                case 1:
                    if (row == m - layer - 1) {
                        dir = 2;
                        col--;
                    } else {
                        row++;
                    }
                    break;
                case 2:
                    if (col == layer) {
                        dir = 3;
                        row--;
                    } else {
                        col--;
                    }
                    break;
                case 3:
                    if (row == layer + 1) {
                        dir = 0;
                        col++;
                        layer++;
                    } else {
                        row--;
                    }
                    break;
            }
            result.add(A.get(row).get(col));
        }
        return result;
    }
}