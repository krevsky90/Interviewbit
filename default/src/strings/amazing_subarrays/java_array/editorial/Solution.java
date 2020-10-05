package strings.amazing_subarrays.java_array.editorial;

public class Solution {
    public int solve(String A) {

        int len = A.length();
        int ans = 0;
        String t = "aeiouAEIOU";
        for (int i = 0; i < len; i++) {
            boolean bool = t.contains((Character.toString(A.charAt(i))));
            if (bool) {
                ans = ans + (len - i);
            }
        }

        return (ans % 10003);
    }
}