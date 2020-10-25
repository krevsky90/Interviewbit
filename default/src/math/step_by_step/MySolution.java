package math.step_by_step;

public class MySolution {
    public int solve(int A) {
        int absA = Math.abs(A);
        double n_double = (-1 + Math.sqrt(1 + 8 * absA)) / 2;
        double n_ceil = Math.ceil(n_double);
        if (n_ceil == n_double) {
            return (int) n_ceil;
        }

        int n = (int) n_ceil;

        long sum = n * (n + 1) / 2;

        if ((sum - absA) % 2 == 0) {
            return n;
        } else {
            n++;
            long sum2 = n * (n + 1) / 2;
            if ((sum2 - absA) % 2 == 0) {
                return n;
            } else {
                return n + 1;
            }
        }
    }
}
