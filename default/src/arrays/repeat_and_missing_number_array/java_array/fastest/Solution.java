package arrays.repeat_and_missing_number_array.java_array.fastest;


/**
 * DON'T UNDERSTAND mathematical formulas!
 *
 */
public class Solution {
    // DO NOT MODIFY THE ARGUMENTS WITH "final" PREFIX. IT IS READ ONLY
    public int[] repeatedNumber(final int[] A) {
        long sum = 0, sumSquares = 0;
        for (int i = 1; i <= A.length; i++) {
            sum += A[i - 1] - i;
            sumSquares += A[i - 1] * (long) A[i - 1] - i * (long) i;
        }
        long AminusB = sum, AplusB = sumSquares / sum;
        return new int[]{(int) ((AplusB + AminusB) / 2), (int) ((AplusB - AminusB) / 2)};
    }
}
