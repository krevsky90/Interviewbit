package binary_search.square_root_of_integer;

public class MySolution {
    public int sqrt(int A) {
        long min = 0;
        long max = Math.min(100000, A);
        while (min <= max) {
            long mid = (min + max) / 2;
            if (mid * mid == A) {
                return (int) mid;
            } else if (mid * mid > A) {
                max = mid - 1;
            } else {
                min = mid + 1;
            }
        }

        return (int) max;//since max < min and max = min - 1;
    }
}
