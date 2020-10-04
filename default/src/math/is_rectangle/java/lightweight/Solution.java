package math.is_rectangle.java.lightweight;

public class Solution {
    public int solve(int A, int B, int C, int D) {
        if (A <= 0 || B <= 0 || C <= 0 || D <= 0) return 0;
        else {
            if ((A == B) && (C == D))
                return 1;
            else if ((A == C) && (B == D))
                return 1;
            else if ((A == D) && (B == C))
                return 1;
        }
        return 0;
    }
}