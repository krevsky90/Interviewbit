package math.is_rectangle;

import java.util.HashMap;
import java.util.Map;

/**
 * like java_array.editorial
 */
public class MySolution {
    public int solve(int A, int B, int C, int D) {
        if (A == 0 || B == 0 || C == 0 || D == 0) {
            return 0;
        }

        int[] abcd = new int[]{A, B, C, D};


        Map<Integer, Integer> lens = new HashMap<>();
        for (int i = 0; i < abcd.length; i++) {
            if (!lens.keySet().contains(abcd[i])) {
                lens.put(abcd[i], 1);
            } else {
                lens.put(abcd[i], lens.get(abcd[i]) + 1);
            }
        }

        for (Integer k : lens.keySet()) {
            if (lens.get(k) != 2) {
                return 0;
            }
        }

        return 1;
    }
}
