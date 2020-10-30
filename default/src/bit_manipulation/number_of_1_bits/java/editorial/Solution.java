package bit_manipulation.number_of_1_bits.java.editorial;

public class Solution {
    public int numSetBits(long a) {
        int count = 0;
        while (a != 0) {
            a &= a - 1;
            count++;
        }

        return count;
    }
}