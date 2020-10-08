package math.greatest_common_divisor;

public class MySolution {
    public int gcd(int A, int B) {
        //optionally swap numbers if A < B
        if (A < B) {
            return gcd(B, A);
        }

        if (B == 0) {
            return A;
        }

        return gcd(B, A % B);
    }
}
