package bit_manipulation.trailing_zeroes;

public class MySolution {
    public int solve(int A) {
        int result = 0;
        while (A > 0 && A % 2 == 0) {
            result++;
            A >>= 1;
        }

        return result;
    }
}
