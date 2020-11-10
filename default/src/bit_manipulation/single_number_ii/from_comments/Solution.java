package bit_manipulation.single_number_ii.from_comments;

import java.util.List;

/**
 * like java.editorial
 */
public class Solution {
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public int singleNumber(final List<Integer> A) {
        int p = 1;
        int len = A.size();
        int result = 0;
        for (int i = 0; i < 32; i++) {
            int numbOf1 = 0;
            for (int j = 0; j < len; j++) {
                int x = p & A.get(j);   //get i-th bit of j-th element from A
                if (x != 0) {
                    numbOf1++;
                }
            }

            if (numbOf1 % 3 != 0) {
                result += p;    //set i-th bit of result to 1
            }
            p *= 2; //to check i++ bits in the next loop by i
        }

        return result;
    }
}
