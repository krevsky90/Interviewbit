package binary_search.implement_power_function;

/**
 * the idea is: https://cp-algorithms.com/algebra/binary-exp.html#:~:text=Binary%20exponentiation%20(also%20known%20as,required%20by%20the%20naive%20approach).
 *
 * Using recursion: (see binary_search/implement_power_function/java/fastest/Solution.java)
 * long long binpow(long long a, long long b) {
 *     long long res = 1;
 *     while (b > 0) {
 *         if (b & 1)
 *             res = res * a;
 *         a = a * a;
 *         b >>= 1;
 *     }
 *     return res;
 * }
 *
 * Using loop: (see my implementation)
 * long long binpow(long long a, long long b, long long m) {
 *     a %= m;
 *     long long res = 1;
 *     while (b > 0) {
 *         if (b & 1)
 *             res = res * a % m;
 *         a = a * a % m;
 *         b >>= 1;
 *     }
 *     return res;
 * }
 *
 */
public class MySolution {
    public int pow(int x, int n, int d) {
        if (x == 0) {
            return 0;
        }

        if (n == 0) {
            return 1;
        }

        java.math.BigInteger result = java.math.BigInteger.valueOf(1);
        java.math.BigInteger xB = java.math.BigInteger.valueOf(x);
        java.math.BigInteger nB = java.math.BigInteger.valueOf(n);
        java.math.BigInteger dB = java.math.BigInteger.valueOf(d);

        while (nB.compareTo(java.math.BigInteger.ZERO) > 0) {
            if ((nB.mod(java.math.BigInteger.valueOf(2))).equals(java.math.BigInteger.ONE)) {
                if (xB.compareTo(java.math.BigInteger.ZERO) < 0) {
                    xB = xB.add(dB);
                }
                result = result.multiply(xB).mod(dB);
            }

            xB = xB.multiply(xB).mod(dB);
            nB = nB.divide(java.math.BigInteger.valueOf(2));
        }

        return result.intValue();
    }
}
