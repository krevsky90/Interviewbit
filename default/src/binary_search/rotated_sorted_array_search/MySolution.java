package binary_search.rotated_sorted_array_search;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MySolution {
    public static void main(String[] args) {
        List<Integer> A = Arrays.asList(101, 103, 106, 109, 158, 164, 182, 187, 202, 205, 2, 3, 32, 57, 69, 74, 81, 99, 100);
        int B = 202;
        int result = search(A, B);
        System.out.println(result);

    }
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public static int search(final List<Integer> A, int B) {
        //number of rotations  = Index Of Min element in rotated array
        int numberOfRotations = findIndexOfMin(A);
        int N = A.size();

        //create non-rotated sorted array A2
        List<Integer> A2 = new ArrayList<>(N);
        // A = [4, 5, 6, 7, 0, 1, 2, 3]
        // numberOfRotations = 4
        // N = 8
        for (int i = 0; i < A.size(); i++) {
            A2.add(A.get((i + numberOfRotations) % N));
        }

        //find index of B in A2 using binary search
        int indB = findIndexOfElement(A2, B);
        if (indB == -1) {
            return -1;
        }

        return (numberOfRotations + indB) % N;
    }

    public static int findIndexOfElement(final List<Integer> A, int B) {
        int low = 0;
        int high = A.size() - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (A.get(mid) == B) {
                return mid;
            } else if (A.get(mid) > B) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return -1;
    }

    public static int findIndexOfMin(final List<Integer> a) {
        int n = a.size();
        if (n == 0) {
            return -1;
        }

        int left = 0;
        int right = n - 1;
        while (left < right) {
            int mid = (right + left) / 2;
            if (a.get(mid) < a.get(right)) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }
        return left;
    }
}
