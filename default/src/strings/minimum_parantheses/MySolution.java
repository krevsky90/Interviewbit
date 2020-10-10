package strings.minimum_parantheses;

public class MySolution {
    public int solve(String A) {
        int result = 0;
        int delta = 0;
        for (int i = 0; i < A.length(); i++) {
            if ('(' == A.charAt(i)) {
                delta++;
            } else if (')' == A.charAt(i)) {
                if (delta <= 0) {
                    result++;
                } else {
                    delta--;
                }
            }
        }

        return result + delta;
    }
}
