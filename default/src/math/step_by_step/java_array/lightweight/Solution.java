package math.step_by_step.java_array.lightweight;

public class Solution {
    public int solve(int A) {
        int target = Math.abs(A);
        int sum = 0, step = 0;

        while (sum < target || (sum - target) % 2 != 0) {
            step++;
            sum += step;
        }
        return step;
    }
}