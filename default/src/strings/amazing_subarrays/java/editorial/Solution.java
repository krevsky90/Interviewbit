package strings.amazing_subarrays.java.editorial;

public class Solution {
    public int solve(String A) {
        int len = A.length();
        int count = 0;
        for (int i = 0; i < len; i++) {
            if (A.charAt(i) == 'A' ||
                    A.charAt(i) == 'E' ||
                    A.charAt(i) == 'I' ||
                    A.charAt(i) == 'O' ||
                    A.charAt(i) == 'U' ||
                    A.charAt(i) == 'a' ||
                    A.charAt(i) == 'e' ||
                    A.charAt(i) == 'i' ||
                    A.charAt(i) == 'o' ||
                    A.charAt(i) == 'u') {
                count = (count + ((len - i) % 10003)) % 10003;
            }
        }
        return count;
    }
}