package strings.minimum_parantheses.java.fastest;

public class Solution {
    public int solve(String A) {
        int balance = 0;
        int close = 0;

        for (char c : A.toCharArray()) {

            balance += c == '(' ? 1 : -1;

            if (balance == -1) {
                close++;
                balance++;
            }
        }

        return Math.abs(balance + close);
    }
}
