package bit_manipulation.single_number_ii;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * partly correct (75/275)
 * WHY? don't know... the same approach for the problem 'single_number' was ok
 */
public class MySolution {
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public int singleNumber(final List<Integer> A) {
        java.math.BigInteger sumA = java.math.BigInteger.valueOf(0);
        Set<Integer> uniqueA = new HashSet<>(A.size() / 3 + 1);
        for (Integer i : A) {
            sumA = sumA.add(java.math.BigInteger.valueOf(i.intValue()));
            uniqueA.add(i);
        }

        java.math.BigInteger sumUniqueA = new java.math.BigInteger("0");
        for (Integer l : uniqueA) {
            sumUniqueA = sumUniqueA.add(java.math.BigInteger.valueOf(l.intValue()));
        }

        java.math.BigInteger result = (new java.math.BigInteger("3").multiply(sumUniqueA).subtract(sumA)).divide(new java.math.BigInteger("2"));
        return result.intValue();
    }
}