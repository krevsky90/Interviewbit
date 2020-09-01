package arrays.min_steps_in_infinite_grid;

public class MySolution {
    public int coverPoints(int[] A, int[] B) {
        int count = 0;
        for (int i = 1; i < A.length; i++) {
            count += Math.max(Math.abs(A[i] - A[i - 1]), Math.abs(B[i] - B[i - 1]));
        }

        return count;
    }
}