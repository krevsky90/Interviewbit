package arrays.step_by_step.java.lightweight;

public class Solution {
    public static void main(String[] args) {
        int A = 5;
        int res = solve(A);
        System.out.println(res);
    }

    public static int solve(int A) {
        int step = 0, total = 0;
        A = Math.abs(A);
        while (total < A || (total - A) % 2 != 0) {
            step += 1;
            total += step;
        }
        return step;
    }
}
