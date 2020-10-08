package math.problems.all_factors;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Solution {
    public int[] allFactors(int A) {
        if (A == 1) {
            return new int[]{1};
        }

        List<Integer> factors = new ArrayList<Integer>();
        for (int i = 1; i <= Math.floor(Math.sqrt(A)); i++) {
            if (A % i == 0) {
                factors.add(i);
                if (!factors.contains(A / i)) {
                    factors.add(A / i);
                }
            }
        }

        Collections.sort(factors);

        //convert List to Array
        int[] result = new int[factors.size()];
        for (int i = 0; i < factors.size(); i++) {
            result[i] = factors.get(i);
        }

        return result;
    }
}
