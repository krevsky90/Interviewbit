package arrays.leader_in_an_array;

import java.util.ArrayList;
import java.util.List;

/**
 * Correct BUT O(n2)
 *
 * see O(n) here: C:\Grisha\JavaProjects\Interviewbit\default\src\arrays\leader_in_an_array\java_array\Solution.java
 */
public class MySolution {
    public static void main(String[] args) {
        int[] arr = new int[]{16, 17, 4, 3, 5, 2};
        int[] result = solve(arr);
        System.out.println("");
    }

    public static int[] solve(int[] A) {
        List<Integer> arr = new ArrayList<Integer>(A.length);
        boolean isLeader;
        for (int i = 0; i < A.length; i++) {
            isLeader = true;
            int j = i + 1;
            while (j < A.length) {
                if (A[i] < A[j]) {
                    isLeader = false;
                    break;
                } else {
                    j++;
                }
            }

            if (isLeader) {
                arr.add(Integer.valueOf(A[i]));
            }
        }

        int[] result = new int[arr.size()];
        for (int r = 0; r < arr.size(); r++) {
            result[r] = arr.get(r);
        }

        return result;
    }
}
