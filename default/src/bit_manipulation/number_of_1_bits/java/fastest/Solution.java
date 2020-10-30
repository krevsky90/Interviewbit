package bit_manipulation.number_of_1_bits.java.fastest;

public class Solution {
    public int numSetBits(long a) {
        int count = 0;
        while (a > 0) {
            if ((a & 1) == 1) {
                count = count + 1;
            }
            a = a >> 1;
        }

        return count;
    }
}