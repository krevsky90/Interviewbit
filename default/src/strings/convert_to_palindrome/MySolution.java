package strings.convert_to_palindrome;

public class MySolution {
    public int solve(String A) {
        for (int i = 0; i < A.length(); i++) {
            if (isPalindromeWithRemovedIthElement(A, i)) {
                return 1;
            }
        }

        return 0;

    }

    public boolean isPalindromeWithRemovedIthElement(String A, int i) {
        String rectrictedA = A.substring(0,i) + A.substring(i+1);
        StringBuilder sb = new StringBuilder(rectrictedA);
        String s1 = sb.toString();
        String s2 = sb.reverse().toString();
        if (s1.equals(s2)) {
            return true;
        } else {
            return false;
        }
    }
}
