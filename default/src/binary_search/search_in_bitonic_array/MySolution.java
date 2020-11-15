package binary_search.search_in_bitonic_array;

import java.util.Arrays;
import java.util.List;

/**
 * like java.editorial
 */
public class MySolution {
    public static void main(String[] args) {
        List<Integer> A = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 20, 19, 18, 17, 16, 15, 14, 13, 12, 11);
        System.out.println(solve(A, 12));
    }

    public static int solve(List<Integer> A, int B) {
        int left = 0;
        int right = A.size() - 1;

        //find pivot
        int bitonicPivotIndex = -1;
        while (left <= right) {
            int middle = (left + right) / 2;
            if (A.get(middle - 1) < A.get(middle) && A.get(middle) > A.get(middle + 1)) {
                bitonicPivotIndex = middle;
                break;
            } else if (A.get(middle - 1) < A.get(middle) && A.get(middle) < A.get(middle + 1)) {
                left = middle + 1;
            } else if (A.get(middle - 1) > A.get(middle) && A.get(middle) > A.get(middle + 1)) {
                right = middle - 1;
            }
        }

        if (bitonicPivotIndex == -1) {
            //error!
        }

        //search in [0,bitonicPivot]
        left = 0;
        right = bitonicPivotIndex;
        while (left <= right) {
            int middle = (left + right) / 2;
            if (A.get(middle) == B) {
                return middle;
            } else if (A.get(middle) > B) {
                right = middle - 1;
            } else {
                left = middle + 1;
            }
        }

        left = bitonicPivotIndex;
        right = A.size() - 1;
        //sublist decreases
        while (left <= right) {
            int middle = (left + right) / 2;
            if (A.get(middle) == B) {
                return middle;
            } else if (A.get(middle) > B) {
                left = middle + 1;
            } else {
                right = middle - 1;
            }
        }

        return -1;
    }
}