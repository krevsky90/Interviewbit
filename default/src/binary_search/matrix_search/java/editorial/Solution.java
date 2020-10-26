package binary_search.matrix_search.java.editorial;

import java.util.ArrayList;

/**
 * Consider 2d array as 1d
 */
public class Solution {
    public int searchMatrix(ArrayList<ArrayList<Integer>> a, int b) {
        if (a.size() < 1) return 0;

        int yLength = a.get(0).size();

        int max = (a.size() * yLength) - 1;
        int min = 0;
        int mid;
        int x;
        int y;
        while (min <= max) {
            mid = min + ((max - min) / 2);
            x = mid / yLength;
            y = mid % yLength;
            if (a.get(x).get(y) == b) {
                return 1;
            } else if (a.get(x).get(y) > b) {
                max = mid - 1;
            } else {
                min = mid + 1;
            }
        }

        return 0;


    }
}