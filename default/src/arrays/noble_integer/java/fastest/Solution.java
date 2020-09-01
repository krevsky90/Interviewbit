package arrays.noble_integer.java.fastest;

import java.util.ArrayList;
import java.util.Collections;

public class Solution {
    public int solve(ArrayList<Integer> A) {
        Collections.sort(A);
        Collections.reverse(A);
        int l = A.size();
        for (int i = 0; i < l; i++) {
            if (A.get(i) == i) {
                if (i != 0 && A.get(i) != A.get(i - 1)) {
                    //System.out.println(i);
                    return 1;
                } else if (i == 0) {
                    return 1;

                }

            }
        }
        return -1;
    }
}