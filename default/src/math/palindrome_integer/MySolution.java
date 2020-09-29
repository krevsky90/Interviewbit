package math.palindrome_integer;

public class MySolution {
    public int isPalindrome(int A) {
        if (A < 0) {
            return 0;
        }

        String sA = String.valueOf(A);
        int start = 0;
        int end = sA.length() - 1;
        while (start < end) {
            if (sA.charAt(start) != sA.charAt(end)) {
                return 0;
            }

            start++;
            end--;
        }

        return 1;
    }
}
