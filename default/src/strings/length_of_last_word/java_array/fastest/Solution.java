package strings.length_of_last_word.java_array.fastest;

public class Solution {
    // DO NOT MODIFY THE ARGUMENTS WITH "final" PREFIX. IT IS READ ONLY
    public int lengthOfLastWord(final String A) {
        int lengthOfWord = 0;
        int i = A.length() - 1;
        while (i >= 0 && A.charAt(i) == ' ') {
            i--;
        }

        while (i >= 0 && A.charAt(i) != ' ') {
            i--;
            lengthOfWord++;
        }
        return lengthOfWord;
    }
}