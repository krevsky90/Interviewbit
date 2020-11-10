package bit_manipulation.xor_ing_the_subarrays;

import java.util.ArrayList;

/*
the idea is
1 2 3 4

1 2 3 4 5
(1 2) (2 3) (3 4) (4 5)
(1 2 3) (2 3 4) (3 4 5)
(1 2 3 4) (2 3 4 5)
(1 2 3 4 5)

1 -> n
2 -> n-1 + n-1
3 -> n-2 + n-2 + n-2
4 -> n-3 + n-3 + n-3 + n-3
.
.
.
n -> 1 + ... + 1

k -> (n-(k-1)) * k

AND
since x^x = 0
then all elements with k % 2=0 will give 0
also if k_max % 2 = 0 then total sum = 0
*/
public class MySolution {
    public int solve(ArrayList<Integer> A) {
        if (A.size() % 2 == 0) {
            return 0;
        } else {
            int result = 0;
            for (int i = 0; i < A.size(); i+=2) {
                result = result ^ A.get(i);
            }

            return result;
        }
    }
}
