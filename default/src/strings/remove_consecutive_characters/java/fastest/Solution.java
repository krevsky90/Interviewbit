package strings.remove_consecutive_characters.java.fastest;

public class Solution {
    public String solve(String A, int B) {
        if (A.length() == 0) {
            return "";
        }
        A = A + " ";    //that means the last symbol " " differs from the last symbol of initial String A
        char c = A.charAt(0);
        int count = 0;
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < A.length(); i++) {
            if (A.charAt(i) == c) {
                count++;
            } else {
                if (count != B) {
                    for (int j = 0; j < count; j++) {
                        builder.append(c);
                    }
                }
                c = A.charAt(i);
                count = 1;
            }
        }
        return builder.toString();
    }
}
