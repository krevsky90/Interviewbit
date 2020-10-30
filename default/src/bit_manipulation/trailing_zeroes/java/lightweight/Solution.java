package bit_manipulation.trailing_zeroes.java.lightweight;

public class Solution {
    public int solve(int n) {
        int ans = 0;
        while (n > 0 && (n & 1) == 0) {
            ans++;
            n = n >> 1;
        }
        return ans;
    }
}
