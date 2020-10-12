package strings.reverse_the_string.java.fastest;

public class Solution {
    public String reverseWords(String a) {
        String[] words = a.split(" ");
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = words.length - 1; i >= 0; i--) {
            //NOTE: trim removes spaces in the begin and end of the string
            //i.e. eliminates leading and trailing spaces
            stringBuilder.append(words[i].trim());

            if (i != 0) {
                stringBuilder.append(" ");
            }
        }
        return stringBuilder.toString();
    }
}