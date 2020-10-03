package math.reverse_integer.java.fastest;

public class Solution {
    public int reverse(int a) {
        String s = a + "";
        int neg = 0;
        StringBuilder newString = new StringBuilder(s);
        if (newString.charAt(0) == '-') {
            neg = 1;
            newString.deleteCharAt(0);
        }

        long number = Long.parseLong(newString.reverse().toString());

        if (number > Integer.MAX_VALUE)
            return 0;

        return (int) number * (int) Math.pow(-1, neg);
    }
}
