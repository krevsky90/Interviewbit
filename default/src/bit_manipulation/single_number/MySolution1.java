package bit_manipulation.single_number;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class MySolution1 {
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public int singleNumber(final List<Integer> A) {
        long sum = 0;
        Set<Integer> s = new HashSet<>();

        for (Integer i : A) {
            sum += i;
            s.add(i);
        }

        long sumSet = 0;
        for (Integer j : s) {
            sumSet += j;
        }

        long result = 2 * sumSet - sum;

        return (int) result;
    }
}
