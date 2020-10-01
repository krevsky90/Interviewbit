package math.rearrange_array.java.editorial;

import java.util.ArrayList;

/**
 * DON'T UNDERSTAND this solution!
 * DON'T UNDERSTAND this formula!
 */
public class Solution {
    //i 0 1 2 3 4
    //a 4 0 2 1 3
    //b 3 4 2 0 1

    public void arrange(ArrayList<Integer> A) {
        int n = A.size();
        for (int i = 0; i < n; i++) {
            int index = A.get(i);
            A.set(i, index + (A.get(index) % n) * n);
            //A[0] = 4 + (3 % 5)*5 = 4 + 3*5 = 19
            //19 0 2 1 3

            //A[1] = 0 + (19 % 5) * 5 = 4 * 5 = 20
            //19 20 2 1 3

            //A[2] = 2 + (2 % 5) *5 = 2 + 2*5 = 12
            //19 20 12 1 3

            //A[3] = 1 + (0 % 5)* 5 = 1
            //19 20 12 1 3

            //A[4] = 3 + (1 % 5)*5 = 3 + 1*5 = 8
            //19 20 12 1 8
        }

        for (int i = 0; i < n; i++) {
            A.set(i, A.get(i) / n);
            //3 4 2 0 1
        }
    }
}