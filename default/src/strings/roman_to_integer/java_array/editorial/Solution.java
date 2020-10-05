package strings.roman_to_integer.java_array.editorial;

public class Solution {
    public int romanToInt(String A) {
        int[] num = new int[A.length()];

        for (int i = 0; i < A.length(); i++) {
            switch (A.charAt(i)) {
                case 'M':
                    num[i] = 1000;
                    break;
                case 'D':
                    num[i] = 500;
                    break;
                case 'C':
                    num[i] = 100;
                    break;
                case 'L':
                    num[i] = 50;
                    break;
                case 'X':
                    num[i] = 10;
                    break;
                case 'V':
                    num[i] = 5;
                    break;
                case 'I':
                    num[i] = 1;
                    break;
            }
        }
        int ans = 0;

        for (int i = 0; i < num.length - 1; i++) {
            if (num[i] < num[i + 1]) {
                ans -= num[i];
            } else {
                ans += num[i];
            }
        }

        return ans + num[num.length - 1];
    }
}