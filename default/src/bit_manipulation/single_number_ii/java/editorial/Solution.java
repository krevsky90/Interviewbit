package bit_manipulation.single_number_ii.java.editorial;

import java.util.List;

public class Solution {
    public int singleNumber(final List<Integer> A) {
        int num = 0;
        int count = 0;
        for (int i = 0; i < 32; ++i) {
            count = 0;
            for (int a : A) {
                //first operation: 1 << i
                //second operation: a & ..
                if ((a & 1 << i) != 0) {
                    count++;
                }
            }
            if (count % 3 != 0) {
                num += 1 << i;
            }
        }
        return num;
    }
}
