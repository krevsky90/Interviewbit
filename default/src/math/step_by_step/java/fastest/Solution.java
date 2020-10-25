package math.step_by_step.java.fastest;

public class Solution {
    public int solve(int A) {
        int target = Math.abs(A);
        int n = (int) Math.ceil((-1.0 + Math.sqrt(1 + 8.0 * target)) / 2);
        int sum = n * (n + 1) / 2;
        if (sum == target)
            return n;

        int d = sum - target;
        if (d % 2 == 0)
            return n;
        else
            return n + (n % 2 == 0 ? 1 : 2);
    }
}