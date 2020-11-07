package strings.convert_to_palindrome.java.lightweight;

public class Solution {
    public int solve(String A) {
        int l = 0, r = A.length() - 1, count = 0;
        int recheck = 0, recheckl = 0, recheckr = 0;
        while (l <= r) {
            char left = A.charAt(l);
            char right = A.charAt(r);
            if (left == right) {
                l++;
                r--;
                continue;
            } else if (recheck == 0) {
                recheckl = l;
                recheckr = r;
                l++;
                recheck++;
                continue;
            } else if (recheck == 1) {
                l = recheckl;
                r = recheckr;
                r--;
                recheck++;
                continue;
            } else if (recheck == 2) {
                return 0;
            }
        }
        return 1;
    }
}