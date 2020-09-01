package arrays.pick_from_both_sides;

public class MySolution {
    public int solve(int[] A, int B) {
        int length = A.length;
        //todo: replace with Integer.MIN_VALUE
        int sum = -100000 * 1000;

        for (int startPos = 0; startPos < B; startPos++) {
            int tempSum = 0;
            for (int i = 0; i < startPos; i++) {
                tempSum += A[i];
            }

            for (int i = length - B + startPos; i < length; i++) {
                tempSum += A[i];
            }

            if (tempSum > sum) {
                sum = tempSum;
            }
        }

        return sum;
    }
}
