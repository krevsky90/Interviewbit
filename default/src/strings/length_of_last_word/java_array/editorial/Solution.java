package strings.length_of_last_word.java_array.editorial;

public class Solution {
    // DO NOT MODIFY THE ARGUMENTS WITH "final" PREFIX. IT IS READ ONLY
    public int lengthOfLastWord(final String A) {
        int len = 0;

        if (A.length() == 1)
            return 1;

        for (int i = A.length() - 1; i >= 0; i--) {
            if (A.charAt(i) == ' ') {
                if (len != 0)
                    return len;
            } else
                len++;
        }
        return len;
    }
}