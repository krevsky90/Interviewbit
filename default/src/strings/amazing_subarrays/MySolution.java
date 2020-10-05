package strings.amazing_subarrays;

import java.util.Arrays;
import java.util.List;

/**
 * good idea - to use String t = "aeiouAEIOU";
 */
public class MySolution {
    public int solve(String A) {
        List<Character> vowels = Arrays.asList('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U');
        int lenA = A.length();

        int result = 0;

        for (int i = 0; i < lenA; i++) {
            if (vowels.contains(A.charAt(i))) {
                result += lenA - i;
                result = result % 10003;
            }
        }

        return result;
    }
}
