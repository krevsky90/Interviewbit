package math.reverse_integer;

/*
Like java.fastest
 */
public class MySolution {
    public static void main(String[] args) {
        reverse(-35488693);
    }

    public static int reverse(int A) {
        String s = String.valueOf(A);
        String sign = "";
        if (A < 0) {
            sign = "-";
            s = s.substring(1);
        }

        String reversed = new StringBuilder(s).reverse().toString();

        if (Long.valueOf(reversed) > Integer.MAX_VALUE) {
            return 0;
        }

        String reversedSigned = sign + reversed;

        return Integer.valueOf(reversedSigned);
    }
}

