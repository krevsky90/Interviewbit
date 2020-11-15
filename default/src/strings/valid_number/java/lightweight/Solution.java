package strings.valid_number.java.lightweight;

public class Solution {
    public int isNumber(final String s) {
        int digits = 0, dots = 0, i = 0, n = s.length(), j = s.length() - 1;
        while (i < n && s.charAt(i) == ' ')
            i++;
        if (i == n)
            return 0;
        String a = s.substring(i);
        i = 0;
        n = a.length();
        if (i < n && s.charAt(i) == '-' || s.charAt(i) == '+')
            i++;
        if (a.length() == 0 || a == null)
            return 0;
        while ((a.charAt(i) >= '0' && a.charAt(i) <= '9') || a.charAt(i) == '.') {
            if (a.charAt(i) >= '0' && a.charAt(i) <= '9')
                digits++;
            else
                dots++;
            i++;
            if (i >= n)
                break;
        }
        if (digits < 1 || dots > 1 || a.charAt(i - 1) == '.') {
            return 0;
        }
        if (i < n && a.charAt(i) == 'e') {
            i++;
            if (i < n && a.charAt(i) == '-' || a.charAt(i) == '+')
                i++;
            if (i >= n)
                return 0;
            digits = 0;
            while ((a.charAt(i) >= '0' && a.charAt(i) <= '9')) {
                digits++;
                i++;
                if (i >= n)
                    break;
            }
            if (digits < 1)
                return 0;
        }
        while (i < n && a.charAt(i) == ' ')
            i++;
        return i == n ? 1 : 0;
    }
}