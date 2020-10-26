package binary_search.matrix_search;

import java.util.ArrayList;
import java.util.List;

public class MySolution {
    public int searchMatrix(ArrayList<ArrayList<Integer>> A, int B) {
        List<Integer> firstList = new ArrayList<>(A.size());
        for (int i = 0; i < A.size(); i++) {
            firstList.add(A.get(i).get(0));
        }

        //find row that may contain B using binary search
        int left = 0;
        int right = firstList.size() - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (firstList.get(mid) == B) {
                return 1;
            } else if (firstList.get(mid) > B) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }

        int startRow = right;
        if (startRow < 0) {
            return 0; //because B is less than the A[0][0]
        }

        //find element in startRow-th row of A
        List<Integer> row = A.get(startRow);
        int left2 = 0;  //can be 1 to optimize
        int right2 = row.size() - 1;
        while (left2 <= right2) {
            int mid2 = (left2 + right2) / 2;
            if (row.get(mid2) == B) {
                return 1;
            } else if (row.get(mid2) > B) {
                right2 = mid2 - 1;
            } else {
                left2 = mid2 + 1;
            }
        }

        return 0;
    }
}
