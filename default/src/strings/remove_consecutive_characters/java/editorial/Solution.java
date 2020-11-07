package strings.remove_consecutive_characters.java.editorial;

public class Solution {
    public String solve(String A, int B) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < A.length(); i++) {
            int count = 1;
            while (i < A.length() - 1 && A.charAt(i) == A.charAt(i + 1)) {
                count++;
                i++;
            }
            if (count == B) {
                continue;
            }

            sb.append(A.charAt(i));
        }

        return sb.toString();
    }
}