package binary_search.search_in_bitonic_array.java.lightweight;

import java.util.Arrays;
import java.util.List;

/*
 * DON'T UNDERSTAND WHY IS THIS SOLUTION CORRECT ?!
 * SEE EXAMPLE BEFORE THAT RETURNS -1 INSTEAD OF 1
 */
public class Solution {
    public static void main(String[] args) {
        List<Integer> A = Arrays.asList(5, 10, 9, 8, 7, 6);
        int B = 10;
        int res = solve(A, B);
        System.out.println(res);
    }
    public static int solve(List<Integer> A, int B) {
        int size = A.size();
        int left = 0;
        int right = size - 1;

        while (left <= right) {
            int mid = (left + right) / 2;
            if (A.get(mid) == B)
                return mid;
            else if (A.get(left) <= A.get(mid)) {
                if (A.get(left) <= B && A.get(mid) > B)
                    right = mid - 1;
                else
                    left = mid + 1;
            } else if (B < A.get(mid))
                left = mid + 1;
            else
                right = mid - 1;
        }
        return -1;
    }
}