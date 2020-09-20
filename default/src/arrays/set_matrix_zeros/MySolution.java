package arrays.set_matrix_zeros;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

/**
 * Like Fastest solution
 */
public class MySolution {
    public static void main(String[] args) {
        setZeroes(null);
    }

    public static void setZeroes(ArrayList<ArrayList<Integer>> a) {
        Set<Integer> rowNums = new HashSet<Integer>();
        Set<Integer> columnNums = new HashSet<Integer>();

        int m = a.size();
        int n = a.get(0).size();

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (a.get(i).get(j) == 0) {
                    rowNums.add(i);
                    columnNums.add(j);
                }
            }
        }

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (rowNums.contains(i) || columnNums.contains(j)) {
                    a.get(i).set(j, 0);
                }
            }
        }
    }
}

