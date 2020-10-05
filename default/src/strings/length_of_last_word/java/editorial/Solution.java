package strings.length_of_last_word.java.editorial;

/**
 * the idea is to go from the end! and to return first word
 */
public class Solution {
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public int lengthOfLastWord(final String s) {
        int len = 0;

        int i = s.length()-1;
        while (i >= 0 && s.charAt(i) == ' ') {
            i--;
        }

        for (i=i; i>=0; i--) {
            if (s.charAt(i) == ' ') {
                return len;
            }
            len++;
        }

        return len;
    }
}