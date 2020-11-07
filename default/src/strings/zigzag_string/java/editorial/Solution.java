package strings.zigzag_string.java.editorial;

public class Solution {
    public String convert(String s, int numRows) {
        if (numRows == 1) {
            return s;
        }

        String[] dp = new String[numRows];
        for (int i = 0; i < dp.length; i++) {
            dp[i] = "";
        }

        int j = 0;
        boolean check = true;
        for (int i = 0; i < s.length(); i++) {
            dp[j] += s.charAt(i);
            if (check) {
                if (j == dp.length - 1) {
                    j--;
                    check = false;
                } else {
                    j++;
                }
            } else {
                if (j == 0) {
                    j++;
                    check = true;
                } else {
                    j--;
                }
            }
        }


        String ans = "";
        for (int i = 0; i < dp.length; i++) {
            // System.out.println(dp[i]);
            ans += dp[i];
        }
        return ans;
    }
}