package bit_manipulation.number_of_1_bits.java.lightweight;

public class Solution {
    public int numSetBits(long a) {
        int ans = 0;
        while (a > 0) {
            ans += a & 1;
            a >>= 1;
        }
        return ans;
    }
}