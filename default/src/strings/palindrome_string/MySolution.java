package strings.palindrome_string;

/**
 * use http://www.asciitable.com/
 *
 * USE Character.isLetterOrDigit(char c)
 */
public class MySolution {
    public class Solution {
        public int isPalindrome(String A) {
            if (A.isEmpty()) {
                return 1;
            }

            String lowerS = A.toLowerCase();
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < lowerS.length(); i++) {
                if (
                        Character.isLetterOrDigit(lowerS.charAt(i))
//                        (lowerS.charAt(i) >= 97 && lowerS.charAt(i) <= 122)
//                                ||
//                                (lowerS.charAt(i) >= 48 && lowerS.charAt(i) <= 57)
                ) {
                    sb.append(lowerS.charAt(i));
                }
            }

            String s1 = sb.toString();
            String s2 = sb.reverse().toString();

            if (s1.equals(s2)) {
                return 1;
            } else {
                return 0;
            }
        }
    }
}
