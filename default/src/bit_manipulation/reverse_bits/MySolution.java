package bit_manipulation.reverse_bits;

public class MySolution {
    public static void main(String[] args) {
        reverse(3L);
    }

    public static long reverse(long a) {
        StringBuilder sbA = new StringBuilder();
        while (a > 0) {
            sbA.append(a % 2);
            a = a >> 1;
        }

        int aLen = sbA.length();
        for (int i = 0; i < 32 - aLen; i++) {
            sbA.append("0");
        }

        java.math.BigInteger bi = new java.math.BigInteger(sbA.toString(), 2);

        return bi.longValue();
    }
}
