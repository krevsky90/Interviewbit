package strings.convert_to_palindrome.java.editorial;

public class Solution {
    public int solve(String A) {
        if (A == null)
            return 1;
        int ans = 0;
        int n = A.length();
        int i = 0, j = n - 1;
        while (i <= j) {
            char c = A.charAt(i);
            char d = A.charAt(j);
            if (c == d) {
                i++;
                j--;
            } else {
                if (A.charAt(i + 1) == A.charAt(j)) {
                    i++;
                    ans++;
                } else if (A.charAt(j - 1) == A.charAt(i)) {
                    j--;
                    ans++;
                } else
                    return 0;
            }
        }
        if (ans <= 1)
            return 1;
        else
            return 0;
    }
}
