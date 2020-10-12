package strings.reverse_the_string.java.editorial;

public class Solution {
    public String solve(String a) {
        String[] words = a.split(" ");
        String res = "";
        for (int i = words.length - 1; i >= 0; i--) {
            res += words[i];
            if (words[i].length() > 0) res += " ";
        }
        return res.substring(0, res.length() - 1);
    }
}