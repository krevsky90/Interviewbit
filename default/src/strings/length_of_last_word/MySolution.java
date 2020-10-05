package strings.length_of_last_word;

public class MySolution {
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public int lengthOfLastWord(final String A) {
        int lenA = A.length();

        int lenTemp = 0;
        int len = 0;
        for (int i = 0; i < lenA; i++) {
            if (A.charAt(i) == ' ') {
                if (lenTemp > 0) {
                    len = lenTemp;
                }
                lenTemp = 0;
            } else {
                lenTemp++;
            }
        }

        if (lenTemp > 0) {
            len = lenTemp;
        }

        return len;
    }
}
