package two_pointers.counting_subarrays;

import java.util.ArrayList;

/**
 * like java.lightweight (but less optimized from counter++ point of view)
 */
public class MySolution {
    public int solve(ArrayList<Integer> A, int B) {
        int counter = 0;
        for (int i = 0; i < A.size(); i++) {
            if (A.get(i).intValue() < B) {
                counter++;
                int j = i + 1;
                int sum = A.get(i);
                while (j < A.size()) {
                    sum += A.get(j);
                    if (sum < B) {
                        counter++;
                        j++;
                    } else {
                        break;
                    }
                }
            }
        }

        return counter;
    }
}
