package arrays.pick_from_both_sides.java.fastest;

import java.util.List;

public class Solution {
    public int solve(List<Integer> A, int B) {

        int currSum = 0;
        // int max = Integer.MIN_VALUE;
        int n = A.size();
        int p2 = n - 1;
        for (; p2 >= n - 1 - (B - 1); p2--) {
            currSum += A.get(p2);
        }

        int max = currSum;
        int p1 = 0;
        // p2 = n-1-(B-1);
        p2++;

        while (p1 <= B - 1) {
            currSum -= A.get(p2);
            currSum += A.get(p1);
            p1++;
            p2++;
            max = Math.max(max, currSum);
        }

        return max;
    }
}

