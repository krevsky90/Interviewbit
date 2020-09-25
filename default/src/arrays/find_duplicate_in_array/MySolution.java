package arrays.find_duplicate_in_array;

import java.util.HashSet;
import java.util.Set;

public class MySolution {
    public static void main(String[] args) {
        int[] arr = new int[]{3, 4, 1, 4, 1};
        int res = repeatedNumber(arr);

        System.out.println(res);

    }
    // DO NOT MODIFY THE ARGUMENTS WITH "final" PREFIX. IT IS READ ONLY
    public static int repeatedNumber(final int[] A) {
        Set<Integer> setInt = new HashSet<Integer>();
        for (int i = 0; i < A.length; i++) {
            if (setInt.contains(A[i])) {
                return A[i];
            } else {
                setInt.add(A[i]);
            }
        }

        return -1;
    }
}
