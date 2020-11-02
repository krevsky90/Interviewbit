package strings.add_binary_strings.java.editorial;

import java.math.BigInteger;

/**
 * used conversion from binary to 10-base system
 */
public class Solution {
    public String addBinary(String A, String B) {
        BigInteger b1 = new BigInteger(A, 2);
        BigInteger b2 = new BigInteger(B, 2);
        return (b1.add(b2)).toString(2);
    }
}